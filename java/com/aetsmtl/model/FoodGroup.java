package com.aetsmtl.model;

public class FoodGroup {

	private int idfoodsgroup;
	private String name;
	private String description;
	
	public int getIdfoodsgroup() {
		return idfoodsgroup;
	}
	public void setIdfoodsgroup(int idfoodsgroup) {
		this.idfoodsgroup = idfoodsgroup;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String talkAboutMe (){
		return this.idfoodsgroup +" - "+ this.name +" - "+ this.description;
	}
}
