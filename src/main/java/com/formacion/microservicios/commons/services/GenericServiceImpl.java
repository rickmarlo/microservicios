package com.formacion.microservicios.commons.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public class GenericServiceImpl<E, R extends CrudRepository<E,Long>> implements GenericService<E> {

	//inyectamos el repositorio
	@Autowired
	protected R repository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<E> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> finById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	@Transactional
	public E save(E entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

}
