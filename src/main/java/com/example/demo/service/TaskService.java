package com.example.demo.service;

import com.example.demo.dao.TaskDAO;
import com.example.demo.entity.TaskSumEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    TaskDAO taskDAO;

    public List<TaskSumEntity> getByUserId(Integer userId){return taskDAO.findAllByUserId(userId);}
    public Optional<TaskSumEntity> getById(Integer id){return taskDAO.findById(id);}
    public void add(TaskSumEntity task){taskDAO.save(task);}
    public void deleteById(Integer id){taskDAO.deleteById(id);}
}
