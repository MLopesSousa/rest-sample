package marcelo.lopes.rest_sample.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import marcelo.lopes.rest_sample.ejbs.EjbUm;

@WebServlet("/servletOne")
public class ServletUm extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	EjbUm ejbUm;
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter wr = resp.getWriter();
		System.out.println("Camando método");
		ejbUm.run();
		wr.println("Chamado servlet!");
	}
}
