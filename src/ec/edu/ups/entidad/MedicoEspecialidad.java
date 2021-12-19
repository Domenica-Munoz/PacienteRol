package ec.edu.ups.entidad;

import java.io.Serializable;

import javax.inject.Named;
import javax.persistence.*;

@Entity
@Named("medicoEspecialidad")
public class MedicoEspecialidad implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int idMedicoEspecialidad;
	private Doctor idDoctor;
	@ManyToOne
	@JoinColumn
	private Especialidad idEspecialidad;
	
	public MedicoEspecialidad() {
		super();
	}

	public int getIdMedicoEspecialidad() {
		return idMedicoEspecialidad;
	}

	public void setIdMedicoEspecialidad(int idMedicoEspecialidad) {
		this.idMedicoEspecialidad = idMedicoEspecialidad;
	}

	public Doctor getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Doctor idDoctor) {
		this.idDoctor = idDoctor;
	}

	public Especialidad getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(Especialidad idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	@Override
	public String toString() {
		return "MedicoEspecialidad [idMedicoEspecialidad=" + idMedicoEspecialidad + ", idDoctor=" + idDoctor
				+ ", idEspecialidad=" + idEspecialidad + "]";
	}
	
}
