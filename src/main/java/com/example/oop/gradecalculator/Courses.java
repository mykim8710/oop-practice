package com.example.oop.gradecalculator;

import java.util.List;

/**
 * 일급 컬렉션 : Collection(List, Set....) 형태로 된 하나의 변수를 갖는 클래스
 */
public class Courses {
    private List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double calculateTotalMultiplyCreditAndGradeScore() {
        /*double totalMultipliedCreditAndGrade = 0;
        for (Course course : courses) {
            totalMultipliedCreditAndGrade += course.multiplyCreditAndGradeScore();
        }*/
        // 스트림 사용
        return courses.stream()
                .mapToDouble(course -> course.multiplyCreditAndGradeScore())
                .sum();
    }

    public int calculateTotalCredit() {
        return courses.stream()
                .mapToInt(course -> course.getCredit())
                .sum();
    }
}
