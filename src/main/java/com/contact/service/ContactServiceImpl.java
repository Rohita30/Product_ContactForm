package com.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
import com.contact.repository.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public Contact addContact(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepo.save(contact);
	}

	@Override
	public Contact getContact(Long id) {
		// TODO Auto-generated method stub
		return contactRepo.findById(id).get();
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return contactRepo.findAll();
	}

	@Override
	public String deleteContact(Long id) {
		// TODO Auto-generated method stub
		contactRepo.deleteById(id);
		return "Contact Successfully Deleted";
	}

	@Override
	public String updateContact(Long id, Contact contact) {
		// TODO Auto-generated method stub
		Contact contactFromDb = contactRepo.findById(id).get();
        System.out.println(contactFromDb.toString());
        contactFromDb.setName(contact.getName());
        contactFromDb.setEmail(contact.getEmail());
        contactFromDb.setSubject(contact.getSubject());
        contactFromDb.setMessage(contact.getMessage());
        contactRepo.save(contactFromDb);
		return "Contact Updated Successfully";
	}

}
