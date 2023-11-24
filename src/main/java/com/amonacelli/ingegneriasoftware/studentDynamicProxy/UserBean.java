package com.amonacelli.ingegneriasoftware.studentDynamicProxy;

public interface UserBean {
 
	String getNome();
	String getCognome();
	String getMatricola();
    boolean isIscritto();
 
    void setNome(String nome);
    void setCognome(String cognome);
    void setMatricola(String matricola);
    void setIscritto(boolean iscritto);
}
