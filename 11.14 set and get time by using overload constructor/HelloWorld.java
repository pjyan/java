package yan;

public class HelloWorld {  

    public static void main(String[] args) {
      HelloWorld2 a = new HelloWorld2();
      HelloWorld2 b = new HelloWorld2(2);
      HelloWorld2 c = new HelloWorld2(2,34);
      HelloWorld2 d = new HelloWorld2(2,34,56);
      
      System.out.println(a.getMilitary());
      System.out.println(b.getMilitary());
      System.out.println(c.getMilitary());
      System.out.println(d.getMilitary());
    }
}

//Result  00:00:00
//        02:00:00
//        02:34:00
//        02:34:56
