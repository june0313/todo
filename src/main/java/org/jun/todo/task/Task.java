package org.jun.todo.task;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.jun.todo.project.Project;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "task")
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "projectId")
    private Project project;

    @Column(name = "title")
    private String title;

    @Column(name ="createdAt")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "modifiedAt")
    @UpdateTimestamp
    private LocalDateTime modifiedAt;

    private Task(String title, Project project) {
        this.title = title;
        this.project = project;
    }

    static Task create(String title, Project project) {
        return new Task(title, project);
    }
}
