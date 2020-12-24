package zhang.springcloudservice;

import com.netflix.discovery.converters.Auto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zhang.springcloudservice.Entity.Message;
import zhang.springcloudservice.Entity.Result;
import zhang.springcloudservice.mapper.CloudMybatis;

@SpringBootTest
class SpringCloudServiceApplicationTests {

	@Autowired
	CloudMybatis CloudMybatis;

	@Test
	void contextLoads() {

		CloudMybatis.deleteLai(336);
	}

}
