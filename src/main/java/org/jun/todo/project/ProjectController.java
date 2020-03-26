package org.jun.todo.project;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@Validated
@RestController
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping(value = "/projects/{id}")
    public ResponseEntity<ProjectDto> getProject(@PathVariable @Min(1) Long id) {
        ProjectDto projectDto = projectService.findById(id);
        return ResponseEntity.ok(projectDto);
    }

    @PostMapping(value = "/projects")
    public ResponseEntity<ProjectDto> createProject(@RequestBody @Valid ProjectCreationRequestDto requestDto) {
        ProjectDto projectDto = projectService.createProject(requestDto);
        return ResponseEntity.ok(projectDto);
    }
}
