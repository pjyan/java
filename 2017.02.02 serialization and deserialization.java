package yan;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;


public class Player {

	
	public static void main(String[] args){
		GameCharacter a = new  GameCharacter(12,"qwe",550);
		GameCharacter b = new  GameCharacter(14,"asd",456);
		GameCharacter c = new  GameCharacter(15,"zxc",5647);

		try {
			ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("anc.ser"));     //Serialization
			obj.writeObject(a);
			obj.writeObject(b);
			obj.writeObject(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream ob = new ObjectInputStream(new FileInputStream("anc.ser"));               //Deserialization
			GameCharacter aRestore = (GameCharacter) ob.readObject();
			GameCharacter bRestore = (GameCharacter) ob.readObject();
			GameCharacter cRestore = (GameCharacter) ob.readObject();
			System.out.println(aRestore.age);
			System.out.println(bRestore.age);
			System.out.println(cRestore.age);

		} catch (Exception e) {
			e.printStackTrace();
		} 
				
	}

    } 

 class GameCharacter implements Serializable{
	int age;
	String name;
	int power;
	public GameCharacter(int a, String n, int p){
		age = a;
		name = n;
		power = p;
	}
}