package marcelo.lopes.rest_sample.ejbs;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class EjbDois {
	@EJB EJBErro ejbErro;
	
	@PostConstruct
	public void post() {
		System.out.println("Construido !!! EjbDois");
	}
	
	{ System.out.println("Construido sem anotacao !!! EjbDois"); }
	
	public void run() {
		ejbErro.run();
	}
}
