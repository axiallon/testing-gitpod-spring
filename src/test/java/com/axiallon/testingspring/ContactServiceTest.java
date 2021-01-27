package com.axiallon.testingspring;

import java.util.List;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ContactServiceTest {

		@Autowired
		private ContactService service;

		@Test
		void testContextLoad() {
		}

		@Test
		@Transactional
		void testFindAll() {
				List<Contact> contacts = service.findAll();
				assertNotNull(contacts);
				assertEquals(3, contacts.size());
				Contact contact = contacts.get(0);
				assertEquals(1, contact.getId());
				assertEquals("John", contact.getFirstName());
				assertEquals("Doe", contact.getLastName());
		}

		@Test
		@Transactional
		void testSave() {
				Contact contact = new Contact();
				contact.setFirstName("Tom");
				contact.setLastName("McDonald");
				contact = service.save(contact);
				assertNotNull(contact);
				assertNotNull(contact.getId());
				List<Contact> contacts = service.findAll();
				assertEquals(4, contacts.size());
				Contact foundContact = service.findById(contact.getId());
				assertNotNull(foundContact);
				assertEquals(contact.getId(), foundContact.getId());
				assertEquals("Tom", foundContact.getFirstName());
				assertEquals("McDonald", foundContact.getLastName());
		}

}
