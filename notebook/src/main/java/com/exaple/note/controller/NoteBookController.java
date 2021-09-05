package com.exaple.note.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteBookController {

    @GetMapping("/list")
    public String showUpdateFrom(){
        return "list";
    }
}
