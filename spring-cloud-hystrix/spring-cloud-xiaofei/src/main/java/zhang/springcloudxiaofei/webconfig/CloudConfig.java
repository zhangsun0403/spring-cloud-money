package zhang.springcloudxiaofei.webconfig;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CloudConfig {

    @Bean
    public RestTemplate RestTemplate(){

        return new RestTemplate();
    }


}
