package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Tester implements  Employee {

    @Override
    public String getType() {
        return "tester";
    }

    @Override
    public String salary() {
        return "20,000";
    }
}
