package yan;
public class HelloWorld2{

	Player a;
	Player b;
	Player c;
	public void startGame(){
		
		a = new Player();
		b = new Player();
		c = new Player();
		
		boolean ar = false;
		boolean br = false;
		boolean cr = false;
		
		System.out.println("We start the game");
		
		while(true){
			int num = (int)(Math.random()*10);
			System.out.println("We start from number: "+num);
			
			a.guess();
			b.guess();
			c.guess();
			
			if(num==a.number) 
				ar = true;
			if(num==b.number) 
				br = true;
			if(num==c.number) 
				cr = true;
			
			if(ar||br||cr){
				System.out.println("we have a winner");
				if(ar)
				       System.out.println("Player a is winner, a guess: "+a.number);
				if(br)
					   System.out.println("Player b is winner, b guess: "+b.number);
				if(cr)
					   System.out.println("Player c is winner, c guess: "+c.number);
				System.out.println("game is over");
				break;
				
			}
			System.out.println("Player a guess:  "+a.number);
			System.out.println("Player b guess:  "+b.number);
			System.out.println("Player c guess:  "+c.number);
			System.out.println("No one have a right answer\n\n\n");
			
			
			
			
			
		}
		
		
		
	}
	
	

}
 