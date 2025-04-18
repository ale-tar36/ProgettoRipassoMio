package com.generation.progettoripasso.model.entities;

import lombok.Data;

import java.time.LocalDate;

@Data
public abstract class Persona extends BaseEntity
{
	//in Java abbiamo 4 livelli di visibilità per i MEMBRI di una classe
	//MEMBRO -> proprietà e metodi
	//public     -> ovunque
	//protected  -> nel package+nei sottotipi
	//package     -> nel package (viene omesso, è quello di default se non scrivete nulla)
	//private    -> solo nella classe stessa


	//qui NON SONO OBBLIGATO a fare override, poichè anche Persona è astratta
	//e quindi può contenere metodi astratti
	protected String nome,cognome;
	protected LocalDate dob;

	//versione principale
	public void setDob(LocalDate dob)
	{
		if(dob.isAfter(LocalDate.now()))
			throw new RuntimeException("E io sono nato domani");
		this.dob= dob;
	}

	public void setDob(String dobString)
	{
		LocalDate parametroDefault = LocalDate.parse(dobString);
		setDob(parametroDefault);
	}

	public void setDob(int anno,int mese,int giorno)
	{
		LocalDate parametroDefault = LocalDate.of(anno,mese,giorno);
		//richiamo versione principale
		//facciamo questo per rispettare il D.R.Y. Dont repeat yourself
		//rispettiamo anche il K.I.S.S. keep it simple stupid
		setDob(parametroDefault);
	}

	//versioni diverse dello stesso metodo distinte dal numero/tipo di parametri
	//il chiamante decide quale metodo usare in base ai parametri che passa
	//viene utilizzato per rendere una funzionalità più versatile
	public Persona()
	{

	}

	public Persona(String nome, String cognome)
	{
		this.nome = nome;
		this.cognome = cognome;
	}

	@Override
	public boolean isValid()
	{
		return nome!=null && !nome.isBlank() && cognome!=null && !cognome.isBlank();
	}


	//Per Java che proprietà e che metodi ha a disposizione un oggetto di tipo Persona
	//String nome,cognome
	//Long id
	//isValid()
	//Getter e Setter
}
