package org.jun.todo.project;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "project")
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name ="createdAt")
    @CreationTimestamp
    private LocalDateTime craetedAt;

    @Column(name = "modifiedAt")
    @UpdateTimestamp
    private LocalDateTime modifiedAt;

    public Project(String title) {
        this.title = title;
    }
}
