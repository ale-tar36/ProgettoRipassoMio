package com.generation.progettoripasso;

import com.generation.progettoripasso.model.entities.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ProgettoRipassoApplicationTests
{

	@Test
	void contextLoads()
	{

		Arciere a = new Arciere();
		//Per Java che proprietà e che metodi ha a disposizione un oggetto di tipo Persona
		//String nome,cognome
		//Long id
		//isValid()
		//int lbArco
		//Getter e Setter
		a.setId(1L);
		a.setNome("Stefano");
		a.setCognome("Rubinetti");
		a.setLbArco(67);

		System.out.println(a.isValid());

		Persona p = a;//io ora ho collegato la variabile p all'oggetto Arciere in memoria,
		//ma sto dicendo a Java di vederlo come una Persona
		//Per Java che proprietà e che metodi ha a disposizione un oggetto di tipo Persona
		//String nome,cognome
		//Long id
		//isValid()
		//Getter e Setter
//		p.setLbArco(-50);
		System.out.println(p.isValid());
		//pollice) stampa false, perchè nel isValid di Arciere abbiamo le libbre e non vanno bene
		//faccina) stampa true, perchè lo vede come una Persona, nel isValid di Persona non si parla
		//di libbre e nome e cognome vanno bene
		//POLLICE

		BaseEntity b = a;
		System.out.println(b.isValid());

		Presentabile pre = a;//vedo l'arciere come l'interfaccia
		//posso richiamare solo i metodi definiti nell'interfaccia

		Arciere a2 = new Arciere();
		a2.setId(2L);
		a2.setNome("Donato");
		a2.setCognome("Morra");
		a2.setLbArco(49);

		Arciere a3 = new Arciere();
		a3.setId(3L);
		a3.setNome("Domenico");
		a3.setCognome("Farano");
		a3.setLbArco(800);

		Arciere a4 = new Arciere();
		a4.setId(4L);
		a4.setNome("Edoardo");
		a4.setCognome("Sannia");
		a4.setLbArco(100);


		List<Arciere> arcieri = new ArrayList<>();
		arcieri.add(a);
		arcieri.add(a2);
		arcieri.add(a3);
		arcieri.add(a4);

		//La lista è ordinabile grazie al fatto che i singoli elementi al suo interno
		//possono essere visti come Comparable
		Collections.sort(arcieri);
	}

//	@Test
//	void listeBrutte()
//	{
//		List<Arciere> listaSenzaGenerics = new ArrayList<>();
//		Arciere a2 = new Arciere();
//		a2.setId(2L);
//		a2.setNome("Donato");
//		a2.setCognome("Morra");
//		a2.setLbArco(49);
//
//		Arciere a3 = new Arciere();
//		a3.setId(3L);
//		a3.setNome("Domenico");
//		a3.setCognome("Farano");
//		a3.setLbArco(800);
//		listaSenzaGenerics.add(a2);
//		listaSenzaGenerics.add(a3);
//
//		String a4 = "Sono un arciere";
//		listaSenzaGenerics.add(a4);
//
//		Arciere preso = (Arciere) listaSenzaGenerics.get(0);
//
//		for(Object o:listaSenzaGenerics)
//		{
//			Arciere iesimo = (Arciere) o;
//		}
//	}

	@Test
	void listeNostre()
	{
		ListEntities<Arciere> lista = new ArrayListEntities<>();
		Arciere a2 = new Arciere();
		a2.setId(2L);
		a2.setNome("Donato");
		a2.setCognome("Morra");
		a2.setLbArco(49);

		Arciere a3 = new Arciere();
		a3.setId(3L);
		a3.setNome("Domenico");
		a3.setCognome("Farano");
		a3.setLbArco(800);

		Arciere a4 = new Arciere();
		a4.setId(4L);
		a4.setNome("Edoardo");
		a4.setCognome("Sannia");
		a4.setLbArco(100);

		lista.add(a2);
		lista.add(a3,true);//se non `e valido da eccezione
		lista.add(a4);

		Arciere conId3 = lista.findById(3L);
		//non posso farlo perchè String non estende BaseEntity
//		ListEntities<String> lista2 = new ArrayListEntities<>();

	}

//	void sort(List<Comparable> daOrdinare)
//	{
//		for(int i=0;i<daOrdinare.size();i++)
//		{
//			Comparable corrente = daOrdinare.get(i);
//			Comparable successivo = daOrdinare.get(i+1);
//
//			if(corrente.compareTo(successivo)>0)
//				//allora corrente è più grande di successivo
//		}
//	}
}
