package zhang.springcloudxiaofei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import zhang.springcloudxiaofei.Entity.Message;
import zhang.springcloudxiaofei.Entity.Result;

import javax.ws.rs.GET;

@RestController
public class hellocontrooler {

    private String path="http://localhost:8888";


    @Autowired
    RestTemplate RestTemplate;


    @GetMapping("/sch/{id}")
    public Result result(@PathVariable("id") Integer id){

        return RestTemplate.getForObject(path+"/select/"+id,Result.class);

    }

    @GetMapping("/int")
    public Integer insert(Message Message){

        return RestTemplate.postForObject(path+"/insert",Message,Integer.class);

    }
    @GetMapping("/dt/{id}")
    public Integer delete(@PathVariable("id") Integer id){

        return RestTemplate.getForObject(path+"/delete/"+id,Integer.class);

    }

}
