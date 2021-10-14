package com.kg.ive.modelo;

import java.util.Date;
import java.util.Objects;

import javax.persistence.*;
//import javax.validation.constraints.Pattern;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="iveempleado")
public class IveEmpleado {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "codigoempl")
	private Integer codigoEmpl;
	
	@Pattern(message = "El campo Cédula solo debe contener números", regexp = "^[0-9]*$")
	@Column(name = "cedulaempl", length=10)
	private String cedulaEmpl;
	
	@Pattern(message = "El campo Nombre solo debe contener letras", regexp = "^[A-Za-zÑñáéíóúÁÉÍÓÚ ]*$")
	@Column(name = "nombresempl", length=100)
	private String nombresEmpl;
	
	@Pattern(message = "El campo Nombre solo debe contener letras", regexp = "^[A-Za-zÑñáéíóúÁÉÍÓÚ ]*$")
	@Column(name = "apellidosempl", length=100)
	private String apellidosEmpl;
	
	@Email
	@Column(name = "correoempl", length=150)
	private String correoEmpl;
	
	@Column(name = "usuarioempl", length=50)
	private String usuarioEmpl;
	
	@Column(name = "contrasempl", length=50)
	private String contrasEmpl;
	
	@Column(name = "fechanacimempl")
	private Date fechanacimEmpl;
		
	@Column(name = "dirdomincempl", length=200)
	private String dirdomincEmpl;
	
	@Column(name = "telefmovilempl", length=20)
	private String telefmovilEmpl;
	
	@Column(name = "rolempl")
	private Integer rolEmpl;

	@Column(name = "vacunadoempl")
	private Integer vacunadoEmpl;
	
	public IveEmpleado() {
		
	}
	
	public IveEmpleado(String cedulaEmpl, String nombresEmpl, String apellidosEmpl, String correoEmpl,
			String usuarioEmpl, String contrasEmpl, Integer rolEmpl) {
		super();
		this.cedulaEmpl = cedulaEmpl;
		this.nombresEmpl = nombresEmpl;
		this.apellidosEmpl = apellidosEmpl;
		this.correoEmpl = correoEmpl;
		this.usuarioEmpl = usuarioEmpl;
		this.contrasEmpl = contrasEmpl;
		this.rolEmpl = rolEmpl;
	}
	
	public IveEmpleado(String cedulaEmpl, String nombresEmpl, String apellidosEmpl, String correoEmpl,
			String usuarioEmpl, String contrasEmpl, Date fechanacimEmpl, String dirdomincEmpl, String telefmovilEmpl,
			Integer rolEmpl, Integer vacunadoEmpl) {
		super();
		this.cedulaEmpl = cedulaEmpl;
		this.nombresEmpl = nombresEmpl;
		this.apellidosEmpl = apellidosEmpl;
		this.correoEmpl = correoEmpl;
		this.usuarioEmpl = usuarioEmpl;
		this.contrasEmpl = contrasEmpl;
		this.fechanacimEmpl = fechanacimEmpl;
		this.dirdomincEmpl = dirdomincEmpl;
		this.telefmovilEmpl = telefmovilEmpl;
		this.rolEmpl = rolEmpl;
		this.vacunadoEmpl = vacunadoEmpl;
	}



	@Override
	public String toString() {
		return nombresEmpl + " " + apellidosEmpl;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cedulaEmpl);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IveEmpleado other = (IveEmpleado) obj;
		return Objects.equals(cedulaEmpl, other.cedulaEmpl);
	}



	public Integer getCodigoEmpl() {
		return codigoEmpl;
	}

	public void setCodigoEmpl(Integer codigoEmpl) {
		this.codigoEmpl = codigoEmpl;
	}

	public String getCedulaEmpl() {
		return cedulaEmpl;
	}

	public void setCedulaEmpl(String cedulaEmpl) {
		this.cedulaEmpl = cedulaEmpl;
	}

	public String getNombresEmpl() {
		return nombresEmpl;
	}

	public void setNombresEmpl(String nombresEmpl) {
		this.nombresEmpl = nombresEmpl;
	}

	public String getApellidosEmpl() {
		return apellidosEmpl;
	}

	public void setApellidosEmpl(String apellidosEmpl) {
		this.apellidosEmpl = apellidosEmpl;
	}

	public String getCorreoEmpl() {
		return correoEmpl;
	}

	public void setCorreoEmpl(String correoEmpl) {
		this.correoEmpl = correoEmpl;
	}

	public String getUsuarioEmpl() {
		return usuarioEmpl;
	}

	public void setUsuarioEmpl(String usuarioEmpl) {
		this.usuarioEmpl = usuarioEmpl;
	}

	public String getContrasEmpl() {
		return contrasEmpl;
	}

	public void setContrasEmpl(String contrasEmpl) {
		this.contrasEmpl = contrasEmpl;
	}

	public Date getFechanacimEmpl() {
		return fechanacimEmpl;
	}

	public void setFechanacimEmpl(Date fechanacimEmpl) {
		this.fechanacimEmpl = fechanacimEmpl;
	}

	public String getDirdomincEmpl() {
		return dirdomincEmpl;
	}

	public void setDirdomincEmpl(String dirdomincEmpl) {
		this.dirdomincEmpl = dirdomincEmpl;
	}

	public String getTelefmovilEmpl() {
		return telefmovilEmpl;
	}

	public void setTelefmovilEmpl(String telefmovilEmpl) {
		this.telefmovilEmpl = telefmovilEmpl;
	}

	public Integer getRolEmpl() {
		return rolEmpl;
	}

	public void setRolEmpl(Integer rolEmpl) {
		this.rolEmpl = rolEmpl;
	}
	
	
	
}
