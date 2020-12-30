package com.baran.daniel.model;

public class Expense {
	private String name;
	private double value;
	private ExpenseCategory category;

	public Expense() {
	}

	public Expense(String name, double value, ExpenseCategory category) {
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

	public ExpenseCategory getCategory() {
		return category;
	}

	public void setCategory(ExpenseCategory category) {
		this.category = category;
	}

}
