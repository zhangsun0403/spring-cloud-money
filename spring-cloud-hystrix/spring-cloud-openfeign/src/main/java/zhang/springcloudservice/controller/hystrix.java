package zhang.springcloudservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zhang.springcloudservice.service.serviceHystrix;

@RestController
public class hystrix {


    @Autowired
    serviceHystrix serviceHystrix;

    @GetMapping("/ok/{id}")
    public String ok(@PathVariable("id") Integer id){

        String ok = serviceHystrix.ok(id);

        return ok;
    }

    @GetMapping("/no/{id}")
    public String ON(@PathVariable("id")Integer id) throws InterruptedException {

        String no = serviceHystrix.timeOut(id);

        return no;
    }


}
