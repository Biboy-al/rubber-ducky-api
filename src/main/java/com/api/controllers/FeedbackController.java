package main.java.com.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import main.java.com.api.models.Feedback;

@RestController
public class FeedbackController {


    @PostMapping("/upload")
    public int upload(@RequestParam("file") MultipartFile audio){
        
        return 1;
    }


    @GetMapping("/")
    public Feedback feedback(@RequestParam("id") int feedbackId){
        return null;
    }

    
}
