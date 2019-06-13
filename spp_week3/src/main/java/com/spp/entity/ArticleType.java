package com.spp.entity;

public class ArticleType {
	
	private Integer id;
	private String type;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ArticleType [id=" + id + ", type=" + type + "]";
	}
	public ArticleType(Integer id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public ArticleType() {
		super();
	}
	public ArticleType(String type) {
		super();
		this.type = type;
	}
	
	
	
}
