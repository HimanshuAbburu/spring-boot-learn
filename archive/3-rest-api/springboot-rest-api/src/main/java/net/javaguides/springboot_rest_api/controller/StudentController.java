package net.javaguides.springboot_rest_api.controller;

import net.javaguides.springboot_rest_api.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

//    http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent() {
        Student student = new Student(1,"John", "Doe");
        return student;
    }

//    http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jane", "Doe"));
        students.add(new Student(2, "Martin", "Willliams"));
        students.add(new Student(3, "Josh", "Brolin"));
        return students;
    }

//    http://localhost:8080/student/1
    @GetMapping("student/{id}")
    public Student getStudentID(@PathVariable("id") int studentId){
        return new Student(studentId, "Josh","Brolin");
    }

//    http://localhost:8080/student/query?id=1
    @GetMapping("student/query")
    public Student filterStudent(@RequestParam(value="id") int studentId){
        return new Student(studentId, "Josh","Brolin");
    }
}
