package yan;

import javax.swing.JOptionPane;

public class One{
   
	public static void main(String[] args){
           
		String fn = JOptionPane.showInputDialog("Ener your first number:");
		String sn = JOptionPane.showInputDialog("Ener your second number:");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		//Box used to display
		JOptionPane.showMessageDialog(null, "The answer is: "+sum,"The title",JOptionPane.PLAIN_MESSAGE);
		
    }
} 