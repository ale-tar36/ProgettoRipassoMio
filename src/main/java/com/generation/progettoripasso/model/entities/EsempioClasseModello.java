package com.generation.progettoripasso.model.entities;

import lombok.Data;

//fate finta che sia una Persona
//Una classe modello serve a Java per capire e sapere come è fatto qualcosa del mondo
//reale, una entità
//Perchè vogliamo farlo sapere a java?
//È più facile, ci permette di ragionare con una logica più vicina all'essere umano
//che alla macchina, anche per semplificare il codice dando dei comportamenti
//comuni ai dati
public class EsempioClasseModello
{
	//SCOPE DI CLASSE
	public static String produciCiao()
	{
		return "ciao";
	}

	private final static int MINNOME = 3;
	private final static int MAXNOME = 12;



	//proprietà, come è fatto, cosa sa di se stesso
	//INPUT DA DARE

	//L'insieme dei valori delle proprietà in un determinato
	//momento è lo STATO dell'oggetto

	//Il resto del mondo INTERAGISCE con lo STATO dell'oggetto
	//tramite GETTER e SETTER
	//Vogliamo ACCESSO CONTROLLATO alle proprietà
	//Come viene detta la forma di SoC dove un oggetto è RESPONSABILE del proprio
	//stato e l'esterno semplicemente interagisce con esso tramite GETTER e SETTER?
	//INCAPSULAMENTO

	//SCOPE DI OGGETTO
	private String nome,cognome;
	private final String boh;

	public EsempioClasseModello(String boh)
	{
		this.boh = boh;
	}


	public String getNome()
	{
		return nome;
	}

	//accetto solo nomi tra 3 e 10 caratteri
	//altrimenti mi rifiuto
	public void setNome(String nome)
	{
		if(nome==null || nome.length()<MINNOME || nome.length()>MAXNOME)
			throw new RuntimeException("No, nome non va bene, non lo imposto");

		this.nome = nome;
	}


	public String getCognome()
	{
		return cognome;
	}

	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}

	//Cosa è un metodo? Un SOTTOPROGRAMMA
	//Viene detto CONTESTO (di esecuzione) di un metodo l'insieme dei valori
	//a disposizione del metodo per lavorare
	//fanno parte del contesto il this e i parametri
	//i parametri sono valori che il chiamante passa al metodo


	//codice che viene eseguito in blocco
	//metodi, comportamento, cosa sa fare un oggetto
	//OUTPUT CHE PUÒ PRODURRE un oggetto
	public String creaPresentazione(String par1)//DICHIARANDO il metodo
	{
		//Cosa è this?
		//this è l'oggetto corrente su cui il metodo viene RICHIAMATO
		return "Ciao sono "+this.nome+" "+this.cognome+" "+par1;
	}
}
