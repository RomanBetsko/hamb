package com.testservice.hibernateandmybatis.repository.mybatis;

import com.testservice.hibernateandmybatis.entity.mybatis.TableB;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TableBMapper {

    @Select("SELECT * FROM table_b")
    List<TableB> getAll();
}