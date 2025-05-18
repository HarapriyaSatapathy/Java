package src.Revision;

public class Arr3 {
    public static void main(String[] args) {
        //2D Array

        int arr[][]=new int [3][3];

        arr[0][0]=12;
        arr[0][1]=19;
        arr[0][2]=17;

        arr[1][0]=34;
        arr[1][1]=56;
        arr[1][2]=43;

        arr[2][0]=78;
        arr[2][1]=90;
        arr[2][2]=12;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println(" ");
        }



    }
}
