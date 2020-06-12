package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.dto.NewStudent;
import ru.itis.models.Student;
import ru.itis.repositories.StudentsRepository;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;

    public List<Student> getAllStudents() {
        return studentsRepository.findAll();
    }

    public void addStudent(NewStudent newStudent) {
        Student student = new Student();
        student.setName(newStudent.getName());
        student.setGroupName(newStudent.getGroupName());
        studentsRepository.save(student);
    }
}
