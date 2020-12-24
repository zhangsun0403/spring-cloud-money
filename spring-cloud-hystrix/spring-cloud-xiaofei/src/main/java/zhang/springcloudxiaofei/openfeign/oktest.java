package zhang.springcloudxiaofei.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Component
@FeignClient(name="spring-cloud-openfeign")
public interface oktest {


    @GetMapping("/ok/{id}")
    public String ok(@PathVariable("id") Integer id);

    @GetMapping("/no/{id}")
    public String ON(@PathVariable("id")Integer id) throws InterruptedException;
}
