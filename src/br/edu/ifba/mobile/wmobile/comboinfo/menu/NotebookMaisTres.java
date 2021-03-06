package br.edu.ifba.mobile.wmobile.comboinfo.menu;

import java.util.List;

public class NotebookMaisTres implements ICombo {
	private ICombo anterior;
	
	public NotebookMaisTres(ICombo anterior){
		this.anterior=anterior;
	}
	
	public String getNome(){
		return "Notebook+3";
	}
	
	public List<String> getItens(){
		List<String> itens = anterior.getItens();
		itens.add("Impressora");
		return itens;
	}
	
	@Override
	public double getPreco() {
		return anterior.getPreco() + 280.0;
	}

	

}
