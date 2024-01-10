package com.hibernate.viveksir.FIRST_PROJECT;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int sID;
	private String sNAME;
	private int sContact;
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
	}
	public String getsNAME() {
		return sNAME;
	}
	public void setsNAME(String sNAME) {
		this.sNAME = sNAME;
	}
	public int getsContact() {
		return sContact;
	}
	public void setsContact(int sContact) {
		this.sContact = sContact;
	}

}
