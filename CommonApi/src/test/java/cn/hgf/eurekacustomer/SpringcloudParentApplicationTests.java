package cn.hgf.eurekacustomer;

import cn.hgf.eurekacustomer.config.ConfigClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.cloud.config.client.ConfigClientAutoConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudParentApplicationTests {

	@Autowired
	ConfigClient configClient;

	@Test
	public void contextLoads() {

		System.out.println(configClient.name);
	}

}
