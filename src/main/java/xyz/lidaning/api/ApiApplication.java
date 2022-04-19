package xyz.lidaning.api;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import xyz.lidaning.api.db.DBUtils;

import java.util.Map;

/**
 * @author Administrator
 * @since 2021-11-22
 */
@MapperScan({"xyz.lidaning.**.mapper"})
@SpringBootApplication
public class ApiApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ApiApplication.class, args);
    }
}
