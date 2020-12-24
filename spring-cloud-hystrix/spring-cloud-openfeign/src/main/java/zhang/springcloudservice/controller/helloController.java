package zhang.springcloudservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zhang.springcloudservice.Entity.Message;
import zhang.springcloudservice.Entity.Result;
import zhang.springcloudservice.service.serviceDao;

@RestController
public class helloController {

    @Autowired
    serviceDao serviceDao;


    @GetMapping("/select/{id}")
    public Result select(@PathVariable("id") Integer id){


        return serviceDao.select(id);

    }

    @PostMapping("/insert")
    public Integer insert(@RequestBody Message Message){


        return serviceDao.insert(Message);

    }
    @GetMapping("/delete/{id}")
    public Integer delete(@PathVariable("id") Integer id){


        return serviceDao.delete(id);

    }

}
