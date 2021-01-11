package com.testservice.hibernateandmybatis.controller;

import com.testservice.hibernateandmybatis.dao.ApiResponse;
import com.testservice.hibernateandmybatis.entity.hibernate.TableA;
import com.testservice.hibernateandmybatis.entity.mybatis.TableB;
import com.testservice.hibernateandmybatis.service.HelloWordService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@AllArgsConstructor
public class HelloWordController {

    private final HelloWordService helloWordService;

    @GetMapping("/hello")
    public ResponseEntity<?> helloWord(){
        List<TableA> hibernateRecords = helloWordService.getAllHibernate();

        List<TableB> myBatisRecords = helloWordService.getAllMyBatis();

        return ResponseEntity.ok(ApiResponse.builder()
                .hibernateRecords(hibernateRecords.toString())
                .myBatisRecords(myBatisRecords.toString())
                .build());
    }
}
