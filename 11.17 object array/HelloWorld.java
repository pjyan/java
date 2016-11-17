package yan;

public class HelloWorld {  

    public static void main(String[] args) {

    	Player s = new Player();
    	Player d = new Player();
    	s.a=3;
    	d.a=4;
    	Player[] a = new Player[2];
    	a[0]=s;
    	a[1]=d;
    	System.out.println(a[0].a);
    	System.out.println(a[1].a);
    }
}


// Result: 3
//         4