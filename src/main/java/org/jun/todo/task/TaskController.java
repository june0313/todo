package org.jun.todo.task;

import org.jun.todo.common.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping(value = "/tasks")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Response<TaskDto> createTask(@RequestBody @Valid TaskCreationRequestDto requestDto) {
        TaskDto taskDto = taskService.createTask(requestDto);
        return Response.success(taskDto);
    }
}
