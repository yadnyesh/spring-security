package io.yadnyesh.springsecurity.student.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Student {
    private final Integer studentId;
    private final String studentName;
}
