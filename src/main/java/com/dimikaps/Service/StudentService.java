package com.dimikaps.Service;

import com.dimikaps.Dao.StudentDao;
import com.dimikaps.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public  Student getStudentByID(int id){
        return this.studentDao.getStudentByID(id);
    }

    public void removeStudentByID(int id) {
        this.studentDao.removeStudentByID(id);
    }

    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudentToDB(student);
    }
}
