package exercicio10;

import javax.swing.*;

public class Single {
	private static final Single s = new Single();
	
	private Single() {		
		
	}
	
	public static Single getSingle() {
		return s;
	}
}
