package com.qf.j1906.service;

import com.qf.j1906.pojo.Emp;
import com.qf.j1906.service.impl.EmpCServiceError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: 刘旭
 * Date: 2019/11/14 16:51
 * @Version 1.0
 */
@FeignClient(value = "service-emp-p",fallback = EmpCServiceError.class)
public interface EmpCService {
    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    public Emp addEmp(Emp emp);
}
