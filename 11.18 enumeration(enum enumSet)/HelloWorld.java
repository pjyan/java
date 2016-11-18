package yan;

import java.util.EnumSet;
public class HelloWorld{
    public static void main(String[] args){
        for(Player a:Player.values()){
        	System.out.printf("%s\t%s\t%s\n",a,a.getNum(),a.getEng());
        }
        System.out.println("========================");
        for(Player b:EnumSet.range(Player.tom,Player.Lily)){
        	System.out.printf("%s\t%s\t%s\n",b,b.getNum(),b.getEng());
        }
    }
}

/*
jack	123	abc
tom	    456	def
jerry	789	ghi
Lily	111	jkl
Nacy	222	mno
========================
tom	    456	def
jerry	789	ghi
Lily	111	jkl
*/