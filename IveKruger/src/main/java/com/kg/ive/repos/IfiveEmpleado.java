package com.kg.ive.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kg.ive.modelo.IveEmpleado;
import com.kg.ive.modelo.IveTipoVac;


public interface IfiveEmpleado extends JpaRepository<IveEmpleado, Integer> {

	
	@Query(value = "Select e From IveEmpleado e "
		+ "Where e.vacunadoEmpl = :aivacunado "
		+ "order by e.apellidosEmpl, e.nombresEmpl ")
	List<IveEmpleado> ofListarXestado(@Param("aivacunado") Integer aivacunado);
	
	@Query(value = "Select distinct e From IveEmpleado e, IveVacunacion v "
		+ "Where v.iveEmpleado = e "
		+ "and v.iveTipoVac = :aetvac "
		+ "order by e.apellidosEmpl, e.nombresEmpl ")
	List<IveEmpleado> ofListarXtvac(@Param("aetvac") IveTipoVac aetvac);
		
	@Query(value = "Select distinct e From IveEmpleado e, IveVacunacion v "
		+ "Where v.iveEmpleado = e "
		+ "and v.fechaVacu >= :adfecha1 "
		+ "and v.fechaVacu <= :adfecha2 "
		+ "order by e.apellidosEmpl, e.nombresEmpl ")
	List<IveEmpleado> ofListarXfechaVac(@Param("adfecha1") Date adfecha1,
			@Param("adfecha2") Date adfecha2 );
	
	@Query(value = "Select e From IveEmpleado e "
		+ "Where e.usuarioEmpl = :asusuario ")
	List<IveEmpleado> ofListarXusuario(@Param("asusuario") String asusuario);
}
