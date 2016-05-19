package br.edu.ifba.mobile.wmobile.comboinfo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.mobile.wmobile.comboinfo.menu.IItens;
import br.edu.ifba.mobile.wmobile.comboinfo.menu.Notebook;
import br.edu.ifba.mobile.wmobile.comboinfo.menu.NotebookMaisUm;
import br.edu.ifba.mobile.wmobile.comboinfo.menu.NotebookMaisDois;
import br.edu.ifba.mobile.wmobile.comboinfo.menu.NotebookMaisTres;

@ManagedBean(name = "combo")
@SessionScoped
public class ComboInfo {
	private static List<IItens> menu = new ArrayList<IItens>();
	private String email="";
	private String nomeCliente="";
	
	static {
		IItens item = new Notebook();
		menu.add(item);
		
		item = new NotebookMaisUm(item);
		menu.add(item);
		
		item = new NotebookMaisDois(item);
		menu.add(item);
		
		item = new NotebookMaisTres(item);
		menu.add(item);
	}
	
	public String getNome() {
		return "ComboInfo";
	}
	
	public IItens getCombo(int numero){
		return menu.get(numero-1);
	}
	
	public int getTotalItens(){
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