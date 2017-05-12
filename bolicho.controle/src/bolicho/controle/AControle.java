package bolicho.controle;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.edu.iffarroupilha.bolicho.modelo.dao.HibernateDAO;

/**
 * <p>
 * controlador gen�rico que agrupa as fun��es comuns de logicas, como gravar,
 * buscar etc...
 * </p>
 * 
 * @author Jo�o Artur Disconzi
 */

public class AControle {

	// gravar ou atualizar uma informa��o em baco
	public void gravar(Object entidade) {
		// estabelece uma conexao
		Session sessao = HibernateDAO.getSessao();
		// abre uma transa��o
		sessao.getTransaction().begin();
		// atualiza as modificacao
		sessao.saveOrUpdate(entidade);
		// comita as altera��es
		sessao.getTransaction().commit();

	}

	// busca todos os registro de uma determinada entidade (classe)
	public List buscarTodos(Class classe) {
		// estabelece uma conexao
		Session sessao = HibernateDAO.getSessao();
		Criteria c = sessao.createCriteria(classe);
		
		return c.list();
	}

	// excluir entidades
	public void excluir(Object entidade) {

	}

	/**
	 * <p>
	 * Converte um termo em numero, caso esteja no formato invalido retorna-se
	 * zero
	 * </p>
	 * 
	 * @param termo
	 * @return
	 */
	public int converteInteiro(String termo) {

		try {
			return Integer.parseInt(termo);
		} catch (Exception e) {
			return 0;
		}

	}

	/**
	 * <p>
	 * Converte um termo em double, caso esteja no formato invalido retorna-se
	 * zero
	 * </p>
	 * 
	 * @param termo
	 * @return
	 */
	public Double converteDouble(String termo) {

		try {
			return Double.parseDouble(termo);
		} catch (Exception e) {
			return (double) 0;
		}

	}

}
