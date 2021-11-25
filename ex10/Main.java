package exercicio10;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex10 extends JFrame{
	private JTextField campoTexto;
	
	public Ex10() {
		super("JTextField");
		setLayout(new FlowLayout());
		
		campoTexto = new JTextField("Mudança da fonte aqui", 10); //10 colunas
		campoTexto.addActionListener(new ActionListener(){
			//private String string;
			public void actionPerformed(ActionEvent e){
				String string = String.format("Campo texto: " + e.getActionCommand());
				JOptionPane.showMessageDialog(null,string);
			}

		});
		add(campoTexto);
	}
	public static void main(String [] args) {
		Single aux = Single.getSingle();
		Ex10 s = new Ex10();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setSize(300,300);
		s.setVisible(true);
		
		
	}
}
