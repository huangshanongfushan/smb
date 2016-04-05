package com.duplicall.mapper;

import com.duplicall.model.Call;
import com.duplicall.model.CallExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CallMapper {
    int countByExample(CallExample example);

    int deleteByExample(CallExample example);

    int deleteByPrimaryKey(String referenceId);

    int insert(Call record);

    int insertSelective(Call record);

    List<Call> selectByExample(CallExample example);

    Call selectByPrimaryKey(String referenceId);

    int updateByExampleSelective(@Param("record") Call record, @Param("example") CallExample example);

    int updateByExample(@Param("record") Call record, @Param("example") CallExample example);

    int updateByPrimaryKeySelective(Call record);

    int updateByPrimaryKey(Call record);

    List<Call> selectByExtension(long currentMill, int dmill, int period, String extension);
}