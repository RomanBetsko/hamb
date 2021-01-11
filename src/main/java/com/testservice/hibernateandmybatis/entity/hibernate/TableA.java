package com.testservice.hibernateandmybatis.entity.hibernate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Data
@Builder
@Entity
@Table(name = "table_a")
@AllArgsConstructor
@NoArgsConstructor
public class TableA {
    @Id
    @GeneratedValue(strategy=AUTO)
    private Integer id;
    private String abo;
    private String phone;
}
