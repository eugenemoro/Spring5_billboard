package ru.morozov.entity;

import javax.persistence.*;

@Entity
@Table(name = "Category")
public class Category extends AbstractEntity{

	@Column(name = "name")
	private String name;

	public Category(){
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
