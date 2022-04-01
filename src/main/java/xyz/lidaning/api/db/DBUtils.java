package xyz.lidaning.api.db;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class DBUtils {
    public DBUtils(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    private static JdbcTemplate jdbcTemplate;

    public static <T> List<T> getObjList(String sql, Class<T> t) {
        RowMapper<T> rm = BeanPropertyRowMapper.newInstance(t);
        return jdbcTemplate.query(sql, rm);
    }

    public static JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public static void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        DBUtils.jdbcTemplate = jdbcTemplate;
    }
}
