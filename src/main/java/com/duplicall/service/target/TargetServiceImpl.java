package com.duplicall.service.target;

import com.duplicall.mapper.TargetMapper;
import com.duplicall.model.Target;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by raymond on 2016/3/28.
 */
@Service
public class TargetServiceImpl implements ITargetService {
    @Resource
    private TargetMapper targetMapper;

    @Override
    public List<Target> selectAllTargetList() throws Exception {
        List<Target> targetList = targetMapper.selectAllTargets();
        return targetList;
    }
}
