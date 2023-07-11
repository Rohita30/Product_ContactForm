package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/contact")
public class ContactController { 
	
	@Autowired
	private ContactService contactServ;
	
	@PostMapping("/addContact")
	public ResponseEntity<?> addContact(@RequestBody Contact contact) {
		return new ResponseEntity<Contact> (contactServ.addContact(contact), HttpStatus.CREATED);
	}
	
	@GetMapping("/getContact/{id}")
	public ResponseEntity<?> getContact(@PathVariable Long id){
		return new ResponseEntity<Contact> (contactServ.getContact(id), HttpStatus.OK);
	}
	
	@GetMapping("/getContact")
	public ResponseEntity<?> getAllContacts() {
		return new ResponseEntity<List<Contact>> (contactServ.getAllContacts(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteContact/{id}")
	public ResponseEntity<?> deleteContact(@PathVariable Long id) {
		return new ResponseEntity<String> (contactServ.deleteContact(id), HttpStatus.OK);
	}
	
	@PutMapping("/updateContact/{id}")
	public ResponseEntity<?> updateContact(@PathVariable Long id, @RequestBody Contact contact) {
		contactServ.updateContact(id, contact);
		return new ResponseEntity<Contact> (contactServ.getContact(id), HttpStatus.OK);
	}

}
