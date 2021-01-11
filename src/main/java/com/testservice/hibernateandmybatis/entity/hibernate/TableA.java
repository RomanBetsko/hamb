package com.testservice.hibernateandmybatis.entity.hibernate;

import lombok.Data;
import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
@Table(name = "table_a")
public class TableA {
    @Id
    @GeneratedValue(strategy=AUTO)
    private Long id;
    private String abo;
    private String phone;
}
