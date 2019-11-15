package com.qf.j1906.controller;

import com.qf.j1906.pojo.Dept;
import com.qf.j1906.service.DeptCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: 刘旭
 * Date: 2019/11/14 10:48
 * @Version 1.0
 */
@Controller
public class DeptCController {
    @Autowired
    private DeptCService deptCService;
    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public String showAll(Model model){
        List<Dept> depts = deptCService.findDepts();
        model.addAttribute("depts",depts);
        return "depts";
    }
}
