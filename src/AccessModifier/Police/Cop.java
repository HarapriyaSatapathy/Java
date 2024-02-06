package src.AccessModifier.Police;

public class Cop {

    public int gun;

    public Cop(int gun){
        this.gun=gun;
    }

    protected void canIShoot(){
        System.out.println("Yes I can");

    }
}
