package com.testservice.hibernateandmybatis.service.scheduled.impl;

import com.testservice.hibernateandmybatis.service.scheduled.DoSomethingRunnable;
import com.testservice.hibernateandmybatis.service.scheduled.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final DoSomethingRunnable doSomethingRunnable;

    @Override
    @Scheduled(fixedRate = 20000) //will run every 20 sec
    public void doSomething() {
        new Thread(doSomethingRunnable).start();
    }
}
