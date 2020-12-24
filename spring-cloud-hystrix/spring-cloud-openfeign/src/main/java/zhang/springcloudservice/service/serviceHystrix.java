package zhang.springcloudservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.stereotype.Service;

@Service
public class serviceHystrix {

    public String ok(Integer id){

        return Thread.currentThread().getName()+"     O(∩_∩)O "+id+"/////////////////////ok";
    }








    @HystrixCommand(fallbackMethod = "zjk",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")})
    public String timeOut(Integer id) throws InterruptedException {
        int a=10/0;

        Thread.sleep(2000);

        return Thread.currentThread().getName()+"TIMEOUT**********************";
    }

    public String zjk(Integer id) {

        return "服务忙，请稍后在试 9000 "+id;
    }
  }
