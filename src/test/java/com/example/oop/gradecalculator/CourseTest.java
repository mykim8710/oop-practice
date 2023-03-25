package com.example.oop.gradecalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CourseTest {

    @Test
    @DisplayName("과목 객체를 생성한다.")
    void createCourseTest() throws Exception{
        Assertions.assertThatCode(() -> new Course("OOP", 3,  "A"))
                .doesNotThrowAnyException();
    }



}
