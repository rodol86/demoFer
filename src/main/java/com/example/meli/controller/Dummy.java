package com.example.meli.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dummy {
	@GetMapping("/dummy/{index}")
    public String getAnswersByQuestionId(@PathVariable int index) {
        
        return "sucker!!!";
    }
		
}
