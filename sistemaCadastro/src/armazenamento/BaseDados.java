package armazenamento;


import java.util.ArrayList;
import java.util.HashMap;

import models.Contato;
import models.Usuario;


public class BaseDados {
	
	
	private static HashMap<String,Usuario>usuarios = new HashMap<String,Usuario>();
	private static ArrayList<Contato>contatos = new ArrayList<Contato>();
	
	
		
	public static Usuario getUsuario(String email) {
		Usuario retorno;
		retorno = usuarios.get(email);
		return retorno;
	}
	
	public static ArrayList<Contato> getContato(){
		ArrayList<Contato> retorno = contatos;
		return retorno;
	}
	
	public static void salvarContato(Contato contato) {
		contatos.add(contato);
		
	}
	
	public static void salvarUsuario(Usuario usuario) {
		String email = usuario.getEmail();
		usuarios.put(email, usuario);
		
		
		
	}

		
	public static boolean contatoExiste(String email, String telefone) {
		
		
		boolean retorno = false;
		
		int i = 0;
		while(  i < contatos.size() && !retorno  ) {
			
			Contato contato = contatos.get(i);
			if(contato.getEmail().equals(email) || contato.getTelefone().equals(telefone)) {
				retorno = true;
			}
			
			i++;
			
		}
		
		return retorno;
	}
	
	
	
	
	
}
