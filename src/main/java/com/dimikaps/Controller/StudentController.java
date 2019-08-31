package com.dimikaps.Controller;

import com.dimikaps.Entity.Student;
import com.dimikaps.Service.StudentService;

import java.util.Collection;

public class StudentController {

    private StudentService studentService;

    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
