package com.example.oop.gradecalculator;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    /**
     * 평균학점 = (학점수 × 교과목 평점)의 합계 / 수강신청의 총학점 수
     */
    public double calculateAverageScore() {
        // (학점수 × 교과목 평점)의 합계
        double totalMultipliedCreditAndGradeScore = courses.calculateTotalMultiplyCreditAndGradeScore();
        // 수강한 총 학점수
        int totalCredit = courses.calculateTotalCredit();

        return totalMultipliedCreditAndGradeScore / totalCredit;
    }
}
