package xyz.lidaning.api.db;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Map;

public class DBUtils {
    public DBUtils(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    private static JdbcTemplate jdbcTemplate;

    public static <T> List<T> getObjList(String sql, Class<T> t) {
        RowMapper<T> rm = BeanPropertyRowMapper.newInstance(t);
        return jdbcTemplate.query(sql, rm);
    }

    public static Map<String, Object> queryForMap(String sql){
        return jdbcTemplate.queryForMap(sql);
    }

    public static JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public static void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        DBUtils.jdbcTemplate = jdbcTemplate;
    }
}
