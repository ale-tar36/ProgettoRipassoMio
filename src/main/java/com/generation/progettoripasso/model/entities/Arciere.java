package com.generation.progettoripasso.model.entities;

import lombok.Data;

@Data
public  class Arciere extends Persona implements Presentabile,Comparable<Arciere>
{
	private int lbArco;
	//quanto è potente
	@Override
	public  boolean isValid()
	{
		System.out.println("Sono isValid di arciere");
		return super.isValid() && lbArco>0;
	}

	@Override
	public String presentazione()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Ciao sono un arciere di nome ");
		sb.append(nome);
		sb.append(" con un arco da ");
		sb.append(lbArco);
		sb.append(" libbre");
		return sb.toString();
	}

	@Override
	public int compareTo(Arciere o)
	{
		return this.lbArco-o.lbArco;
		//se il metodo produce un valore positivo
		//allora this>o
		//con 0 sono uguali
		//negativo this<o
	}

	//Per Java che proprietà e che metodi ha a disposizione un oggetto di tipo Persona
	//String nome,cognome
	//Long id
	//isValid()
	//int lbArco
	//Getter e Setter
}
