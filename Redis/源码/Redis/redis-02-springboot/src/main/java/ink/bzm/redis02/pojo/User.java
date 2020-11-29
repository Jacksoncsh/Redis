package ink.bzm.redis02.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author: buzhengmiao    www.bzm.ink
 * @time: 2020/5/13 17:07
 */
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
//在企业中所有的pojo对象都会序列化
public class User implements Serializable {
    private String name;
    private int age;
}
