package com.luke.service;

import com.luke.dao.DepartmentMapper;
import com.luke.entity.Department;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    public Department findById(Integer id) {
        return departmentMapper.findById(id);
    }
}
