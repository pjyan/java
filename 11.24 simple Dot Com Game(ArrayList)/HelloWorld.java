package yan;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld{

 public static void main(String[] args){
     
	 int numOfGuess = 0;
     Player game = new Player();
     int randomNum = (int)(Math.random()*5);
     
     ArrayList<String> dotLocation = new  ArrayList<String>();
     dotLocation.add(Integer.toString(randomNum));
     dotLocation.add(Integer.toString(randomNum+1));     
     dotLocation.add(Integer.toString(randomNum+2));
     
     game.setLocationCells(dotLocation);
     
     String isAlive= "Miss";

     while(isAlive!="Kill"){
    	 numOfGuess++;
    	 System.out.print("please inter your "+numOfGuess+" number: "); 
    	 isAlive= game.checkYourself(new Scanner(System.in).nextLine());
    	 System.out.println(isAlive);
    	
     }
	 System.out.println("you totallt take "+numOfGuess+" guesses");
 }
}
