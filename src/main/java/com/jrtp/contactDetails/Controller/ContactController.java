package com.jrtp.contactDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrtp.contactDetails.Entity.Contact;
import com.jrtp.contactDetails.Service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	private ContactService service;

	@PostMapping("/")
	public ResponseEntity<String> upsert(@RequestBody Contact contact) {
		String save = service.upsert(contact);
		return new ResponseEntity<>(save, HttpStatus.CREATED);
	}

	@GetMapping("/")
	public ResponseEntity<List<Contact>> getAllContacts() {
		List<Contact> allContacts = service.getAllContacts();
		return new ResponseEntity<>(allContacts, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Contact> getContact(@PathVariable int id) {
		Contact contact = service.getContact(id);
		return new ResponseEntity<>(contact, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteContact(@PathVariable int id) {
		String deleteContact = service.deleteContact(id);
		return new ResponseEntity<>(deleteContact, HttpStatus.OK);
	}

}
