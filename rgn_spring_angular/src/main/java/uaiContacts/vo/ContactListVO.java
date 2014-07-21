package uaiContacts.vo;

import java.util.List;

import uaiContacts.model.Contact;

public class ContactListVO {

	private int totalPages;
	private long totalElements;
	private List<Contact> content;

	public ContactListVO(int totalPages, long totalElements,
			List<Contact> content) {
		this.totalPages = totalPages;
		this.totalElements = totalElements;
		this.content = content;
	}

	public void setActionMessage(String message) {

	}

	public void setSearchMessage(String message) {

	}

}
