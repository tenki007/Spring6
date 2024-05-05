package com.hashtenki.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@Component(value = "jdbcTemplateTest")
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void testUpdate() {
//        增加数据
//        String sql = "insert into t_emp values(NULL,?,?,?)";
//        int rows = jdbcTemplate.update(sql, "hashtenki", 20, "男");
//        int update = jdbcTemplate.update(sql, "luya", 30, "女");
//        int update1 = jdbcTemplate.update(sql, "leippya", 40, "男");
//        System.out.println(rows+"\n"+update+"\n"+update1);
//        修改数据
//        String sql = "update t_emp set name = ?,age = ? where id = ?";
//        int rows = jdbcTemplate.update(sql, "hashtenki", 20, 1);
//        System.out.println(rows);
//        删除数据
//        String sql = "delete from t_emp where id = ?";
//        int rows = jdbcTemplate.update(sql, 3);
//        System.out.println(rows);

    }
//        查询：返回对象
    @Test
    public void testQuery() {
        String sql = "select * from t_emp where id = ?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Emp>(Emp.class), 1);
        System.out.println(emp);
    }

//        查询：返回List集合
    @Test
    public void testQuery1() {
        String sql = "select * from t_emp";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        System.out.println(list);
    }
//        查询：返回单个值
    @Test
    public void testQuery2() {
        String sql = "select count(*) from t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }

}
