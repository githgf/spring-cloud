package cn.hgf.eurekacustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
	服务消费者
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
//启动熔断器
@EnableHystrix
public class EurekaCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCustomerApplication.class, args);
	}
}