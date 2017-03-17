package br.edu.iffarroupilha.bolicho.viao.desktop;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
		
		// add em tela
		
		add(lblDescricao);
		add(txtDescricao);
		add(lblPreco);
		add(txtPreco);
		add(btnGravar);		
		
	}

}
