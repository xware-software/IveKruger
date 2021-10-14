package com.kg.ive.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kg.ive.modelo.IveEmpleado;
import com.kg.ive.modelo.IveVacunacion;
import com.kg.ive.servicios.ServicioIveVacunacion;

@RestController
public class RestIveVacunacion {
	
	@Autowired
	private ServicioIveVacunacion servicioIveVacunacion;
	
	@RequestMapping("/ivevacunacion/ofListarXempl")
	@GetMapping("{empl}")
	private ResponseEntity<List<IveVacunacion>> ofListarXempl(@PathVariable("empl") IveEmpleado aeEmpl) {
		return ResponseEntity.ok(servicioIveVacunacion.ofListarXempl(aeEmpl) );
	}

}
