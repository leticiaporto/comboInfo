package br.edu.ifba.mobile.wmobile.comboinfo.menu;

import java.util.List;

public class NotebookMaisDois implements IItens {
	private IItens anterior;
	
	public NotebookMaisDois(IItens anterior){
		this.anterior=anterior;
	}
	
	public String getNome(){
		return "Notebook+2";
	}
	
	public List<String> getItens(){
		List<String> itens = anterior.getItens();
		itens.add("MousePad");
		return itens;
	}
	
	@Override
	public double getPreco() {
		return anterior.getPreco() + 5.0;
	}

	

}
