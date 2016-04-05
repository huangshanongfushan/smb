package com.duplicall;

import com.duplicall.common.constant.SystemConstant;
import com.duplicall.mapper.CallMapper;
import com.duplicall.mapper.MediaMapper;
import com.duplicall.mapper.TargetMapper;
import com.duplicall.model.Call;
import com.duplicall.model.Media;
import com.duplicall.model.MediaExample;
import com.duplicall.model.Target;
import com.duplicall.pojo.TargetCustom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * Created by raymond on 2016/3/28.
 */
@Component
public class RunApplication {
    @Resource
    private TargetMapper targetMapper;
    @Resource
    private CallMapper callMapper;
    @Resource
    private MediaMapper mediaMapper;
    private static Logger logger = LoggerFactory.getLogger(RunApplication.class);

    public void work() throws Exception {
        try {
            List<Target> targetList = targetMapper.selectAllTargets();
            if (targetList == null || targetList.size() < 1) {
                logger.warn("No targets be found from the database");
                return;
            }
            for (Target target : targetList) {
                String extension = target.getName();
                Integer period = ((TargetCustom) target).getRetentionPolicy().getPeriod();
                if (period == 0) {
                    logger.info("Records of target {} does not need to be deleted", extension);
                    continue;
                }
                List<Call> callList = callMapper.selectByExtension(System.currentTimeMillis(), SystemConstant.DTIME, period, extension);
                if (callList == null || callList.size() < 1) {
                    logger.info("No records to be deleted");
                    break;
                }
                Iterator<Call> callIterator = callList.iterator();
                while (callIterator.hasNext()) {
                    Call call = callIterator.next();
                    MediaExample mediaExample = new MediaExample();
                    mediaExample.or().andReferenceIdEqualTo(call.getReferenceId());
                    List<Media> mediaList = mediaMapper.selectByExample(mediaExample);
                    if (mediaList == null || mediaList.size() < 1) {
                        logger.info("No media information which reference id is {}", call.getReferenceId());
                        continue;
                    }
                    Media media = mediaList.get(0);
                    //删除操作
                    deleteRecord(call.getReferenceId());
                    deleteMedia(media);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("get targets error");
            logger.error(e.getMessage());
        }
    }

    /**
     * 删除指定Call录音数据
     *
     * @param referenceId
     */
    private void deleteRecord(String referenceId) {
        //reference Id 为空
        if (referenceId == null || referenceId.length() < 1) {
            logger.error("Referenceid is null ");
            return;
        }
        try {
            callMapper.deleteByPrimaryKey(referenceId);
            logger.info("Call {} has ben deleted", referenceId);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Delete call {} error", referenceId);
            logger.error(e.getMessage());
        }
    }

    private void deleteMedia(Media media) {
        if (media == null) {
            logger.warn("Media is null");
            return;
        }
        String path = media.getPath();
        String shortName0 = media.getShortName0();
        String shortName1 = media.getShortName1();
        //media 路径为空

        String mediaPath0 = String.format("%s%s", path, shortName0);
        String mediaPath1 = String.format("%s%s", path, shortName1);

        deleteFile(mediaPath0);
        deleteFile(mediaPath1);

    }

    /**
     * 删除指定文件
     *
     * @param filePath
     */
    private void deleteFile(String filePath) {
        if (filePath == null || filePath.length() < 1) {
            logger.warn("Media  path is null");
            return;
        }
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
            logger.info("Delete file {} success", filePath);
        } else {
            logger.warn("File {} dose not exists", filePath);
        }
    }


}
