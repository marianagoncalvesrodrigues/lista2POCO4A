package exercicio9;

import java.util.Iterator;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ex9 extends JFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public JRadioButton rButtonCivic, rButtonMeriva;
	
	public Ex9() {
		super("JRadioButton");
		setLayout(new FlowLayout());
		
		ArrayList<String> carros = new ArrayList<String>();
		
		rButtonCivic = new JRadioButton("Civic");
		buttonGroup.add(rButtonCivic);
		rButtonCivic.setBounds(114, 46, 56, 23);
		
		getContentPane().add(rButtonCivic);
		
		rButtonCivic.addActionListener(new ActionListener(){
			//private String string;
			public void actionPerformed(ActionEvent e){
				String string = String.format(e.getActionCommand());
				JOptionPane.showMessageDialog(null,string);
			 	carros.add(string);
			}
		});
		
		getContentPane().setLayout(null);
		
		rButtonMeriva = new JRadioButton("Meriva");
		buttonGroup.add(rButtonMeriva);
		rButtonMeriva.setBounds(172, 46, 63, 23);
		getContentPane().add(rButtonMeriva);
		
		rButtonMeriva.addActionListener(new ActionListener(){
			//private String string;
			public void actionPerformed(ActionEvent e){
				String string = String.format(e.getActionCommand());
				JOptionPane.showMessageDialog(null,string);
				carros.add(string);
			}
		});

	    Iterator<String> obj = carros.iterator();
	    while(obj.hasNext()){
	      String c = obj.next();  
	      System.out.println(c);
	    }
	}
	
	public static void main(String [] args) {
		
		Ex9 s = new Ex9();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setSize(300,300);
		s.setVisible(true);
			
	}
}
