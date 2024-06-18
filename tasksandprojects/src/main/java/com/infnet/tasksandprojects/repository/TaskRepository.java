package com.infnet.tasksandprojects.repository;

import com.infnet.tasksandprojects.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
