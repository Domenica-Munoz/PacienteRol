package ec.edu.ups.controlador;

import java.io.Serializable;
import java.time.LocalTime;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import ec.edu.ups.entidad.Doctor;
import ec.edu.ups.entidad.Paciente;

@Named
@SessionScoped
public class CitasMedicasBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int idCita;
	private Paciente idPaciente;
	private Doctor idDoctor;
	private LocalTime fechaCita;
	private String sintomatologia;
	private String estadoCita;
	private String comentarioCita;
	private double costo;
	
	
	
}
