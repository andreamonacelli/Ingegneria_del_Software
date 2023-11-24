package com.amonacelli.ingegneriasoftware.studentDynamicProxy;

public class UserBeanImpl implements UserBean {
	String nome;
	String cognome;
	String matricola;
  
	public String getNome() {
		return nome;
	} 
  
	public String getCognome() {
		return cognome;
	}
  
	public String getMatricola() {
		return matricola;
	}
  
 
	public void setNome(String nome) {
		this.nome = nome;
	}
 
	public void setCognome(String cognome) {
		this.cognome = cognome;
	} 
  
	public void setMatricola(String interests) {
		this.matricola = matricola;
	}
}
