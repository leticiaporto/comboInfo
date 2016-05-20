package br.edu.ifba.mobile.wmobile.comboinfo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.mobile.wmobile.comboinfo.menu.ICombo;
import br.edu.ifba.mobile.wmobile.comboinfo.menu.Notebook;
import br.edu.ifba.mobile.wmobile.comboinfo.menu.NotebookMaisUm;
import br.edu.ifba.mobile.wmobile.comboinfo.menu.NotebookMaisDois;
import br.edu.ifba.mobile.wmobile.comboinfo.menu.NotebookMaisTres;

@ManagedBean(name = "combo")
@SessionScoped
public class ComboInfo {
	private static List<ICombo> menu = new ArrayList<ICombo>();
	private String email="";
	private String nomeCliente="";
	
	static {
		ICombo combo = new Notebook();
		menu.add(combo);
		
		combo = new NotebookMaisUm(combo);
		menu.add(combo);
		
		combo = new NotebookMaisDois(combo);
		menu.add(combo);
		
		combo = new NotebookMaisTres(combo);
		menu.add(combo);
	}
	
	public String getNome() {
		return "ComboInfo";
	}
	
	public ICombo getCombo(int numero){
		return menu.get(numero-1);
	}
	
	public int getTotalCombos(){
		return menu.size();
	}
	
	public void comprar(int numero){
		if(getCombo(numero).getNome()!="Notebook")
			System.out.println("Preparar combo "+ getCombo(numero).getNome() +" para entrega à/ao cliente "+ getNomeCliente()+".");
		else
			System.out.println("Preparar "+ getCombo(numero).getNome() +" para entrega à/ao cliente "+ getNomeCliente()+".");
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getNomeCliente(){
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente){
		this.nomeCliente=nomeCliente;
	}
}