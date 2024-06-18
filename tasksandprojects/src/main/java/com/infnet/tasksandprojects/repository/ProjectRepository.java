package com.infnet.tasksandprojects.repository;

import com.infnet.tasksandprojects.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
