package com.luke.controller;

import com.luke.entity.Department;
import com.luke.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/prefix")
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;

    @GetMapping("/g")
    public String show(@RequestParam("id") Integer id) {
        Department department = departmentService.findById(id);
        return department.toString();
    }
}
