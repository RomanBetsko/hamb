package com.testservice.hibernateandmybatis.service.impl;

import com.testservice.hibernateandmybatis.entity.hibernate.TableA;
import com.testservice.hibernateandmybatis.entity.mybatis.TableB;
import com.testservice.hibernateandmybatis.repository.TableARepository;
import com.testservice.hibernateandmybatis.repository.mybatis.TableBMapper;
import com.testservice.hibernateandmybatis.service.HelloWordService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HelloWordServiceImpl implements HelloWordService {

    private final TableARepository repository;
    private final TableBMapper tableBMapper;

    @Override
    public List<TableA> getAllHibernate() {
        return repository.findAll();
    }

    @Override
    public List<TableB> getAllMyBatis() {
        return tableBMapper.getAll();
    }
}
