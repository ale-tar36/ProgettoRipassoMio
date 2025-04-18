package com.generation.progettoripasso.model.entities;

import lombok.Data;

@Data
public class Cavaliere extends Persona
{
	private String nomeCavallo;

	@Override
	public boolean isValid()
	{
		return super.isValid() && nomeCavallo!=null && !nomeCavallo.isBlank();
	}

	//Per Java che proprietà e che metodi ha a disposizione un oggetto di tipo Persona
	//String nome,cognome
	//Long id
	//isValid()
	//String nomeCavallo
	//Getter e Setter
}
