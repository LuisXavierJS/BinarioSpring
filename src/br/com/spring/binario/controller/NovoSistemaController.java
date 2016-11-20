package br.com.spring.binario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.spring.binario.model.BinToDec;
import br.com.spring.binario.model.DecToBin;

@Controller

public class NovoSistemaController {
	@RequestMapping("/binario")
	public ModelAndView binario(@RequestParam(value="binario") String bin){
		BinToDec decimal = new BinToDec();
		int binario=decimal.BinarioToDecimal(bin);
		String nova;
		if(binario==-1){
			nova="Erro!";
		}else{
			nova=Integer.toString(binario);
		}
		ModelAndView envia = new ModelAndView("resultado");
		envia.addObject("res", nova);
		return envia;
	}
	
	@RequestMapping("/decimal")
	public ModelAndView decimal(@RequestParam(value="decimal") String dec){
		DecToBin binario = new DecToBin();
		String nova = binario.DecimalToBinario(dec);
		ModelAndView envia = new ModelAndView("resultado");
		envia.addObject("res", nova);
		return envia;
	}
}
