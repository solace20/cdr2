package com.solace.mapper;

import com.solace.pojo.PowerMenu;
import com.solace.pojo.PowerMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerMenuMapper {
    int countByExample(PowerMenuExample example);

    int deleteByExample(PowerMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(PowerMenu record);

    int insertSelective(PowerMenu record);

    List<PowerMenu> selectByExample(PowerMenuExample example);

    PowerMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PowerMenu record, @Param("example") PowerMenuExample example);

    int updateByExample(@Param("record") PowerMenu record, @Param("example") PowerMenuExample example);

    int updateByPrimaryKeySelective(PowerMenu record);

    int updateByPrimaryKey(PowerMenu record);
}