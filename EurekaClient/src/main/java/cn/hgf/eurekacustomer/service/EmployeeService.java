package cn.hgf.eurekacustomer.service;


import cn.hgf.eurekacustomer.dao.EmployeeDao;
import cn.hgf.eurekacustomer.entity.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: FanYing
 * @Date: 2018-05-20 20:07
 * @Desciption:
 */
@Service
public class EmployeeService {

    @Resource
    EmployeeDao employeeDao;

    public void insertEmployee(Employee employee){
         employeeDao.save(employee);
    }


    public void deleteEmployee(Integer employeeId){
         employeeDao.deleteEmployee(employeeId);
    }

    public Employee getById(int id){
        return employeeDao.get(id);
    }
}
