package src.Basics02;

public class Practice {
    public static void main(String[] args) {
        int a []=new int[5];
        a[0]=3;
        a[1]=5;
        a[2]=6;
        a[3]=8;
        a[4]=9;
        int even=0;
        int odd=0;

        for(int i=0;i<=a.length-1;i++){
            if(a[i]% 2==0){
                System.out.println("Its an even no-->"+" "+a[i]);
            }
            else{
                System.out.println("Its an odd no-->"+" "+a[i]);
                }
            }



        }
}

