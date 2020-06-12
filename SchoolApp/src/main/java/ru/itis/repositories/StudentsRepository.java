package ru.itis.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.itis.models.Student;

import java.util.List;

public interface StudentsRepository {
    List<Student> findAll();
    void save(Student student);
}
