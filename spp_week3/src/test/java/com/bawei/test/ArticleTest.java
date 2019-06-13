package com.bawei.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spp.entity.Article;
import com.spp.service.ArticleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ArticleTest {
	@Resource
	private ArticleService articleService;
	
	@Test
	public void saveTest(){
		Article article = new Article();
		article.setTitle("ggg");
		article.setContent("ggggggggggggggggggggggg");
		article.setPublicDate("20000101");
		article.setTypeId(5);
		
		Integer saveResult = articleService.save(article);
		if(saveResult>0){
			System.out.println("保存数据成功");
		}else{
			System.out.println("保存数据失败");
		}
	}	
}
