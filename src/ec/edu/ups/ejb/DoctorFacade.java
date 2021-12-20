package ec.edu.ups.ejb;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.CitasMedicas;
import ec.edu.ups.entidad.Doctor;
import ec.edu.ups.entidades.Persona;


@Stateless
public class DoctorFacade extends AbstractFacade<Doctor> {

    @PersistenceContext(unitName = "HospitalUPS")
    private EntityManager em;

    public DoctorFacade() {
        super(Doctor.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    
public  List<CitasMedicas> buscarcitapormedico (String cedula) {
		
		List<CitasMedicas> list=null;
		String consulta="Select c From CitasMedicas c Where c.Doctor.Persona.cedula='"+cedula+"'";
		try {
			list=(List<CitasMedicas>) em.createQuery(consulta).getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(">>> Warning (DoctorFacede: buscarcitapormedico: )"+e.getMessage());
		}
		return list ;
		
	}







}

