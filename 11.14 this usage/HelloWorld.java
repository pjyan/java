package yan;

public class HelloWorld {  
    String name="Mick";
    public void print(String name){
      System.out.println("���е����� name="+this.name);
      System.out.println("�ֲ����ε�����="+name);
    }    
    public static void main(String[] args) {
        HelloWorld tt=new HelloWorld();
        tt.print("Orson");
    }
}


//Result: ���е����� name=Mick
//        �ֲ����ε�����=Orson