package src.Practice;

public class Child extends Parent{
    public static void main(String[] args) {

        GF g=new GF();
        Parent p= new Parent();
        Child c = new Child();

       // Child c1= (Child) new Parent("satap","dark");//downcasting with cast operator--exception


        c.talking();
        c.Printinfo();
        c.GFPrint();
        c.singing();
        p.talking();
        p.Printinfo();
        p.singing();
        p.GFPrint();
        g.GFPrint();
        g.singing();
    }
    Child(){
        System.out.println("Child DC");
    }

}

