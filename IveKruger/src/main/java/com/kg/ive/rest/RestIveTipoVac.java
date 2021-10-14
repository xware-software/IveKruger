package com.kg.ive.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kg.ive.modelo.IveTipoVac;
import com.kg.ive.servicios.ServicioIveTipoVac;

@RestController
public class RestIveTipoVac {

	@Autowired
	private ServicioIveTipoVac servicioIveTipoVac; 
	
	@RequestMapping("/ivetipovac/ofListarTvac")
	@GetMapping()
	private ResponseEntity<List<IveTipoVac>> ofListarTvac() {
		return ResponseEntity.ok(servicioIveTipoVac.findAll());
	}
}
