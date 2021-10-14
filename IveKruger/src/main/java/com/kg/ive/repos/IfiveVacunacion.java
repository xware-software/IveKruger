package com.kg.ive.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kg.ive.modelo.IveEmpleado;
import com.kg.ive.modelo.IveVacunacion;

public interface IfiveVacunacion extends JpaRepository<IveVacunacion, Integer> {

	@Query(value = "Select v From IveVacunacion v "
		+ "Where v.iveEmpleado = :aeempl "		
		+ "order by v.fechaVacu ")
	List<IveVacunacion> ofListarXempl(@Param("aeempl") IveEmpleado aeempl);
		
}
