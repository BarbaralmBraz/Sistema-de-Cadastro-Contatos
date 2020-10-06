package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import armazenamento.BaseDados;
import models.Usuario;


@WebServlet("/cadastro")
public class Cadastro extends HttpServlet {
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		String senha = request.getParameter("senha");
		
		Usuario usuario = new Usuario(nome, telefone,email,endereco,senha);
		
	
		BaseDados.salvarUsuario(usuario);
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		
	}

	
}
