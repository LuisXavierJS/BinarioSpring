package br.com.spring.binario.model;

public class BinToDec {
	
	private int Decimal;
	
	public int BinarioToDecimal(String bin){
		try{
			this.Decimal=Integer.parseInt(bin,2);
			return this.Decimal;
		}catch (Exception e){
			e.printStackTrace();
			return -1;
		}
	}
}
