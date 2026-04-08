package org.example.session04.dao;

import org.example.session04.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class StudentDAO {
    private List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Anh",20,true),
                    new Student(2,"An",21,false),
                    new Student(3,"A",22,true),
                    new Student(4,"Ang",23,false)
            )
    );


    public List<Student> findAll(){
        return this.students;
    }
}
