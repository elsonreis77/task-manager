package com.elsonreis.taskmanager.taskmanager.service;

import com.elsonreis.taskmanager.taskmanager.model.Task;
import com.elsonreis.taskmanager.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskService {
        private final TaskRepository repository;

        public TaskService(TaskRepository repository) {
            this.repository = repository;
        }

        public Task create(Task task) {
            return repository.save(task);
        }

        public List<Task> findAll() {
            return repository.findAll();
        }

        public Task complete(Long id) {
            Task task = repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Task not found"));

            task.setCompleted(true);
            task.setCompletedAt(LocalDateTime.now());

            return repository.save(task);
        }

        public void delete(Long id) {
            repository.deleteById(id);
        }
}
