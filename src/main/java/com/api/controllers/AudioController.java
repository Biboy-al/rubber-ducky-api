package com.api.controllers;

import com.api.models.Transcript;
import com.api.services.TransribeService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("/audio")
public class AudioController {

    private final TransribeService transribeService;

    public AudioController(TransribeService transribeService) {
        this.transribeService = transribeService;
    }

    @GetMapping("/upload")
    public String transcript(@RequestParam(name="path") String path) {

//        Resource audio = new ClassPathResource(path);

//        Transcript transcript =  this.transribeService.transcript(audio);

        return UUID.randomUUID().toString();
    }


}

