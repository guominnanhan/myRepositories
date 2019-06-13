package com.spp.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bawei.DataAPI.DateUtil;
import com.spp.entity.Article;
import com.spp.service.ArticleService;

@Controller
@RequestMapping("/article")
public class ArticleController {
	@Resource
	private ArticleService articleService;
	
	@RequestMapping("/list")
	public ModelAndView list(){
		List<Article> articleList = articleService.list();
		ModelAndView mav = new ModelAndView();
		mav.addObject("articleList", articleList);
		mav.setViewName("list");
		return mav;
	}
	
	@RequestMapping("/save")
	public String save(Article article) throws Exception{
		article.setPublicDate(DateUtil.getCurrentDateStr());
		articleService.save(article);	
		return "redirect:/list.jsp";
	}
	
	@RequestMapping("/preSave")
	public ModelAndView preSave(@RequestParam(value="id",required=false) Integer id){
		
		ModelAndView mav = new ModelAndView();
		Article article = articleService.findById(id);
		if(article != null){
			mav.addObject("article", article);
			mav.setViewName("update");
		}else {
			mav.setViewName("add");
		}
		 
		return mav;
	}
	
	@RequestMapping("/update")
	public String update(Article article) throws Exception{
		article.setPublicDate(DateUtil.getCurrentDateStr());
		articleService.update(article);
		return "redirect:/list.jsp";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="id",required=false) Integer id){
		articleService.delete(id);
		return "redirect:/list.jsp";
	}
	
	@RequestMapping("/desc")
	public ModelAndView desc(@RequestParam(value="id",required=false) Integer id){
		Article article = articleService.findById(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("article", article);
		mav.setViewName("descInfo");
		return mav;
	}
	
	@RequestMapping("/onemonthlist")
	public ModelAndView onemonthlist() throws Exception{
		int currentdate = Integer.parseInt(DateUtil.getCurrentDateStr());
		int onemonthage = currentdate - 30;
		List<Article> articleList = articleService.findInOneMonth(String.valueOf(onemonthage));
		ModelAndView mav = new ModelAndView();
		mav.addObject("articleList", articleList);
		mav.setViewName("list");
		return mav;
	}
}
