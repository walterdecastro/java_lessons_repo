package javaGUI;

import javax.swing.JButton;
import javax.swing.JFrame; //classe java de interface gráfica

public class Meuframe extends JFrame {
	
	public Meuframe() {
		
		super ("Meu Frame");
		
		//JFrame frame = new JFrame();
		JButton botao = new JButton("Clique");
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Meuframe();
		

	}

}
