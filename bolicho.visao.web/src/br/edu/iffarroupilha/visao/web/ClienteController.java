package br.edu.iffarroupilha.visao.web;

import bolicho.controle.ClienteControle;
import br.com.caelum.vraptor.Resource;
import br.edu.iffarroupilha.bolicho.modelo.Cliente;

@Resource
public class ClienteController {

	public void listar() {
		System.out.println("aqui vamos buscar os clientes");
	}
	
	public void gravar(){
		
		ClienteControle controle = new ClienteControle();
		
		// objeto temporario
		Cliente c = new Cliente();
		c.setNome("Jose");
		c.setCpf(123);
		
		controle.gravar(c);
	}

}


//http://localhost:8080/bolicho.visao.web/cliente/listar