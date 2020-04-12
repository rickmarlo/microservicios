package com.formacion.microservicios.commons.services;

import java.util.Optional;


public interface GenericService<E> {
	
	public Iterable<E> findAll();
	
	public Optional<E> finById(Long id);
	
	public E save(E entity);
	
	public void deleteById(Long id);

}
