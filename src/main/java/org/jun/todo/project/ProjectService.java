package org.jun.todo.project;

import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    ProjectDto findById(Long id) {
        return projectRepository.findById(id)
                .map(ProjectDto::fromEntity)
                .orElseThrow(ProjectNotFoundException::new);
    }
}
