package yan;

public class One{
    public static void main(String[] args){
    
        Two member1 = new Two("aa","bb");
        Two member2 = new Two("cc","dd");
        Two member3 = new Two("ee","ff");
        
        System.out.println(member1.members);
        System.out.println(Two.getMembers());
    }
}

/*
your input is aa bb,the number is 1
your input is cc dd,the number is 2
your input is ee ff,the number is 3
3
3
*/