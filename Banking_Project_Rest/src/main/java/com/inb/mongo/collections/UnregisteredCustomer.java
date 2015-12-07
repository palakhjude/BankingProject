package com.inb.mongo.collections;

import java.io.File;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="unregistered_customer")
public class UnregisteredCustomer extends Customer {
	long enqId;

	public UnregisteredCustomer() {
		super();
	}
	public UnregisteredCustomer(String firstName, String lastName,
			String email, long phone, String address, Date dateOfBirth,
			File addressProof, File ageProof, long enqId) {
		super(firstName, lastName, email, phone, address, dateOfBirth,
				addressProof, ageProof);
		this.enqId = enqId;
	}

	public long getEnqId() {
		return enqId;
	}

	public void setEnqId(long enqId) {
		this.enqId = enqId;
	}

	@Override
	public String toString() {
		return "UnregisteredCustomer [enqId=" + enqId + "]";
	}

	
	
}
