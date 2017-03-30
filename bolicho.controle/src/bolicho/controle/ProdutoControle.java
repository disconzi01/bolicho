package bolicho.controle;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;
import br.edu.iffarroupilha.bolicho.modelo.Produto;

/**
 * <p>
 * Classe de l�gica para a entidade produto
 * </p>
 * @author Jo�o Artur Disconzi
 */

public class ProdutoControle extends AControle{
	
	/**
	 * <p>
	 * Valida se os dados do produto est�o corretos
	 * </p>
	 * @param cli
	 * @return
	 */
	public String ValidarProduto (Produto pro){
		
		if(pro != null){
			if(pro.getPreco() == 0){
				return "Preco Igual a Zero";
			}else if(pro.getDescricao() == null ||pro.getDescricao().isEmpty()){
				return "Por favor, informe uma descricao";				
			}
		}else{
			return "Dados do produto n�o informado";
		}
		
		return null;
	}
	

}
