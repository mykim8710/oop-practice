package com.example.oop.gradecalculator;

public class Course {
    private String subject; // 과목명
    private int credit; // 학점수 : 3,2,1...
    private String grade; // 성적 : A,B....
    private double totalMultipliedCreditAndGrade = 0;

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public double multiplyCreditAndGradeScore() {
        return credit * getGradeScore();
    }

    public double getGradeScore() {
        double gradeScore = 0.0;

        switch (this.grade) {
            case "A+":
                gradeScore = 4.5;
                break;
            case "A":
                gradeScore = 4.0;
                break;
            case "B+":
                gradeScore = 3.5;
                break;
            case "B":
                gradeScore = 3.0;
                break;
            case "C+":
                gradeScore = 2.5;
                break;
            case "C":
                gradeScore = 2.0;
                break;
            case "D+":
                gradeScore = 1.5;
                break;
            case "D":
                gradeScore = 1.0;
                break;
        }

        return gradeScore;
    }


}
