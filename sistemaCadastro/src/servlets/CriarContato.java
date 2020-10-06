package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import armazenamento.BaseDados;
import models.Contato;


@WebServlet("/criarContato")
public class CriarContato extends HttpServlet {
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		
		
		Contato contato = new Contato(nome, telefone, email, endereco);
		
		if(!BaseDados.contatoExiste(email, telefone)) {
			BaseDados.salvarContato(contato);
			ArrayList<Contato> contatos = BaseDados.getContato();
			request.setAttribute("contatos", contatos);
			RequestDispatcher rd = request.getRequestDispatcher("listarContatos.jsp");
			rd.forward(request, response);

		}
		else {
			ArrayList<Contato> contatos = BaseDados.getContato();
			request.setAttribute("contatos", contatos);
			request.setAttribute("status", "erro");
			RequestDispatcher rd = request.getRequestDispatcher("listarContatos.jsp");
			rd.forward(request, response);
		}
		
		

		
	}


}
