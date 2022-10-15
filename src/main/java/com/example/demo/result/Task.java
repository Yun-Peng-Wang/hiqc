package com.example.demo.result;

import com.example.demo.entity.TaskSumEntity;

import java.util.List;

public class Task {
    private List<TaskSumEntity> task;

    public Task(List<TaskSumEntity> task){
        this.task = task;
    }

    public List<TaskSumEntity> getTask() {
        return task;
    }

    public void setTask(List<TaskSumEntity> task) {
        this.task = task;
    }
}
