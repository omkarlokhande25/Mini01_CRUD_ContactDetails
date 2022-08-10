package com.jrtp.contactDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrtp.contactDetails.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
