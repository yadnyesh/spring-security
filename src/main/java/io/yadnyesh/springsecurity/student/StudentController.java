package io.yadnyesh.springsecurity.student;

import io.yadnyesh.springsecurity.student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @GetMapping(path="{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId) {

    }

}
