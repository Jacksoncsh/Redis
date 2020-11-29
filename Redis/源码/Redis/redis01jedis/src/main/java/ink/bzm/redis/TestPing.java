package ink.bzm.redis;

import redis.clients.jedis.Jedis;

/**
 * @author: buzhengmiao    www.bzm.ink
 * @time: 2020/5/13 11:50
 */
public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.200.40", 6379);
        System.out.println(jedis.ping());
    }
}
