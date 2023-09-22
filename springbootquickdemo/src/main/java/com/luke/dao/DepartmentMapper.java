package com.luke.dao;

import com.luke.entity.Department;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentMapper {

    @Select("select * from t_dept where deptno=#{deptno}")
    Department findById(Integer deptno);
}
