package com.app.staj2022.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.staj2022.entity.Contact;
import com.app.staj2022.repository.ContactRepository;

@RestController
public class ContactController {
	
	@Autowired
	ContactRepository contactRepository;
	
	@PostMapping("/saveContact")
	public ResponseEntity<Contact> saveContact(@RequestBody Contact contact) {

		return ResponseEntity.ok(contactRepository.save(contact));

	}
	
	
	@GetMapping("/fetchContactList")
	public ResponseEntity<List<Contact>> getAllContacts() {

		return ResponseEntity.ok(contactRepository.findAll());

	}



}
