package com.infnet.tasksandprojects.controller;

import com.infnet.tasksandprojects.domain.Project;
import com.infnet.tasksandprojects.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAll() {
        return projectService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> getById(@PathVariable Long id) {
        return projectService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Project create(@RequestBody Project project) {
        return projectService.save(project);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        projectService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
