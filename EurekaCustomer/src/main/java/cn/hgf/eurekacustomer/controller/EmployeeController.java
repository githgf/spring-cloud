package cn.hgf.eurekacustomer.controller;


import cn.hgf.eurekacustomer.EmployeeCustomerService;
import cn.hgf.eurekacustomer.entity.Employee;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
 * @Author: FanYing
 * @Date: 2018-05-02 16:43
 * @Desciption:
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getById/{id}")
    public Employee getEmployee(@PathVariable("id") String id){
        return restTemplate.getForObject( "http://SERVICE-PROVIDE-A/employee/getById?id=" + id,Employee.class);
    }

    @Resource
    EmployeeCustomerService employeeCustomerService;

    @GetMapping("/test")
    @HystrixCommand(fallbackMethod = "hystrixMethod")
    public String test(){

        return employeeCustomerService.test();
    }

    @GetMapping("/getName")
    public String getName(){
        return employeeCustomerService.getName();
    }

    public String hystrixMethod(){
        return "error";
    }

}
