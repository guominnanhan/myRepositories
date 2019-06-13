package com.spp.dao;

import java.util.List;
import com.spp.entity.ArticleType;

public interface ArticleTypeDao {
	
	public List<ArticleType> list();
	
	public Integer save(ArticleType articleType);
	
	public Integer delete(Integer id);
	
	public Integer update(ArticleType articleType);
	
	public ArticleType findById(Integer id);
	
}
