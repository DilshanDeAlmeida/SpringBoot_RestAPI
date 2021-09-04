package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudent() {
        return Arrays.asList(
                new Student(
                        1L, "Maria", "maria.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5), 21)
        );
    }

}