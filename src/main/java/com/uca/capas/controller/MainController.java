package com.uca.capas.controller;

import com.uca.capas.domain.Producto;
import com.uca.capas.domain.Robot;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class MainController {

	@RequestMapping("/producto")
	public ModelAndView initMain() {
		Producto producto = new Producto();

		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", producto);
		mav.setViewName("index");

		return mav;
	}

	@RequestMapping("/formProducto")
	public ModelAndView formProducto(@Valid @ModelAttribute Producto producto, BindingResult br) {
		ModelAndView mav = new ModelAndView();
		if(br.hasErrors()) {
			mav.setViewName("index");
		} else {
			mav.addObject("robot", new Robot());
			mav.setViewName("robot");
		}

		return mav;
	}

	@RequestMapping("/seguridad")
	public ModelAndView formSeguridad(@Valid @ModelAttribute Robot robot, BindingResult br) {
		ModelAndView mav = new ModelAndView();
		if(br.hasErrors()) {
			mav.setViewName("robot");
		} else {
			mav.setViewName("exito");
		}

		return mav;
	}
}
