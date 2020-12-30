package com.baran.daniel.model;

public class Income {
	
	private String name;
	private double value;
	private IncomeCategory category;

	public Income() {
	}

	public Income(String name, double value, IncomeCategory category) {
		this.name = name;
		this.value = value;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public IncomeCategory getCategory() {
		return category;
	}

	public void setCategory(IncomeCategory category) {
		this.category = category;
	}

}
