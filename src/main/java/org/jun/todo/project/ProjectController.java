package org.jun.todo.project;

import org.jun.todo.common.Response;
import org.springframework.http.HttpStatus;
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
    public Response<ProjectDto> getProject(@PathVariable @Min(1) Long id) {
        ProjectDto projectDto = projectService.findById(id);
        return Response.success(projectDto);
    }

    @PostMapping(value = "/projects")
    @ResponseStatus(HttpStatus.CREATED)
    public Response<ProjectDto> createProject(@RequestBody @Valid ProjectCreationRequestDto requestDto) {
        ProjectDto projectDto = projectService.createProject(requestDto);
        return Response.success(projectDto);
    }
}
