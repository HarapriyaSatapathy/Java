package src.Array;

public class Lab001 {
    public static void main(String[] args) {
        int[] marks={50,80,76,89};
        System.out.println(marks[2]);

        int[] Grade=new int[5];
        Grade[0]=78;
        Grade[1]=67;
        Grade[2]=89;
        Grade[3]=78;
        Grade[4]=89;

       // System.out.println(Grade[8]);//ArrayIndexOutOfBoundsException
        System.out.println(Grade[3]);
        Grade[3]=90;
        System.out.println(Grade[3]);
    }
}
