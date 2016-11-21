package yan;

public class Player {

	int numOfHit= 0;
	int[] localtionCells;
	 public void setLocationCells(int[] cell){
		 localtionCells = cell;
	 }
     public String checkYourself(int a){
    	  int guess = a;
          String result = "Miss";
          for (int b : localtionCells){
        	  if(guess==b){
        		  numOfHit++;
        		  result = "Hit";
        		  break;
        	  }
          }
          if(numOfHit==localtionCells.length){
        	  result="Kill";
          }
        return result;
      }
    }