package xyz.lidaning.db;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@ConditionalOnProperty(value="lidaning.api.dbutil.enable", havingValue="true")
//@ConditionalOnClass({DataSource.class})
public class DBUtilsConfiguration {

    @Bean
    public DBUtils dbUtils(JdbcTemplate jdbcTemplate){
        return new DBUtils(jdbcTemplate);
    }
}
