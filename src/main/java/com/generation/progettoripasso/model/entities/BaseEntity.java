package com.generation.progettoripasso.model.entities;

import lombok.Data;

//Cosa è una classe Astratta?
//Non può essere instanziata
//Viene usata come punto di partenza per altre classi,
//nasce per essere estesa
@Data
public abstract class BaseEntity
{
	//Cosa può contenere al suo interno?
	//TUTTO
	//proprietà final static? si
	private final static int MINNOME = 3;
	//proprietà static? si
	private static String a = "ciao";
	//metodi static? si
	public static String produciCiao()
	{
		return "ciao";
	}
	//proprietà? si
	private Long id;
	//metodi? si
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	//metodi astratti? si
	//cosa è? Metodo senza corpo, senza codice, solo firma
	//utilizzo: metodi che vogliamo poter richiamare sul supertipo ma che necessitano
	//di dati più specifici per poter realmente lavorare
	public abstract boolean isValid();
	//Se una classe Concreta (non abstract) eredita un metodo abstract,
	//è obbligata a fare override
}
