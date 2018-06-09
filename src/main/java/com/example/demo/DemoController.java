package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DemoController {

    @Autowired
    List<Employee> employeeList;

    @GetMapping(value = "/salary/{employee}")
    public String getSalary(@PathVariable(name = "employee") String employeeType) {
        for(Employee e:employeeList){
            if(e.getType().equalsIgnoreCase(employeeType)){
                return e.salary();
            }
        }
       /* Optional<Employee> emp = employeeList.stream().filter(e -> e.getType().equalsIgnoreCase(employeeType)).findAny();
        return emp.isPresent()
                ? emp.get().salary()
                : "Not found emptype";*/
       return "Not found emptype";

    }
}
