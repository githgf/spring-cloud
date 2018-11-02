package cn.hgf.eurekacustomer.config;

import cn.hgf.eurekacustomer.EmployeeCustomerService;
import org.springframework.stereotype.Component;

/**
 * @author gaofan
 * @date 2018-11-02 14:59
 */
@Component
public class SchedualServiceHiHystric implements EmployeeCustomerService {
    @Override
    public String test() {
        return "error: test()";
    }

    @Override
    public String getName() {
        return "error: getName()";
    }
}
