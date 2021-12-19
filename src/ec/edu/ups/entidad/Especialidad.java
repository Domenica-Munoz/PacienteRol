package ec.edu.ups.entidad;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "especialidad")
public class Especialidad implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int idEspecialidad;
	private String nombreEspecialidad;
	private String descripcionEspecialidad;
	private Doctor idDoctor;
	
	public Especialidad() {
		super();
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}

	public String getDescripcionEspecialidad() {
		return descripcionEspecialidad;
	}

	public void setDescripcionEspecialidad(String descripcionEspecialidad) {
		this.descripcionEspecialidad = descripcionEspecialidad;
	}

	public Doctor getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Doctor idDoctor) {
		this.idDoctor = idDoctor;
	}

	@Override
	public String toString() {
		return "Especialidad [idEspecialidad=" + idEspecialidad + ", nombreEspecialidad=" + nombreEspecialidad
				+ ", descripcionEspecialidad=" + descripcionEspecialidad + ", idDoctor=" + idDoctor + "]";
	}

}
