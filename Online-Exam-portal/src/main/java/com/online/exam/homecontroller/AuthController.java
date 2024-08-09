package com.online.exam.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.online.exam.model.Student;
import com.online.exam.userrepository.StudentRepository;


@Controller
public class AuthController {
    
	@Autowired
    private final StudentRepository studentRepository;
	@Autowired
    private final PasswordEncoder passwordEncoder;

    public AuthController(StudentRepository studentRepository, PasswordEncoder passwordEncoder) {
        this.studentRepository = studentRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("student", new Student());
        return "register";
    }

    @PostMapping("/register")
    public String registerStudent(Student student) {
        student.setPassword(passwordEncoder.encode(student.getPassword()));
        student.setRole("ROLE_USER");
        studentRepository.save(student);
        return "redirect:/login";
    }
    @GetMapping("/index")
    public String index() {
        return "index";
    }

}
