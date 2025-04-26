package com.example.Tracking.Student.Assignments.repository;

import com.example.Tracking.Student.Assignments.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}