package com.qf.j1906.service.impl;

import com.qf.j1906.pojo.Emp;
import com.qf.j1906.service.EmpCService;
import org.springframework.stereotype.Component;

/**
 * @Author: 刘旭
 * Date: 2019/11/14 16:53
 * @Version 1.0
 */
@Component
public class EmpCServiceError implements EmpCService {
    @Override
    public Emp addEmp(Emp emp) {
        emp.setEmpno(-1);
        return null;
    }
}
