package cn.hgf.eurekacustomer;

import cn.hgf.eurekacustomer.config.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author gaofan
 * @date 2018-11-01 17:43
 */

@FeignClient(value = "service-provide-a",fallback = SchedualServiceHiHystric.class)
@Service
public interface EmployeeCustomerService {

    @GetMapping("/employee/test")
    String test();

    @GetMapping("/employee/getName")
    String getName();
}
