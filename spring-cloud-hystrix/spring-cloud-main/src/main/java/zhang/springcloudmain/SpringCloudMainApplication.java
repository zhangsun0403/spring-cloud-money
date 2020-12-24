package zhang.springcloudmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //这是开启微服务服务器的注册注解
public class SpringCloudMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMainApplication.class, args);
	}

}
