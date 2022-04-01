package xyz.lidaning.api.db;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@ConditionalOnClass({DataSource.class})
@Configuration
public class DbAutoConfiguration {

    @Bean
    public DBUtils dbUtils(JdbcTemplate jdbcTemplate){
        return new DBUtils(jdbcTemplate);
    }
}
