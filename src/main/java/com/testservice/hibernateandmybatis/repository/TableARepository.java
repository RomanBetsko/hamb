package com.testservice.hibernateandmybatis.repository;

import com.testservice.hibernateandmybatis.entity.hibernate.TableA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableARepository extends JpaRepository<TableA, String> {

    void deleteById(Integer id);
}

