package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import armazenamento.BaseDados;
import models.Contato;
import models.Usuario;


@WebServlet("/login")
public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Usuario usuario = BaseDados.getUsuario(login);
		
		
		if (usuario != null && usuario.getSenha().equals(senha)) {
			ArrayList<Contato> contatos = BaseDados.getContato();
			request.setAttribute("contatos", contatos);
			RequestDispatcher rd = request.getRequestDispatcher("listarContatos.jsp");
			rd.forward(request, response);

		} 
		else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
		
	}
	
	
	
	
	

}
