package org.jun.todo.project;

import lombok.extern.slf4j.Slf4j;
import org.jun.todo.common.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ProjectControllerAdvice {

    @ExceptionHandler(ProjectNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Response handleNotFoundProject(ProjectNotFoundException e) {
        log.warn("project not found : {}", e.getMessage());
        return Response.fail(null, e.getMessage());
    }
}
