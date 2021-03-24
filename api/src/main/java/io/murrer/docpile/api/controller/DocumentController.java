package io.murrer.docpile.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {

    @GetMapping(path="api")
    public String hello() {
        return "hello";
    }
}
