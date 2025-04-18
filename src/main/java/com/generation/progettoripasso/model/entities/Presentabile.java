package com.generation.progettoripasso.model.entities;

public interface Presentabile
{
	//di base tutto quello in un interfaccia è public e abstract se non definito altrimenti

	//proprietà final static? sì
	//le proprietà final static, costanti di classe, sono le uniche proprietà che possiamo avere
	final static Integer costante = 10;
	//proprietà static? no
	//metodi static? sì
	static void boh()
	{
		System.out.println("sono un metodo");
	}
	//metodi astratti? si
	String presentazione();//public abstract String presentazione();
	//metodi concreti? si, dalla versione 1.8 in poi
	//dobbiamo mettere default davanti al metodo
	default void bohConcreto()
	{
		System.out.println("sono un altro metodo");
	}

	//proprietà? NO



}
