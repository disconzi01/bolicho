package br.edu.iffarroupilha.bolicho.viao.desktop;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * <p>
 * Classe  principal do projeto, contempla a tela inicial
 * </p>
 * @author João Artur Disconzi
 * @since 08/03/2017
 *
 */

public class Bolicho extends JFrame{
		
	public Bolicho() {
		setTitle("Bolicho ::"); // nome da janela
		setSize(640,480); // tamanho da tela
		setLocationRelativeTo(null); // quando inicia ele, inicia centralizada		
		setDefaultCloseOperation(EXIT_ON_CLOSE); // quando fecha a tela, mata a operação		
		desenhaComponentes();
		
		// muda a aparencia da aplicação java
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setVisible(true); // deixa a tela visible		
	}

	// metodo para criar os componentes na tela
	private void desenhaComponentes() {
		
		JMenuBar menu = new JMenuBar(); // cria a barra de menu
		
		JMenu cadastro = new JMenu("Cadastro"); // cria o menu cadastro
		menu.add(cadastro);
		
		JMenuItem cliente = new JMenuItem("Clientes"); // adiciona um item no menu		
		JMenuItem produto = new JMenuItem("Produtos"); // adiciona um item no menu
		JMenuItem venda = new JMenuItem("Vendas"); // adiciona um item no menu
		
		cadastro.add(cliente); // adiciona no cadastro
		cadastro.add(produto); // adiciona no cadastro
		cadastro.add(venda);   // adiciona no cadastro
		
		setJMenuBar(menu); // adiciona o menu na tela
		
		// vincula as ações ao item cliente
		cliente.addActionListener(e -> { // expressoes lambidas
			new FrmCliente( Bolicho.this);
		} );
		
		// vincula as ações ao item produto
		produto.addActionListener(e -> { // expressoes lambidas
			new FrmProduto(Bolicho.this);
		} );

		// vincula as ações ao item cliente
		venda.addActionListener(e -> { // expressoes lambidas
			JOptionPane.showMessageDialog(null, "Clicou em Vendas");
		} );

	}

	public static void main(String[] args) {		
		new Bolicho(); // instancia
	}

}
