package com.example.demo.controller;

import com.example.demo.entity.TaskSumEntity;
import com.example.demo.result.Result;
import com.example.demo.result.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class TaskController {
    @Autowired
    TaskService taskService;
    String message;

    @CrossOrigin
    @RequestMapping(value = "addTask")
    @ResponseBody
    public Result<Integer> addTask(@RequestBody TaskSumEntity requestTask){
        taskService.add(requestTask);
        message = "成功添加任务";
        return new Result<Integer>(200, message,null);
    }

    @CrossOrigin
    @RequestMapping(value = "deleteTask")
    @ResponseBody
    public Result<Integer> deleteTask(@RequestBody TaskSumEntity requestTask){
//        Optional<TaskSumEntity> task;
//        task = taskService.getById(requestTask.getId());
        System.out.print(requestTask.getId());
        taskService.deleteById(requestTask.getId());
        return new Result<Integer>(200,"删除成功！",null);
    }

    @CrossOrigin
    @RequestMapping(value = "getTask")
    @ResponseBody
    public Result<Task> getTask(@RequestBody TaskSumEntity requestTask){
//        System.out.print("这里输出");
//        System.out.print(requestTask.getUserId());
        List<TaskSumEntity> task = taskService.getByUserId(requestTask.getUserId());
//        System.out.print(task);
        return new Result<Task>(200,"获取成功！",new Task(task));
    }

}
