package com.generation.progettoripasso.model.entities;

import java.util.List;

//							pongo un vincolo sui tipi possibili
//							Il tipo passato deve essere BaseEntity o un suo sottotipo
//Un generics è una parametrizzazione del tipo di ritorno/dei parametri
//dei metodi di una classe o di una Interfaccia
//Viene definito nel momento della compilazione del codice (non in runtime)
public interface ListEntities<E extends BaseEntity> extends List<E>
{

	default boolean add(E e,boolean validityControl)
	{
		if(!e.isValid() && validityControl)
			throw new RuntimeException("aggiungo solo entità valide");

		return add(e);
	}

	E findById(Long id);
}
