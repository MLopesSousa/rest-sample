package marcelo.lopes.rest_sample.rest;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import marcelo.lopes.rest_sample.ejbs.EjbUm;

@Path("EJB")
public class RestUm {
	@Inject
	private EjbUm ejbUm;
	
	@GET
	public String run() {
		System.out.println("Camando método");
		ejbUm.run();
		return "";
	}
}
