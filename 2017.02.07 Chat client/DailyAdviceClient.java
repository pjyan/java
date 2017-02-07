package yan;
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DailyAdviceClient implements ActionListener{
    
	JTextArea receing;
	JTextField textField;
    PrintWriter writer;
    BufferedReader br;
    Socket sock;
	
    public static void main(String[] args){
    	 DailyAdviceClient a= new DailyAdviceClient();
    	 a.go();
     }
    
     public void go(){
    	 JFrame frame = new JFrame("Chat client");
    	 JPanel panel = new JPanel();
    	 JButton button  = new JButton("send");
    	 button.addActionListener(this);
    	 
    	 textField = new JTextField(20);
    	 receing  = new JTextArea(15,25); 
    	 
    	 panel.add(receing);
    	 panel.add(textField);
    	 panel.add(button);
    	
    	 try {
			sock = new Socket("127.0.0.1",5000);
			InputStreamReader isr = new InputStreamReader(sock.getInputStream());
			br = new BufferedReader(isr);
			writer = new PrintWriter(sock.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		 IReader dac = new IReader();
    	 Thread t = new Thread(dac);
    	 t.start();
    	
    	 frame.getContentPane().add(BorderLayout.CENTER, panel);	  
    	 frame.setSize(400, 500);
    	 frame.setVisible(true);
     }
     public void actionPerformed(ActionEvent ev){
         try {
          String a =  textField.getText();
			writer.println(a);
            writer.flush();
			textField.setText("");
            textField.requestFocus();
		} catch (Exception e) {
			e.printStackTrace();
		} 	 
    }
   public class IReader implements Runnable{
     public void run(){
    	 String rec = null;
    	 try {
			while((rec = br.readLine())!= null)   receing.append(rec+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
     } 
     }
}
