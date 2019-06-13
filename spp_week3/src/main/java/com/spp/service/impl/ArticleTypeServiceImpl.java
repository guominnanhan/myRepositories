package com.spp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spp.dao.ArticleTypeDao;
import com.spp.entity.ArticleType;
import com.spp.service.ArticleTypeService;

@Service("articleTypeService")
public class ArticleTypeServiceImpl implements ArticleTypeService {
	
	@Resource
	private ArticleTypeDao articleTypeDao;
	
	
	@Override
	public List<ArticleType> list() {
		// TODO Auto-generated method stub
		return articleTypeDao.list();
	}

	@Override
	public ArticleType findById(Integer id) {
		// TODO Auto-generated method stub
		return articleTypeDao.findById(id);
	}

	@Override
	public Integer save(ArticleType articleType) {
		// TODO Auto-generated method stub
		return articleTypeDao.save(articleType);
	}

	@Override
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return articleTypeDao.delete(id);
	}

	@Override
	public Integer update(ArticleType articleType) {
		// TODO Auto-generated method stub
		return articleTypeDao.update(articleType);
	}

}
