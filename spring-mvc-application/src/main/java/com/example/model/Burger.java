package com.example.model;

public class Burger {

	private Integer id;
	private String burgName;
	private int price;

	public Burger() {
	}

	public Burger(Integer id) {
		super();
		this.id = id;
	}

	public Burger(String burgName, Integer price) {
		super();
		this.burgName = burgName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBurgName() {
		return burgName;
	}

	public void setBurgName(String burgName) {
		this.burgName = burgName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
