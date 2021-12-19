package ec.edu.ups.entidad;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "citas")
public class CitasMedicas implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int idCita;
	private Paciente idPaciente;
	private Doctor idDoctor;
	private LocalTime fechaCita;
	private String sintomatologia;
	private String estadoCita;
	private String comentarioCita;
	private double costo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idEspecialidad")
	private List<MedicoEspecialidad> listMedicoEspecialidads;
}
