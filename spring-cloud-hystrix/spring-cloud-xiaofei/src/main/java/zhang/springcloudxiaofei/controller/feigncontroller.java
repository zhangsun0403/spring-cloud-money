package zhang.springcloudxiaofei.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import zhang.springcloudxiaofei.Entity.Message;
import zhang.springcloudxiaofei.Entity.Result;
import zhang.springcloudxiaofei.openfeign.oktest;
import zhang.springcloudxiaofei.openfeign.feign;

@RestController
public class feigncontroller {


    @Autowired
    oktest oktest;

    @GetMapping("/ok/{id}")
    public String ok(@PathVariable("id") Integer id){

        return oktest.ok(id);
    }

    @GetMapping("/no/{id}")
    @HystrixCommand(fallbackMethod = "one",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String ON(@PathVariable("id")Integer id) throws InterruptedException{

        return oktest.ON(id);
    }
    public String one(@PathVariable("id")Integer id) throws InterruptedException{

        return "80 对方在忙，请看会电影，稍后在试试";
    }


}
