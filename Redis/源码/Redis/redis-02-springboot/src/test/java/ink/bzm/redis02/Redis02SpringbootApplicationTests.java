package ink.bzm.redis02;

import com.fasterxml.jackson.core.JsonProcessingException;
import ink.bzm.redis02.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Redis02SpringbootApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        //获取连接对象
        RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
        System.out.println(connection.ping());

        redisTemplate.opsForValue().set("name","bzm");
        System.out.println(redisTemplate.opsForValue().get("name"));

    }

    @Test
    void test() throws JsonProcessingException {
        //真实开发，一般使用json来传递对象
        User user = new User("Bzm", 18);
//        String jsonUser = new ObjectMapper().writeValueAsString(user);
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

}
