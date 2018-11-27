package ru.morozov.entity;

import javax.persistence.*;

@Entity
@Table(name = "Ad")
public class Ad extends AbstractEntity{

	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;

	@Column(name = "name")
	private String name;

	@Column(name = "content")
	private String content;

	@Column(name = "phone_number")
	private String phoneNumber;

	@ManyToOne(fetch = FetchType.EAGER)
	private Company company;

	public Ad(){
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
