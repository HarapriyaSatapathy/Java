package src.Revision;

public class Lab04 {
    public static void main(String[] args) {
        //Print diagonal element of 2D array

        int arr[][] = new int[3][3];
        arr[0][0] = 2;
        arr[0][1] = 3;
        arr[0][2] = 4;

        arr[1][0] = 12;
        arr[1][1] = 13;
        arr[1][2] = 14;

        arr[2][0] = 22;
        arr[2][1] = 23;
        arr[2][2] = 24;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i][j]+"\t");

                }
                else {
                    System.out.print("*"+"\t");

                }


            }
            System.out.println(" ");



        }

    }

}
