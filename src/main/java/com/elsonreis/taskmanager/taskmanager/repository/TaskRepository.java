package com.elsonreis.taskmanager.taskmanager.repository;

import com.elsonreis.taskmanager.taskmanager.model.Task;
import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
