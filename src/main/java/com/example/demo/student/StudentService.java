package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return Arrays.asList(
                new Student(
                        1L, "Maria", "maria.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5), 21)
        );
    }
}
