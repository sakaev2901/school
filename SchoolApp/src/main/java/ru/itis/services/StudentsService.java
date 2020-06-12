package ru.itis.services;


import ru.itis.dto.NewStudent;
import ru.itis.models.Student;

import java.util.List;

public interface StudentsService {

    List<Student> getAllStudents();
    void addStudent(NewStudent newStudent);
}
