package yan;
import java.io.*;
import java.net.*;

public class DailyAdviceServer {
	String[] adviceList = {"take smaller bit","go for the tight jeans","be honest","keep doing exercise"};
	public static void main(String[] args){
	DailyAdviceServer server = new DailyAdviceServer();
	server.go();
	}
	public void go(){
		try {
			ServerSocket serverSock = new ServerSocket(4242);
			while(true){
				Socket sock = serverSock.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = adviceList[(int)(Math.random()*adviceList.length)];
				writer.println(advice);
				writer.close();
				System.out.println(advice);
				serverSock.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
