package com.kg.ive.rest;

import java.net.URI;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kg.ive.modelo.IveEmpleado;
import com.kg.ive.modelo.IveTipoVac;
import com.kg.ive.servicios.ServicioIveEmpleado;
import com.kg.ive.servicios.ServicioIveTipoVac;

@RestController
public class RestIveEmpleado {

	@Autowired
	private ServicioIveEmpleado servicioIveEmpleado;
	
	@Autowired
	private ServicioIveTipoVac servicioIveTipoVac;
	
	@RequestMapping("/iveempleado/ofListar")
	@GetMapping()
	private ResponseEntity<List<IveEmpleado>> ofListar() {
		System.out.println("servicioIveEmpleado " + servicioIveEmpleado.count());
		return ResponseEntity.ok(servicioIveEmpleado.findAll());
	}
	
	@RequestMapping("/iveempleado/ofListarXestado")
	@GetMapping("{estado}")
	private ResponseEntity<List<IveEmpleado>> ofListarXestado(@PathVariable("estado") Integer aiEstado) {
		return ResponseEntity.ok(servicioIveEmpleado.ofListarXestado(aiEstado));
	}
	
	@RequestMapping("/iveempleado/ofListarXtvac")
	@GetMapping("{tvac}")
	private ResponseEntity<List<IveEmpleado>> ofListarXtvac(@PathVariable("tvac") Integer aiCodigoTvac) {
		
		IveTipoVac leTvac = servicioIveTipoVac.getById(aiCodigoTvac) ;
		
		return ResponseEntity.ok(servicioIveEmpleado.ofListarXtvac(leTvac) );
	}
	
	@RequestMapping("/iveempleado/ofListarXfechaVac/{f1}/{f2}")	
	private ResponseEntity<List<IveEmpleado>> ofListarXfechaVac(@PathVariable("f1") Date adFecha1,
			@PathVariable("f2") Date adFecha2) {
		
		return ResponseEntity.ok(servicioIveEmpleado.ofListarXfechaVac(adFecha1, adFecha2 ) );
	}
	
	@PostMapping("/iveempleado/ofGuardar/{empl}")
	private ResponseEntity<IveEmpleado> ofGuardar(@PathVariable("empl") IveEmpleado aeEmpl){
		try {
			IveEmpleado leEmp = servicioIveEmpleado.save(aeEmpl);
			return ResponseEntity.created( new URI("/iveempleado/" + leEmp.getCodigoEmpl())).body(leEmp);
		}catch(Exception e0) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}		
	}
	
	@PostMapping("/iveempleado/ofLogin/{usua}")
	private ResponseEntity<IveEmpleado> ofLogin(@PathVariable("usua") String asUsuario){
		try {
			List<IveEmpleado> llEmp = servicioIveEmpleado.ofListarXusuario(asUsuario);
			if(llEmp != null && llEmp.size() == 1) {
				System.out.println("Usuario encontrado " + llEmp.get(0).getCodigoEmpl() );
				return ResponseEntity.created( new URI("/iveempleado/id/" + llEmp.get(0).getCodigoEmpl())).body(llEmp.get(0));
			}else {
				System.out.println("Usuario NO encontrado " + asUsuario ); 
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		}catch(Exception e0) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}		
	}
}
