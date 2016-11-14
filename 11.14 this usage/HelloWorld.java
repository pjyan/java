package yan;

public class HelloWorld {  
    String name="Mick";
    public void print(String name){
      System.out.println("类中的属性 name="+this.name);
      System.out.println("局部传参的属性="+name);
    }    
    public static void main(String[] args) {
        HelloWorld tt=new HelloWorld();
        tt.print("Orson");
    }
}


//Result: 类中的属性 name=Mick
//        局部传参的属性=Orson