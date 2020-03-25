package org.jun.todo.project;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
class ProjectDto {
    private Long id;
    private String title;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    static ProjectDto fromEntity(Project entity) {
        return ProjectDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .createdAt(entity.getCraetedAt())
                .modifiedAt(entity.getModifiedAt())
                .build();
    }
}
