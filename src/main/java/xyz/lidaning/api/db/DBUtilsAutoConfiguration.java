package xyz.lidaning.api.db;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@ConditionalOnClass({DataSource.class})
public class DBUtilsAutoConfiguration {

    @Bean
    public DBUtils dbUtils(JdbcTemplate jdbcTemplate){
        return new DBUtils(jdbcTemplate);
    }
}
