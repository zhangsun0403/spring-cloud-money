package zhang.springcloudxiaofei.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import zhang.springcloudxiaofei.Entity.Message;
import zhang.springcloudxiaofei.Entity.Result;
@Component
@FeignClient(name = "spring-cloud-service")
public interface feign {

    @GetMapping("/select/{id}")
    public Result select(@PathVariable("id") Integer id);//和服务调用对象的方法头一定要保持一致

    @PostMapping("/insert")
    public Integer insert(@RequestBody Message Message);


    @GetMapping("/delete/{id}")
    public Integer delete(@PathVariable("id") Integer id);




}
