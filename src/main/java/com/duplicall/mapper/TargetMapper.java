package com.duplicall.mapper;

import com.duplicall.model.Target;
import com.duplicall.model.TargetExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TargetMapper {
    int countByExample(TargetExample example);

    int deleteByExample(TargetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Target record);

    int insertSelective(Target record);

    List<Target> selectByExample(TargetExample example);

    Target selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Target record, @Param("example") TargetExample example);

    int updateByExample(@Param("record") Target record, @Param("example") TargetExample example);

    int updateByPrimaryKeySelective(Target record);

    int updateByPrimaryKey(Target record);

    List<Target> selectAllTargets();
}