package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Manager implements Employee {
    @Override
    public String getType() {
        return "manager";
    }

    @Override
    public String salary() {
        return "1,00,000";
    }
}
