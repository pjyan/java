package yan;
import java.io.*;
import java.net.*;

public class DailyAdviceClient {
     public static void main(String[] args){
    	 DailyAdviceClient a= new DailyAdviceClient();
    	 a.go();
     }
    
     public void go(){
    	 try {
			Socket s = new Socket("127.0.0.1",4242);                                                           //Set connection
            InputStreamReader ipr = new InputStreamReader(s.getInputStream());       // Get input
            BufferedReader  br = new BufferedReader(ipr);
            
            String str = null;
            str = br.readLine();
            System.out.println("advice is "+str);
            br.close();
            s.close();
            
		} catch (IOException e) {
			e.printStackTrace();
		}
    	 
    	 
     }
}
