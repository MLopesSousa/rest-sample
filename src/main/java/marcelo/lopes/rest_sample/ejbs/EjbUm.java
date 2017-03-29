package marcelo.lopes.rest_sample.ejbs;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

@Stateless
public class EjbUm {

	public EjbUm() {
		System.out.println("Construido no construtor");
	}
	
	{ System.out.println("Construido no bloco de inicializacao"); }
	
	@PostConstruct
	public void post() {
		System.out.println("Construido no postConstruct");
	}
	
	
	
	public String run() {
		return "Ejb Chamado !";	
	}
}
