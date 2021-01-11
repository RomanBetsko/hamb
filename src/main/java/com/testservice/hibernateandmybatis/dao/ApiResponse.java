package com.testservice.hibernateandmybatis.dao;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResponse {

    private String hibernateRecords;
    private String myBatisRecords;
}
