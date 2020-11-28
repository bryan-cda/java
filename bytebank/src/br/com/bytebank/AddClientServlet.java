package br.com.bytebank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bytebank.model.Client;

@WebServlet(urlPatterns = "/banks")
public class AddClientServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
