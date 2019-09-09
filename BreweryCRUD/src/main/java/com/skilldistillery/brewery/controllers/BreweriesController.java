package com.skilldistillery.brewery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.brewery.data.BreweriesDAO;
import com.skilldistillery.brewery.entities.Breweries;


@Controller
@ComponentScan(basePackages= {"com.skilldistillery.brewery"})
public class BreweriesController {
	@Autowired
	private BreweriesDAO dao;
	
	
	@RequestMapping(value={"", "/", "index.do"}, method=RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("brew", new Breweries());
		List<Breweries> breweries = dao.findAllBreweries();
		model.addAttribute("breweries", breweries);
		return "WEB-INF/index.jsp";
		// return "index"; // if using a ViewResolver.
	}
	
	@RequestMapping(path = "getAllBreweries.do", method = RequestMethod.GET)
	public ModelAndView getAllBreweries() {
		List<Breweries> allBreweries = dao.findAllBreweries();
		ModelAndView mv = new ModelAndView();
		mv.addObject("allBreweries", allBreweries);
		mv.setViewName("WEB-INF/showAll.jsp");
		return mv;
	}

	@RequestMapping(path = "createBrewery.do", method = RequestMethod.POST)
	public String createBrewery( @ModelAttribute("brew")Breweries brew, Model model) {
		model.addAttribute("brew", brew);
		dao.newBreweries(brew);
		return "/WEB-INF/index.jsp";
	}
	

	@RequestMapping(path = "deleteBrewery.do", method = RequestMethod.POST)
	public ModelAndView deleteBean(Breweries brew) {
		ModelAndView mv = new ModelAndView();
		boolean deleted = dao.deleteBreweries(dao.findBreweriesById(brew.getId()));
		mv.setViewName("WEB-INF/delete.jsp");
		mv.setViewName("redirect:deletedBrewery.do");

		return mv;
	}
	@RequestMapping(path = "deletedBrewery.do", method = RequestMethod.GET)
	public ModelAndView deleted() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/delete.jsp");
		return mv;
	}
	
	@RequestMapping(path = "updateBrewery.do", method = RequestMethod.GET)
	public ModelAndView update(Breweries b) {
		ModelAndView mv = new ModelAndView();
		b = dao.update(b.getId(), b);
		mv.addObject("brew", b);
		mv.setViewName("WEB-INF/edit.jsp");
		return mv;

	}
	
//	@RequestMapping(path = "edit14er.do", method = RequestMethod.GET)
//	public ModelAndView editFilm(Fourteener f) {
//		ModelAndView mv = new ModelAndView();
//		f = dao.findById(f.getId());
//		mv.addObject("ranges", dao.getMtnRanges());
//		mv.addObject("editMTN", f);
//		mv.setViewName("CRUD");
//		return mv;
//	}
	
}