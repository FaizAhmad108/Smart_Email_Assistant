package com.email.writer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@Slf4j
@CrossOrigin(origins ="*")
public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        log.info("Received email generation request");
        log.debug("Email request details: {}", emailRequest);

        String response=emailGeneratorService.generateEmailReply(emailRequest);
        log.info("Email generated successfully");
        log.debug("Generated email response: {}", response);

        return ResponseEntity.ok(response);
    }

}
