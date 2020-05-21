package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

public class Customer {
	@NotNull
	@Size(min = 2, max =20)
	private String name;

	@NotNull
	@Size(min = 2, max =20)
	private String phone;

	@NotNull
	@Size(min = 2, max =20)
	private String petInfo;

	public static ArrayList<Customer> customerArray = new ArrayList<>();

	private boolean catOrDog;

	public Customer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPetInfo() {
		return petInfo;
	}

	public void setPetInfo(String petInfo) {
		this.petInfo = petInfo;
	}



	public boolean isCatOrDog() {
		return catOrDog;
	}

	public void setCatOrDog(boolean catOrDog) {
		this.catOrDog = catOrDog;
	}
}
