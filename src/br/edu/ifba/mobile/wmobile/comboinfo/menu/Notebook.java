package br.edu.ifba.mobile.wmobile.comboinfo.menu;

import java.util.ArrayList;
import java.util.List;

public class Notebook implements IItens {

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Notebook";
	}

	@Override
	public List<String> getItens() {
		// TODO Auto-generated method stub
		List<String> itens = new ArrayList <String>();
		itens.add("Notebook");
		return itens;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 900.0;
	}

}
