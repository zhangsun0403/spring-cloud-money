package zhang.springcloudservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import zhang.springcloudservice.Entity.Message;
import zhang.springcloudservice.Entity.Result;

@Component
@Mapper
public interface CloudMybatis {


    public Result selectLai(Integer id);

    public void insertLai(Message Message);

    public void deleteLai(Integer id);
}
