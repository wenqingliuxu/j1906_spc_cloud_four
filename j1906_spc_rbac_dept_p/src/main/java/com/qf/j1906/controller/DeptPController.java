package com.qf.j1906.controller;

import com.qf.j1906.pojo.Dept;
import com.qf.j1906.service.DeptPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 刘旭
 * Date: 2019/11/14 10:30
 * @Version 1.0
 */
@RestController
public class DeptPController {
    @Autowired//按类型搜素bean对象；如果需要按照名称搜素，需要借助@Qualifer注解
    @Qualifier(value = "deptPService")
    private DeptPService deptPService;
    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public List<Dept> findAll(){
        List<Dept> depts = deptPService.findDepts();
        return depts;
    }

}
