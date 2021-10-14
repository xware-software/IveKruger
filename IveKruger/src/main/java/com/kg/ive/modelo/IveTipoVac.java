package com.kg.ive.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ivetipovac" )
public class IveTipoVac {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer codigotvac;
	
//	@Pattern(message = "El campo Cédula solo debe contener números", regexp = "^[0-9]*$")
	@Column(name = "nombretvac", length=50)
	private String nombretvac;

	
	
	
	public IveTipoVac() {
			
	}

	@Override
	public String toString() {
		return nombretvac;
	}

	public Integer getCodigotvac() {
		return codigotvac;
	}

	public void setCodigotvac(Integer codigotvac) {
		this.codigotvac = codigotvac;
	}

	public String getNombretvac() {
		return nombretvac;
	}

	public void setNombretvac(String nombretvac) {
		this.nombretvac = nombretvac;
	}
	
	
	
	
}
