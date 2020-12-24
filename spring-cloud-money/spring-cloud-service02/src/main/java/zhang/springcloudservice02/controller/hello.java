package zhang.springcloudservice02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {


    @Value("${server.port}")
    private String port;
    @GetMapping("/nb/pp/{id}")
    public String pp(@PathVariable("id") String id){

        return "hello"+port+"pp";
    }
    @GetMapping("/nb")
    public String pp0(String id){

        return "hello"+port+"pp";
    }
}
