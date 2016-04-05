package com.duplicall.mapper;

import com.duplicall.model.Media;
import com.duplicall.model.MediaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MediaMapper {
    int countByExample(MediaExample example);

    int deleteByExample(MediaExample example);

    int insert(Media record);

    int insertSelective(Media record);

    List<Media> selectByExample(MediaExample example);

    int updateByExampleSelective(@Param("record") Media record, @Param("example") MediaExample example);

    int updateByExample(@Param("record") Media record, @Param("example") MediaExample example);
}