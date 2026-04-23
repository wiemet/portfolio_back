package org.example.portfolio.controller;

import org.example.portfolio.model.Contact;
import org.example.portfolio.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @PostMapping
    public ResponseEntity<Contact> sendMessage(@RequestBody Contact contact) {
        Contact saved = contactService.save(contact);
        return ResponseEntity.ok(saved);
    }
}