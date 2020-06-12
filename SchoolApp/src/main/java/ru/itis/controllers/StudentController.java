package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.dto.NewStudent;
import ru.itis.services.StudentsService;

@Controller
public class StudentController {

    @Autowired
    private StudentsService studentsService;

    @GetMapping("/students")
    public ModelAndView getPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("students", studentsService.getAllStudents());
        modelAndView.setViewName("students");
        return modelAndView;
    }

    @PostMapping("/students")
    public String addStudent(NewStudent newStudent) {
        System.out.println(newStudent);
        studentsService.addStudent(newStudent);
        return "redirect:/students";
    }
}
