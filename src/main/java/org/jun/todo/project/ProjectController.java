package org.jun.todo.project;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping(value = "/projects/{id}")
    public ResponseEntity<ProjectDto> getProject(@PathVariable Long id) {
        ProjectDto projectDto = projectService.findById(id);
        return ResponseEntity.ok(projectDto);
    }
}
