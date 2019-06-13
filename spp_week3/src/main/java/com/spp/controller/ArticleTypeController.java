package com.spp.controller;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bawei.DataAPI.FileUtil;
import com.spp.entity.ArticleType;
import com.spp.service.ArticleService;
import com.spp.service.ArticleTypeService;

@Controller
@RequestMapping("/articleType")
public class ArticleTypeController {
	@Resource
	private ArticleTypeService articleTypeService;
	
	@Resource
	private ArticleService articleService;
	
	@RequestMapping("/typelist")
	public ModelAndView typelist(){
		List<ArticleType> articleTypeList = articleTypeService.list();
		ModelAndView mav = new ModelAndView();
		mav.addObject("articleTypeList", articleTypeList);
		mav.setViewName("typelist");
		return mav;
	}
	
	@RequestMapping("/typesave")
	public String typesave(ArticleType articletype){
		articleTypeService.save(articletype);	
		return "redirect:/typelist.jsp";
	}
	
	@RequestMapping("/typedelete")
	public String typedelete(@RequestParam(value="id",required=false) Integer id){
		articleTypeService.delete(id);
		return "redirect:/typelist.jsp";
	}
	
	@RequestMapping("/typedatasave")
	public String typedatasave(@RequestParam("dataFile") File dataFile){
		String readTextFile = FileUtil.readTextFile(dataFile);
		String[] types = readTextFile.split(",");
		ArticleType articleType = new ArticleType();
		for (String type : types) {
			articleType.setType(type);
			articleTypeService.save(articleType);
		}	
		return "redirect:/typelist.jsp";
	}
}
