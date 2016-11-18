package yan;

public enum Player {

     jack("123","abc"),
     tom("456","def"),
     jerry("789","ghi"),
     Lily("111","jkl"),
     Nacy("222","mno");

     private final String num;
     private final String eng;
     
     Player(String number,String english){
    	 num = number;
    	 eng = english;
       }
     
     public String getNum(){
    	 return num;
     }
     public String getEng(){
    	 return eng;
     }
     }