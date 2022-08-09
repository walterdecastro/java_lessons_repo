package layouts;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos extends JFrame implements ActionListener {
	
	public Eventos() {
		super ("Meus Eventos");
		
		JButton botao = new JButton("Clique");
		botao.addActionListener(this);
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Eventos();

	}
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Voce clicou!");
	}

}
