package marcelo.lopes.rest_sample.ejbs;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

@Stateless
public class EJBErro {
	
	@PostConstruct
	public void post() {
		System.out.println("Construido !!! EJBErro");
	}
	
	{ System.out.println("Construido sem anotacao !!! EJBErro"); }
	
	public void run() {
		//throw new RuntimeException();
	}
}
