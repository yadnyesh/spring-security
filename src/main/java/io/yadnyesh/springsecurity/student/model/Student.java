package io.yadnyesh.springsecurity.student.model;

public class Student {
    private final Integer studentId;
    private final String studentName;
    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
}
