package com.axiallon.testingspring;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ContactService {
  
    private ContactRepository repo;

    public ContactService(ContactRepository repo) {
        this.repo = repo;
    }

    public List<Contact> findAll() {
        return repo.findAll();
    }

    public Contact findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public List<Contact> findAllByName(String firstName) {
        return repo.findAllByFirstName(firstName);
    }

    public Contact save(Contact contact) {
        return repo.save(contact);
    }

}
