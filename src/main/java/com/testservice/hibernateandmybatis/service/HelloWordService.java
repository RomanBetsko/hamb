package com.testservice.hibernateandmybatis.service;

import com.testservice.hibernateandmybatis.entity.hibernate.TableA;
import com.testservice.hibernateandmybatis.entity.mybatis.TableB;

import java.util.List;

public interface HelloWordService {

    List<TableA> getAllHibernate();

    List<TableB> getAllMyBatis();
}
