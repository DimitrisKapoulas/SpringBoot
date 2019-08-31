package com.dimikaps.Service;

import com.dimikaps.Dao.StudentDao;
import com.dimikaps.Entity.Student;

import java.util.Collection;

public class StudentService {

    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }
}
