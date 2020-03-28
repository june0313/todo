package org.jun.todo.task;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
class TaskDto {
    private Long id;
    private String title;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private Long projectId;

    static TaskDto fromEntity(Task entity) {
        return builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .createdAt(entity.getCreatedAt())
                .modifiedAt(entity.getModifiedAt())
                .projectId(entity.getProject().getId())
                .build();
    }
}
