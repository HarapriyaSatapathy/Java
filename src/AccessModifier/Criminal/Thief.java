package src.AccessModifier;

public class Thief {
    public static void main(String[] args) {
        Cop c=new Cop(10);

        System.out.println(c.gun);
        c.canIShoot();
    }
}
