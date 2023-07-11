package com.contact.service;

import java.util.List;

import com.contact.entity.Contact;



public interface ContactService { 
	
	public Contact addContact(Contact contact);
	public Contact getContact(Long id);
	public List<Contact> getAllContacts();
	public String deleteContact(Long id);
	public String updateContact(Long id, Contact contact);

}
