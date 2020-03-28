package org.jun.todo.task;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
class TaskCreationRequestDto {
    @NotNull
    @Min(1)
    private Long projectId;

    @NotNull
    @NotEmpty
    @NotBlank
    private String title;
}
