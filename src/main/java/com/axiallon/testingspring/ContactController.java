package com.axiallon.testingspring;

import java.util.List;

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class ContactController {

    private ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @RequestMapping("/contacts")
    public List<Contact> findAll() {
        return service.findAll();
    }

    @RequestMapping("/contacts/{id}")
    public Contact findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @RequestMapping("/contacts/firstName/{firstName}")
    public List<Contact> findByFirstName(@PathVariable String firstName) {
        return service.findAllByName(firstName);
    }

}
