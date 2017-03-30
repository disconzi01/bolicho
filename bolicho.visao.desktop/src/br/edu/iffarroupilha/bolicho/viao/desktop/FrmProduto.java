package br.edu.iffarroupilha.bolicho.viao.desktop;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import bolicho.controle.ClienteControle;
import bolicho.controle.ProdutoControle;
import br.edu.iffarroupilha.bolicho.modelo.Cliente;
import br.edu.iffarroupilha.bolicho.modelo.Produto;

/**
 * <p>
 * Classe que representa a interface para o produto
 * </p>
 * @author João Artur Disconzi
 *
 */
public class FrmProduto extends JFrame{
	
	public FrmProduto( Bolicho principal ) {
		setTitle("Bolicho -> Produto");
		setSize(320,240);
		setLocationRelativeTo(principal);
		
		desenhaComponetes();
		
		setVisible(true);
	}

	private void desenhaComponetes() {
		// cria componentes para a tela
		
		JLabel lblDescricao = new JLabel("Descricao:");
		JLabel lblPreco = new JLabel("Preco:");
		
		JTextField txtDescricao = new JTextField(30);
		JTextField txtPreco = new JTextField(30);
		
		JButton btnGravar = new JButton("Gravar");
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		btnGravar.addActionListener( e -> {
			ProdutoControle controle = new ProdutoControle();
			// pega os dados da tela
			Produto p = new Produto();
			p.setDescricao(txtDescricao.getText());
			// converte para valor numerico
			double preco = controle.converteDouble(txtPreco.getText() );
			p.setPreco( preco );
			// valida dados
			String erro = controle.ValidarProduto(p);
			if(erro == null){
				// realiza a gravação
				controle.gravar( p );
				JOptionPane.showMessageDialog(null, "Gravado!");	
			}else{
				JOptionPane.showMessageDialog(null, erro, "Validação", JOptionPane.WARNING_MESSAGE);
			}
			
		});
		
		
		// add em tela		
		add(lblDescricao);
		add(txtDescricao);
		add(lblPreco);
		add(txtPreco);
		add(btnGravar);		
		
	}

}
