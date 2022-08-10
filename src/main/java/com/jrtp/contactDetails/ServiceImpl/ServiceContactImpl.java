package com.jrtp.contactDetails.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrtp.contactDetails.Entity.Contact;
import com.jrtp.contactDetails.Repository.ContactRepository;
import com.jrtp.contactDetails.Service.ContactService;

@Service
public class ServiceContactImpl implements ContactService {

	@Autowired
	private ContactRepository repo;

	@Override
	public String upsert(Contact contact) {
		Contact save = repo.save(contact);
		return "Success";
	}

	@Override
	public List<Contact> getAllContacts() {
		return repo.findAll();
	}

	@Override
	public Contact getContact(int id) {
		Optional<Contact> findById = repo.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String deleteContact(int id) {
		repo.deleteById(id);
		return "Success";
	}

}
