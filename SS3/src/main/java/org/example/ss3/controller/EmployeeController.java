package org.example.ss3.controller;



import jakarta.servlet.http.HttpServletRequest;
import org.example.ss3.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// đánh dấu nó là controller
@Controller

@RequestMapping("/employees") // nếu không ghi gì thì đường dẫn là /home
public class EmployeeController {


    @GetMapping
    public String employees(HttpServletRequest request) {
        List<Employee> employee_list = new ArrayList<>();

        employee_list.add(new Employee(1,"Le Trung Chien1","CNTT",20000.0));
        employee_list.add(new Employee(1,"Le Trung Chien2","CNTT",20000.0));
        employee_list.add(new Employee(1,"Le Trung Chien3","CNTT",20000.0));
        employee_list.add(new Employee(1,"Le Trung Chien4","CNTT",20000.0));
        employee_list.add(new Employee(1,"Le Trung Chien5","CNTT",20000.0));
        request.setAttribute("employee_list", employee_list);
        return "employee-list";
    }



}
