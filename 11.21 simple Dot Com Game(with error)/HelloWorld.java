package yan;

import java.util.Scanner;

public class HelloWorld{

 public static void main(String[] args){
     
	 int numOfGuess = 0;
     Player game = new Player();
     int randomNum = (int)(Math.random()*5);
     int[] dotLocation = {randomNum,randomNum+1,randomNum+2};     
     game.setLocationCells(dotLocation);
     
     String isAlive= "miss";

     while(isAlive !="Kill"){
    	 numOfGuess++;
    	 System.out.print("please inter your "+numOfGuess+" number: "); 
    	 int a = new Scanner(System.in).nextInt();
    	 isAlive= game.checkYourself(a);
    	 System.out.println(isAlive);
     }
	 System.out.println("you totallt take "+numOfGuess+" guesses");
 }
}
