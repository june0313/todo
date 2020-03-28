package org.jun.todo.task;

import org.jun.todo.common.Response;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = "/projects/{projectId}/tasks")
    public List<TaskDto> getTasks(@PathVariable @Min(1) Long projectId) {
        return taskService.findTasksByProjectId(projectId);
    }

    @PostMapping(value = "/tasks")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Response<TaskDto> createTask(@RequestBody @Valid TaskCreationRequestDto requestDto) {
        TaskDto taskDto = taskService.createTask(requestDto);
        return Response.success(taskDto);
    }
}
