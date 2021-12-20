package ec.edu.ups.controlador;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import ec.edu.ups.ejb.DoctorFacade;
import ec.edu.ups.entidad.CitasMedicas;
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
	private List<CitasMedicas> listacitas;
	private String cedula;
	
	@EJB
	private DoctorFacade ejbdoctor;
	
	
	public void buscarcitasmedicas (){
		listacitas=ejbdoctor.buscarcitapormedico(cedula);
		
	}



	public int getIdCita() {
		return idCita;
	}



	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}



	public Paciente getIdPaciente() {
		return idPaciente;
	}



	public void setIdPaciente(Paciente idPaciente) {
		this.idPaciente = idPaciente;
	}



	public Doctor getIdDoctor() {
		return idDoctor;
	}



	public void setIdDoctor(Doctor idDoctor) {
		this.idDoctor = idDoctor;
	}



	public LocalTime getFechaCita() {
		return fechaCita;
	}



	public void setFechaCita(LocalTime fechaCita) {
		this.fechaCita = fechaCita;
	}



	public String getSintomatologia() {
		return sintomatologia;
	}



	public void setSintomatologia(String sintomatologia) {
		this.sintomatologia = sintomatologia;
	}



	public String getEstadoCita() {
		return estadoCita;
	}



	public void setEstadoCita(String estadoCita) {
		this.estadoCita = estadoCita;
	}



	public String getComentarioCita() {
		return comentarioCita;
	}



	public void setComentarioCita(String comentarioCita) {
		this.comentarioCita = comentarioCita;
	}



	public double getCosto() {
		return costo;
	}



	public void setCosto(double costo) {
		this.costo = costo;
	}



	



	public List<CitasMedicas> getListacitas() {
		return listacitas;
	}



	public void setListacitas(List<CitasMedicas> listacitas) {
		this.listacitas = listacitas;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public DoctorFacade getEjbdoctor() {
		return ejbdoctor;
	}



	public void setEjbdoctor(DoctorFacade ejbdoctor) {
		this.ejbdoctor = ejbdoctor;
	}
	
	
	
}
