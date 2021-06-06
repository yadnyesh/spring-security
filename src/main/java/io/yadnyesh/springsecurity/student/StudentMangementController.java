package io.yadnyesh.springsecurity.student;

import io.yadnyesh.springsecurity.student.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
@Slf4j
public class StudentMangementController {

    private static final List<Student> STUDENT_LIST = Arrays.asList(
            new Student(1, "James Bond"),
            new Student(2, "Anna Bond"),
            new Student(3, "Dr. No"),
            new Student(4, "Moonraker"),
            new Student(5, "Diamonds are forever")
    );
    @GetMapping
    public List<Student> getAllStudents(){
        return STUDENT_LIST;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        log.info(student.toString());
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable Integer studentId) {
        log.info(studentId.toString());
    }

    @PutMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable Integer studentId, @RequestBody Student student) {
        log.info(studentId.toString() + " ******* " + student);
    }
}
