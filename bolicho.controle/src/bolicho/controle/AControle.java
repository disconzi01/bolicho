package bolicho.controle;
import java.util.List;

/**
 * <p>
 * controlador gen�rico que agrupa as fun��es comuns de logicas, como gravar, buscar etc...
 * </p>
 * @author Jo�o Artur Disconzi
 */

public class AControle {
	
	// gravar ou atualizar uma informa��o em baco
	public void gravar ( Object entidade){
		
	}
	
	// busca todos os registro de uma determinada entidade (classe)
	public List buscarTodos (Class classe){
		return null;
	}
	
	// excluir entidades
	public void excluir ( Object entidade){
		
	}
	
	/**
	 * <p>
	 * Converte um termo em numero, caso esteja no formato invalido retorna-se zero
	 * </p>
	 * @param termo
	 * @return
	 */
	public int converteInteiro(String termo){
		
		try{
			return Integer.parseInt(termo);	
		}catch (Exception e) {
			return 0;
		}	
		
	}

	/**
	 * <p>
	 * Converte um termo em double, caso esteja no formato invalido retorna-se zero
	 * </p>
	 * @param termo
	 * @return
	 */
	public Double converteDouble(String termo){
		
		try{
			return Double.parseDouble(termo);
		}catch (Exception e) {
			return (double) 0;
		}	
		
	}

}
