package com.online.exam.homecontroller;

import com.online.exam.model.Student;
import com.online.exam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/current-user")
    public String getCurrentUser(Model model) {
        Student currentStudent = studentService.getCurrentStudent();
        model.addAttribute("student", currentStudent);
        return "profile";
    }
    
}
