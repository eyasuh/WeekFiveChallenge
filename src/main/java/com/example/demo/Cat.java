package com.example.demo;

public class Cat {
	private String [] breedType = {
			"Abyssinian", "Asian Semi-longhair", "Birman", "Bombay" ,"Korat"
			,"Russian Blue", "Sphinx"
	};

	public String[] getBreedType() {
		return breedType;
	}

	public void setBreedType(String[] breedTyp) {
		this.breedType = breedTyp;
	}
}
