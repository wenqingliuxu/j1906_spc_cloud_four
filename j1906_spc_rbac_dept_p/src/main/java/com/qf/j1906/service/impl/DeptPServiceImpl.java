package com.qf.j1906.service.impl;

import com.qf.j1906.mapper.DeptMapper;
import com.qf.j1906.pojo.Dept;
import com.qf.j1906.pojo.DeptExample;
import com.qf.j1906.service.DeptPService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 刘旭
 * Date: 2019/11/14 10:33
 * @Version 1.0
 */
@Service("deptPService")
public class DeptPServiceImpl implements DeptPService {
    @Resource
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findDepts() {
        DeptExample example = new DeptExample();
        List<Dept> depts = deptMapper.selectByExample(example);
        return depts;
    }
}
