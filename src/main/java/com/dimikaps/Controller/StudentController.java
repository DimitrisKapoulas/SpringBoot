package com.dimikaps.Controller;

import com.dimikaps.Entity.Student;
import com.dimikaps.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentByID(@PathVariable("id") int id){
        return studentService.getStudentByID(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentByID(@PathVariable("id") int id){
        studentService.removeStudentByID(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @RequestMapping( method = RequestMethod.POST)
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }
}
