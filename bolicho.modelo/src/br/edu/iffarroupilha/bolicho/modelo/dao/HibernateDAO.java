package br.edu.iffarroupilha.bolicho.modelo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;

public class HibernateDAO {
	
	private static SessionFactory fabrica;
	
	static{
		
		Configuration cfg = new Configuration();
		// depois de adicionar as demais entidade
		// apos ter feito o mapeamento
		cfg.addAnnotatedClass(Cliente.class);
		cfg.configure();
		// forma mais facil de criar uma fabrica
		fabrica = cfg.buildSessionFactory();
		
	}
	
	/**
	 * <p>
	 * Metodo para abrir uma seção com o banco de dados
	 * </p>
	 * @return
	 */
	public static Session getSessao(){
		
		return fabrica.openSession();
	}

}
