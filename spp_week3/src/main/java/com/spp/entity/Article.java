package com.spp.entity;

public class Article {
	
	private Integer id;
	private String title;
	private String content;
	private String publicDate;
	private Integer typeId ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPublicDate() {
		return publicDate;
	}
	public void setPublicDate(String publicDate) {
		this.publicDate = publicDate;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", publicDate=" + publicDate
				+ ", typeId=" + typeId + "]";
	}
	public Article(Integer id, String title, String content, String publicDate, Integer typeId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.publicDate = publicDate;
		this.typeId = typeId;
	}
	public Article(String title, String content, String publicDate, Integer typeId) {
		super();
		this.title = title;
		this.content = content;
		this.publicDate = publicDate;
		this.typeId = typeId;
	}
	public Article() {
		super();
	}
	
	
	
	
}
