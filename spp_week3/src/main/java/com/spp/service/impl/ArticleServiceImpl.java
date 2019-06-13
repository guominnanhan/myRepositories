package com.spp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spp.dao.ArticleDao;
import com.spp.entity.Article;
import com.spp.service.ArticleService;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService{
	
	@Resource
	private ArticleDao articleDao;

	@Override
	public List<Article> list() {
		// TODO Auto-generated method stub
		return articleDao.list();
	}

	@Override
	public Integer save(Article article) {
		// TODO Auto-generated method stub
		return articleDao.save(article);
	}

	@Override
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return articleDao.delete(id);
	}

	@Override
	public Integer update(Article article) {
		// TODO Auto-generated method stub
		return articleDao.update(article);
	}

	@Override
	public Article findById(Integer id) {
		// TODO Auto-generated method stub
		return articleDao.findById(id);
	}

	@Override
	public List<Article> findInOneMonth(String date) {
		// TODO Auto-generated method stub
		return articleDao.findInOneMonth(date);
	}

	




}
