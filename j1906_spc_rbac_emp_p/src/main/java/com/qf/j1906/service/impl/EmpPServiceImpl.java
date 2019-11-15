package com.qf.j1906.service.impl;

import com.qf.j1906.mapper.EmpMapper;
import com.qf.j1906.pojo.Emp;
import com.qf.j1906.service.EmpPService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 刘旭
 * Date: 2019/11/14 14:38
 * @Version 1.0
 */
@Service
public class EmpPServiceImpl implements EmpPService {
    @Resource
    private EmpMapper empMapper;

    @Override
    public Emp insertEmp(Emp emp) {
        int i=empMapper.insertEmp(emp);
        if (i>0){
            return emp;
        }
        return null;
    }
}
