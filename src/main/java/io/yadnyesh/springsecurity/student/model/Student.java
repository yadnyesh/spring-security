package io.yadnyesh.springsecurity.student.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student {
    private final Integer studentId;
    private final String studentName;
}
