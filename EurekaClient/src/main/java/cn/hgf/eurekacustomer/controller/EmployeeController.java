package cn.hgf.eurekacustomer.controller;


import cn.hgf.eurekacustomer.entity.Employee;
import cn.hgf.eurekacustomer.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: FanYing
 * @Date: 2018-05-02 16:43
 * @Desciption:
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    @Autowired
    Environment environment;

    @GetMapping("/getById")
    public Employee getById(@RequestParam Integer id){
        return employeeService.getById(id);
    }

    @GetMapping("/test")
    public String test(){
        String string = "test success!!!" + environment.getProperty("server.port");
        System.out.println(string);
        return string;
    }

    @Value("${name}")
    private  String name;

    @GetMapping("/getName")
    public String getName(){
        System.out.println(environment.getProperty("server.port") + "========>" +name);
        return environment.getProperty("server.port") + "=========>" + name;
    }

}
