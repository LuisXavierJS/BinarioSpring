package br.com.spring.binario.model;

public class DecToBin {
	private String binario;
	public String DecimalToBinario (String dec){
		try{
			int val;
			val=Integer.parseInt(dec);
			this.binario=Integer.toBinaryString(val);
			return this.binario;
		}catch (Exception e){
			e.printStackTrace();
			return "Erro!";
		}
		
	}
	
}
