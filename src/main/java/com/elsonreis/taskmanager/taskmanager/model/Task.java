package com.elsonreis.taskmanager.taskmanager.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 500)
    private String description;

    private boolean completed;

    private LocalDateTime createdAt;
    private LocalDateTime completedAt;

    public Task() {
        this.createdAt = LocalDateTime.now();
        this.completed = false;
    }

    // getters and setters
}
