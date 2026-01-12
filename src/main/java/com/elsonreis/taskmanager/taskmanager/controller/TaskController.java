package com.elsonreis.taskmanager.taskmanager.controller;


import com.elsonreis.taskmanager.taskmanager.model.Task;
import com.elsonreis.taskmanager.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        return service.create(task);
    }

    @GetMapping
    public List<Task> findAll() {
        return service.findAll();
    }

    @PutMapping("/{id}/complete")
    public Task complete(@PathVariable Long id) {
        return service.complete(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
