package com.axiallon.testingspring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

    @Override
    List<Contact> findAll();

    List<Contact> findAllByFirstName(String firstName);

}
