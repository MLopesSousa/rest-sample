package marcelo.lopes.rest_sample.ejbs;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import marcelo.lopes.rest_sample.entidades.Usuario;

@Stateless
public class EjbOk {

	@PersistenceContext
	EntityManager manager;
	
	@PostConstruct
	public void post() {
		System.out.println("Construido !!! EjbOk");
	}
	
	{ System.out.println("Construido sem anotacao !!! EjbOk"); }
	
	public void run() {
		Usuario usuario = new Usuario();
		usuario.setDescricao("Marcelo");
		
		manager.persist(usuario);
	}
}
