package org.jun.todo.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class ProjectRepositoryTest {
    @Autowired
    private ProjectRepository sut;

    @Test
    @DisplayName("project should be saved")
    void testSave() {
        Project project = new Project("test project");

        sut.save(project);

        assertAll(
                () -> assertThat(project.getId()).isNotNull(),
                () -> assertThat(project.getCraetedAt()).isNotNull(),
                () -> assertThat(project.getModifiedAt()).isNotNull()
        );
    }
}