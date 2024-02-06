package src.AccessModifier.Criminal;

import src.AccessModifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c=new Cop(10);

        System.out.println(c.gun);
       // c.canIShoot(); Its outside teh package and the
        //canIshoot method is in protected
    }
}
