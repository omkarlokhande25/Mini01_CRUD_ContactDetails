package com.jrtp.contactDetails.Service;

import java.util.List;

import com.jrtp.contactDetails.Entity.Contact;

public interface ContactService {

	String upsert(Contact contact);

	List<Contact> getAllContacts();

	Contact getContact(int id);

	String deleteContact(int id);
}
