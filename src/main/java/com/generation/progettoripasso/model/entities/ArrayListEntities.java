package com.generation.progettoripasso.model.entities;

import java.util.ArrayList;

public class ArrayListEntities<E extends BaseEntity> extends ArrayList<E> implements ListEntities<E>
{
	@Override
	public E findById(Long id)
	{
		for(E e : this)
			if(e.getId().equals(id))
				return e;

		return null;
	}
}
