package com.generation.progettoripasso.model.entities;

import lombok.Data;

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
