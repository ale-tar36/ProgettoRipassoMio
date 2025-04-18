package com.generation.progettoripasso.filtercasereccio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Filtro
{
	public static void main(String[] args)
	{
		List<String> l = new ArrayList<>();
		l.add("aaaa");
		l.add("bb");
		l.add("ccc");
		l.add("dddddd");
		l.add("ee");

		//artigianale
		List<String> filtrata = listaFiltrataArtigianale(l,s->s.length()>3);
		//artigianale brutto brutto
		Condizione<String> c  = new Condizione<String>()
		{//classe anonima
			@Override
			public boolean verifica(String s)
			{
				return s.length()>3;
			}
		};
		List<String> filtrataBrutta = listaFiltrataArtigianale(l,c);
		//vero
		List<String> filtrataStream = l.stream().filter(s->s.length()>3).toList();
		//						dico come confrontare s1 con s2, s1 è più grande se restituisce un numero positivo, ecc..., come il compareTo
		List<String> clone = new ArrayList<>(l);
		Collections.sort(clone,(s1,s2)->s1.length()-s2.length());
		System.out.println(clone);
	}

	//metodo filter dello stream artigianale
	public static List<String> listaFiltrataArtigianale(List<String> daFiltrare,Condizione<String> c)
	{
		List<String> res = new ArrayList<>();

		for(String s:daFiltrare)
			if(c.verifica(s))
				res.add(s);

		return res;
	}
}
