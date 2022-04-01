package xyz.lidaning.api.db;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

public class DBUtilsAutoConfiguration {

    @Bean
    public DBUtils dbUtils(JdbcTemplate jdbcTemplate){
        return new DBUtils(jdbcTemplate);
    }
}
