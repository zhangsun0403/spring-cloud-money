package zhang.springcloudservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhang.springcloudservice.Entity.Message;
import zhang.springcloudservice.Entity.Result;
import zhang.springcloudservice.mapper.CloudMybatis;

@Service
@Slf4j
public class serviceDao {

    @Autowired
    CloudMybatis CloudMybatis;

    public Result select(Integer id){

        Result result = CloudMybatis.selectLai(id);

        return result;
    }

    public Integer insert(Message Message){

        CloudMybatis.insertLai(Message);

        return Message.getId();

    }


    public Integer delete(Integer id){
        CloudMybatis.deleteLai(id);

        log.info("已经删除xu"+id);
        return id;
    }

}
