package com.testservice.hibernateandmybatis.service.scheduled;

import com.testservice.hibernateandmybatis.entity.hibernate.TableA;
import com.testservice.hibernateandmybatis.entity.mybatis.TableB;
import com.testservice.hibernateandmybatis.repository.TableARepository;
import com.testservice.hibernateandmybatis.repository.mybatis.TableBMapper;
import com.testservice.hibernateandmybatis.service.HelloWordService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@AllArgsConstructor
public class DoSomethingRunnable implements Runnable {

    private final TableARepository tableARepository;
    private final TableBMapper tableBMapper;
    private final HelloWordService helloWordService;

    @Override
    @Transactional
    public void run() {
        List<TableB> tableBList = tableBMapper.getAll();


        List<TableA> tableAList = helloWordService.getAllHibernate();
        TableA first = tableAList.get(1);
        first.setAbo("updated value");
        tableARepository.save(first);
        helloWordService.insertWithValues(3, "new value", null);
//        tableARepository.deleteById(3);
        System.out.println(tableAList.toString() + tableBList.toString());
    }
}
