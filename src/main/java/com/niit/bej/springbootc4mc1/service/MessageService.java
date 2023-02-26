package com.niit.bej.springbootc4mc1.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String displayMessage() {
        String greet = "Good Day to all";
        System.out.println(greet);
        return greet;
    }
}
