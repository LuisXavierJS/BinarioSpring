package br.com.spring.binario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SistemaController {
	@RequestMapping("/cadastro")
	public ModelAndView bin(@RequestParam String valor){
		ModelAndView novo = new ModelAndView(valor);
		return novo;
	}
	
}
