package com.example.demo.controllers;

import com.example.demo.dtos.ChangeStatusRequestDto;
import com.example.demo.dtos.MailMessage;
import com.example.demo.services.SendMailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/items")
public class ItemStatusMailController {


  @PostMapping(value = "/changeStatus", consumes = "application/json")
  public ResponseEntity updateStatus(@Validated @RequestBody ChangeStatusRequestDto requestDto){
    try {
      return ResponseEntity.status(HttpStatus.ACCEPTED).body(new MailMessage(SendMailService.INSTANCE.send(requestDto)));
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body("Allahu akbar my friend");
    }
  }

}
