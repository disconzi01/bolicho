package br.edu.iffarroupilha.bolicho.viao.desktop;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import bolicho.controle.ClienteControle;
import br.edu.iffarroupilha.bolicho.modelo.Cliente;

/**
 * <p>
 * Classe que representa a view para gerir clientes.
 * </p>
 * @author João Artur Disconzi
 *
 */
public class FrmCliente extends JFrame{

	private Bolicho telaPrincipal;

	public FrmCliente(Bolicho telaPrincipal) {
		this.telaPrincipal = telaPrincipal;
		setTitle("Bolicho -> Cliente");
		setSize(320,240);
		setLocationRelativeTo(telaPrincipal);
		desenhaComponentes();
		setVisible(true);
		
	}

	private void desenhaComponentes() {
		
		JLabel lblCPF = new JLabel("CPF:");
		JLabel lblNome = new JLabel("Nome:");
		
		JTextField txtCPF = new JTextField(30);
		JTextField txtNome = new JTextField(30);
		
		JButton btnGravar = new JButton("Gravar");
		
		setLayout( new FlowLayout(FlowLayout.LEFT));
		
		btnGravar.addActionListener( e -> {
			ClienteControle controle = new ClienteControle();
			// pega os dados da tela
			Cliente c = new Cliente();
			c.setNome(txtNome.getText());
			// converte para valor numerico
			int cpf = controle.converteInteiro(txtCPF.getText() );
			c.setCpf( cpf );
			// valida dados
			String erro = controle.ValidarCliente(c);
			if(erro == null){
				// realiza a gravação
				controle.gravar( c );
				JOptionPane.showMessageDialog(null, "Gravado!");	
			}else{
				JOptionPane.showMessageDialog(null, erro, "Validação", JOptionPane.WARNING_MESSAGE);
			}
			
		});
		
		// adiciona os componentes em tela		
		add(lblCPF);
		add(txtCPF);
		add(lblNome);
		add(txtNome);
		add(btnGravar);		
	}
	
}
