package com.generation.progettoripasso.model.entities;

public class MegaArciere extends Arciere
{
	//final nelle proprietà indica costanti
	//nelle classi o nei metodi indica che è la loro versione finale e definitiva
	//le classi final NON possono essere estese
	//i metodi final NON possono essere Overridati


	@Override
	public final boolean isValid()
	{
		return true;
	}
}
