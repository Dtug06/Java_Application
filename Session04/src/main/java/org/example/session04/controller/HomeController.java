package org.example.session04.controller;

import org.example.session04.model.Student;
import org.example.session04.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller


/**
 * Các annotation không j  bean dùng để khởi tạo và sử dùgj DI
 * @Component :đánh dấu là bean để khởi tạo và có ngữ nghĩa
 * @Controller :đánh dáu là bean và mục đích là điều hướng
 * @Service :Đánh dấu là bean và mục đích nghiệp vụ
 * @Repository:Đánh dấu là bean
 */
// Đường dẫn đến controller
@RequestMapping("/")
//@GetMapping
public class HomeController {
@Autowired

private  StudentService studentService;
//    @RequestMapping(method = RequestMethod.GET)
   @GetMapping("/")
    public String home(Model model){
        List<Student> students =studentService.getAllStudent();
        System.out.println(students);

        model.addAttribute("listStudents", students);
        return "home";
    }

    @GetMapping("/search")
    public String search(@RequestParam(name="keyword",defaultValue = "") String keyword){
        System.out.println("noi dung"+keyword);
        return "home";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable(name = "id") int id){
        System.out.println("gia tri "+id);
       return "home";
    }
}
