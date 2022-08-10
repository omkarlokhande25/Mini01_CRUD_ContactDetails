package com.jrtp.contactDetails.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "CONTACT_DETAILS")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int cid;

	private String name;

	private String email;

	private long phno;

	private String activeSw;

}
