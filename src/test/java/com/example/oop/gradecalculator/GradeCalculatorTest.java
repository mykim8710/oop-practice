package com.example.oop.gradecalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * - 요구사항
 *  - 평균학점 계산 방법 = (학점수 × 교과목 평점)의 합계 / 수강신청 총학점 수
 *  - MVC패턴(Model-View-Controller) 기반으로 구현한다.
 *  - 일급 컬렉션 사용
 */
public class GradeCalculatorTest {
    @Test
    @DisplayName("평균 학점이 계산되어진다.")
    void gradeCalculateTest() {
        List<Course> courses = List.of(
                new Course("자바", 3, "A+"),
                new Course("자료구조", 3, "A+")
        );

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double result = gradeCalculator.calculateAverageScore();
        Assertions.assertThat(result).isEqualTo(4.5);
    }
}
