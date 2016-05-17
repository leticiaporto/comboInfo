package br.edu.ifba.mobile.wmobile.comboinfo.menu;

import java.util.List;

public class NotebookMaisUm implements IItens {

	private IItens anterior;
	
	public NotebookMaisUm (IItens anterior) {
		this.anterior = anterior;
	}
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Notebook+1";
	}

	@Override
	public List<String> getItens() {
		// TODO Auto-generated method stub
		List<String> itens= anterior.getItens();
		itens.add("Mouse");
		return itens;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return anterior.getPreco() + 15.0;
	}
	

}
