package com.kg.ive.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ivevacunacion")
public class IveVacunacion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "codigovacu")
	private Integer codigoVacu;
	
	@Column(name = "fechaVacu")
	private Date fechaVacu;
	
	@Column(name = "numdosisVacu")
	private Integer numdosisVacu;
	
	@ManyToOne
	@JoinColumn(name = "codigotvac")
	private IveTipoVac iveTipoVac;
	
	@ManyToOne
	@JoinColumn(name = "codigoEmpl")
	private IveEmpleado iveEmpleado;

			
	public IveVacunacion() {
		
	}

	public IveVacunacion(Date fechaVacu, Integer numdosisVacu, IveTipoVac iveTipoVac, IveEmpleado iveEmpleado) {
		super();
		this.fechaVacu = fechaVacu;
		this.numdosisVacu = numdosisVacu;
		this.iveTipoVac = iveTipoVac;
		this.iveEmpleado = iveEmpleado;
	}



	public Integer getCodigoVacu() {
		return codigoVacu;
	}

	public void setCodigoVacu(Integer codigoVacu) {
		this.codigoVacu = codigoVacu;
	}

	public Date getFechaVacu() {
		return fechaVacu;
	}

	public void setFechaVacu(Date fechaVacu) {
		this.fechaVacu = fechaVacu;
	}

	public Integer getNumdosisVacu() {
		return numdosisVacu;
	}

	public void setNumdosisVacu(Integer numdosisVacu) {
		this.numdosisVacu = numdosisVacu;
	}

	public IveTipoVac getIveTipoVac() {
		return iveTipoVac;
	}

	public void setIveTipoVac(IveTipoVac iveTipoVac) {
		this.iveTipoVac = iveTipoVac;
	}

	public IveEmpleado getIveEmpleado() {
		return iveEmpleado;
	}

	public void setIveEmpleado(IveEmpleado iveEmpleado) {
		this.iveEmpleado = iveEmpleado;
	}
	
	
	
	
}
