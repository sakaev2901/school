package ru.itis.repositories;

import org.springframework.stereotype.Repository;
import ru.itis.models.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class StudentRepositoryImpl implements StudentsRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("select c from Student c", Student.class)
                .getResultList();
    }

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }
}
