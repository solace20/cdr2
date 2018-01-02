package com.solace.mapper;

import com.solace.pojo.Depart;
import com.solace.pojo.DepartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartMapper {
    int countByExample(DepartExample example);

    int deleteByExample(DepartExample example);

    int deleteByPrimaryKey(String departId);

    int insert(Depart record);

    int insertSelective(Depart record);

    List<Depart> selectByExample(DepartExample example);

    Depart selectByPrimaryKey(String departId);

    int updateByExampleSelective(@Param("record") Depart record, @Param("example") DepartExample example);

    int updateByExample(@Param("record") Depart record, @Param("example") DepartExample example);

    int updateByPrimaryKeySelective(Depart record);

    int updateByPrimaryKey(Depart record);
}