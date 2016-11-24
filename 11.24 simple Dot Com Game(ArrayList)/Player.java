package yan;
import java.util.ArrayList;

public class Player {

	private ArrayList<String> locationCells;    
	
	public void setLocationCells(ArrayList<String> loc){
		 locationCells = loc;
	 }
    public String checkYourself(String input){

          String result = "Miss";
          int index = locationCells.indexOf(input);
          
          if(index >=0){
        	  locationCells.remove(index);
          
          if(locationCells.isEmpty()){
        	  result = "Kill";
          }else{
        	  result = "Hit";
          }
       }
        return result;
      }
    } 