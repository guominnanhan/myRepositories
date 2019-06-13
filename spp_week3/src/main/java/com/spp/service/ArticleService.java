package com.spp.service;

import java.util.List;

import com.spp.entity.Article;

public interface ArticleService {
	public List<Article> list();
	
	public Integer save(Article article);
	
	public Integer delete(Integer id);
	
	public Integer update(Article article);
	
	public Article findById(Integer id);
	
	public List<Article> findInOneMonth(String date);
}
