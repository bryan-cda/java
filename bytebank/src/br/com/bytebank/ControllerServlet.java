package br.com.bytebank;

import java.io.IOException;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bytebank.model.Client;

@WebServlet(urlPatterns = "bank")
public class ControllerServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
			if(req.getParameter("action").equals("login")) {
				
			}
			
			
		
		Client client = new Client();
		client.setName(req.getParameter("name"));
		client.setCpf(req.getParameter("cpf"));
		client.setAddress(req.getParameter("address"));
		client.setBirthday(req.getParameter("birthday"));
		client.setEmai(req.getParameter("email"));
		client.setTelephone(req.getParameter("telephone"));
		client.setLogin(req.getParameter("login"));
		client.setPassword(req.getParameter("password"));
		
		System.out.println(client.toString());
		
		RequestDispatcher  rd = req.getRequestDispatcher("/bytebank.jsp");
		req.setAttribute("client", client.getName());
		rd.forward(req, resp);
		
	}

}
