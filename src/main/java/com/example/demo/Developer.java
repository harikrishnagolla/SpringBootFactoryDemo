package com.example.demo;
import com.example.demo.Employee;
import org.springframework.stereotype.Service;

@Service
public class Developer implements Employee
{
    @Override
    public String getType() {
        return "developer";
    }

    @Override
    public String salary() {
        return "50,000";
    }
}
