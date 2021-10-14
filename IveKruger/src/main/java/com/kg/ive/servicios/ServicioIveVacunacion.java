package com.kg.ive.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kg.ive.modelo.IveEmpleado;
import com.kg.ive.modelo.IveVacunacion;
import com.kg.ive.repos.IfiveVacunacion;

@Service
public class ServicioIveVacunacion implements IfiveVacunacion{

	@Autowired
	private IfiveVacunacion ifiveVacunacion;

		
	@Override
	public List<IveVacunacion> findAll() {
		
		return ifiveVacunacion.findAll();
	}

	@Override
	public List<IveVacunacion> findAll(Sort sort) {
		return ifiveVacunacion.findAll(sort);
	}

	@Override
	public List<IveVacunacion> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveVacunacion> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends IveVacunacion> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveVacunacion> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<IveVacunacion> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IveVacunacion getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IveVacunacion getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveVacunacion> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveVacunacion> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<IveVacunacion> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveVacunacion> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<IveVacunacion> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		
		return ifiveVacunacion.count();
	}

	@Override
	public void deleteById(Integer id) {
		ifiveVacunacion.deleteById(id);
	}

	@Override
	public void delete(IveVacunacion entity) {
		ifiveVacunacion.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends IveVacunacion> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends IveVacunacion> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveVacunacion> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveVacunacion> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends IveVacunacion> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<IveVacunacion> ofListarXempl(IveEmpleado aeempl) {
		
		return ifiveVacunacion.ofListarXempl(aeempl);
	} 
}
