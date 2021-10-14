package com.kg.ive.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kg.ive.modelo.IveTipoVac;
import com.kg.ive.repos.IfiveTipoVac;

@Service
public class ServicioIveTipoVac implements IfiveTipoVac {

	@Autowired
	private IfiveTipoVac ifiveTipoVac;

	@Override
	public List<IveTipoVac> findAll() {		
		return ifiveTipoVac.findAll();
	}

	@Override
	public List<IveTipoVac> findAll(Sort sort) {
		return ifiveTipoVac.findAll(sort);
	}

	@Override
	public List<IveTipoVac> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveTipoVac> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends IveTipoVac> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveTipoVac> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<IveTipoVac> entities) {
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
	public IveTipoVac getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IveTipoVac getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveTipoVac> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveTipoVac> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<IveTipoVac> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveTipoVac> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<IveTipoVac> findById(Integer id) {
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
		
		return ifiveTipoVac.count();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		ifiveTipoVac.deleteById(id);
	}

	@Override
	public void delete(IveTipoVac entity) {
		// TODO Auto-generated method stub
		ifiveTipoVac.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends IveTipoVac> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends IveTipoVac> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveTipoVac> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveTipoVac> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends IveTipoVac> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}
