package com.solace.mapper;

import com.solace.pojo.DepartRole;
import com.solace.pojo.DepartRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartRoleMapper {
    int countByExample(DepartRoleExample example);

    int deleteByExample(DepartRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(DepartRole record);

    int insertSelective(DepartRole record);

    List<DepartRole> selectByExample(DepartRoleExample example);

    DepartRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DepartRole record, @Param("example") DepartRoleExample example);

    int updateByExample(@Param("record") DepartRole record, @Param("example") DepartRoleExample example);

    int updateByPrimaryKeySelective(DepartRole record);

    int updateByPrimaryKey(DepartRole record);
}