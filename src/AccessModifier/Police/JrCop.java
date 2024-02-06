package src.AccessModifier.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop jr=new Cop(5);
        System.out.println(jr.gun);

        jr.canIShoot();
    }
}
