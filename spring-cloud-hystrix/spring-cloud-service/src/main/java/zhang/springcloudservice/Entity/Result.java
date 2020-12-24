package zhang.springcloudservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Result<T> {

    private Integer id;
    private String name;
    private T      result;

    public Result(Integer id,String name){

        this(id,name,null);
    }

}
