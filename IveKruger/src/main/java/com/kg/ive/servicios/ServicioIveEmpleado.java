package com.kg.ive.servicios;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kg.ive.modelo.IveEmpleado;
import com.kg.ive.modelo.IveTipoVac;
import com.kg.ive.repos.IfiveEmpleado;

@Service
public class ServicioIveEmpleado implements IfiveEmpleado {

	@Autowired
	private IfiveEmpleado ifiveEmpleado;

	@Override
	public List<IveEmpleado> findAll() {
		
		return ifiveEmpleado.findAll();
	}

	@Override
	public List<IveEmpleado> findAll(Sort sort) {
		return ifiveEmpleado.findAll(sort);
	}

	@Override
	public List<IveEmpleado> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveEmpleado> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends IveEmpleado> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveEmpleado> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<IveEmpleado> entities) {
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
	public IveEmpleado getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IveEmpleado getById(Integer id) {
		
		return ifiveEmpleado.getById(id) ;
	}

	@Override
	public <S extends IveEmpleado> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveEmpleado> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<IveEmpleado> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveEmpleado> S save(S entity) {
		
		return ifiveEmpleado.save(entity);
	}

	@Override
	public Optional<IveEmpleado> findById(Integer id) {
		
		return ifiveEmpleado.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		
		return ifiveEmpleado.count();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(IveEmpleado entity) {		
		ifiveEmpleado.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends IveEmpleado> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends IveEmpleado> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveEmpleado> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IveEmpleado> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends IveEmpleado> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<IveEmpleado> ofListarXtvac(IveTipoVac aetvac) {
		
		return ifiveEmpleado.ofListarXtvac(aetvac);
	}

	@Override
	public List<IveEmpleado> ofListarXestado(Integer aivacunado) {
		
		return ifiveEmpleado.ofListarXestado(aivacunado);
	}

	@Override
	public List<IveEmpleado> ofListarXfechaVac(Date adfecha1, Date adfecha2) {
		
		return ifiveEmpleado.ofListarXfechaVac(adfecha1, adfecha2);
	}

	@Override
	public List<IveEmpleado> ofListarXusuario(String asusuario) {
		
		return ifiveEmpleado.ofListarXusuario(asusuario);
	}
	
}
