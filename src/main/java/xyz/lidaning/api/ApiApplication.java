package xyz.lidaning.api;


import lombok.extern.slf4j.Slf4j;
// import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Administrator
 * @since 2021-11-22
 */
@Slf4j
// @MapperScan({"xyz.lidaning.**.mapper"})
// @ComponentScan("xyz.lidaning")
@SpringBootApplication
public class ApiApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ApiApplication.class, args);
    }
}
