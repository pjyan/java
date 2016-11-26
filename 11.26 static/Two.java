package yan;

public class Two {

    private String first;
    private String last;
    static int members = 0;
    
    public Two(String fn,String ln){
    	first = fn;
    	last = ln;
    	members++;
    	System.out.printf("your input is %s %s,the number is %d\n",first,last,members);
    }
	
    public static int getMembers(){
		return members;
	}
    
}