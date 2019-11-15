package com.qf.j1906.controller;

import com.qf.j1906.pojo.Emp;
import com.qf.j1906.service.EmpCService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: 刘旭
 * Date: 2019/11/14 16:55
 * @Version 1.0
 */
@Slf4j
@Controller
public class EmpCController {
    @Autowired
    private EmpCService empService;
    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    @ResponseBody
    public Emp addEmp(Emp emp){
        log.info("=======================add:"+emp);
        Emp emp1 = empService.addEmp(emp);
        return emp1;
    }
}
