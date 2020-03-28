package org.jun.todo.task;

import org.jun.todo.project.Project;
import org.jun.todo.project.ProjectNotFoundException;
import org.jun.todo.project.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final ProjectRepository projectRepository;
    private final TaskRepository taskRepository;

    public TaskService(ProjectRepository projectRepository, TaskRepository taskRepository) {
        this.projectRepository = projectRepository;
        this.taskRepository = taskRepository;
    }

    TaskDto createTask(TaskCreationRequestDto requestDto) {
        Project project = projectRepository.findById(requestDto.getProjectId()).orElseThrow(ProjectNotFoundException::new);
        Task newTask = Task.create(requestDto.getTitle(), project);
        taskRepository.save(newTask);
        return TaskDto.fromEntity(newTask);
    }
}
