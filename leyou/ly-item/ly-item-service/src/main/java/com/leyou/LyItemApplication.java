package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName LyItemService
 * @Description TODO
 * @Author qiuyanxin
 * @Date 2019/12/10 17:13
 * @Version
 **/
@SpringBootApplication
@EnableEurekaServer
@MapperScan("com.leyou.item.mapper")
public class LyItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyItemApplication.class);
    }
}
