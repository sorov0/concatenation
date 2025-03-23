package com.centime.concatenationservice.controller;

import com.centime.concatenationservice.dto.PersonRequest;
import com.centime.concatenationservice.exception.InvalidJsonException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/concat")
public class ConcatenationController {
    private final Logger logger = LoggerFactory.getLogger(ConcatenationController.class);

    @PostMapping
    public ResponseEntity<String> concatenate(@RequestBody PersonRequest request) {
        if (request.getName() == null || request.getSurname() == null) {
            throw new InvalidJsonException("Invalid JSON: Name and Surname required");
        }
        logger.info("Concatenating {} {}", request.getName(), request.getSurname());
        return ResponseEntity.ok(request.getName() + " " + request.getSurname());
    }
}
