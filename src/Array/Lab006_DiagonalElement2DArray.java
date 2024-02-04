package src.Array;

public class Lab006_DiagonalElement2DArray {
    public static void main(String[] args) {
        int arr [][]= new int [3][3];
        arr [0][0]=1;
        arr [0][1]=2;
        arr [0][2]=3;
        arr [1][0]=4;
        arr [1][1]=5;
        arr [1][2]=6;
        arr [2][0]=7;
        arr [2][1]=8;
        arr [2][2]=9;

        // 1(i0,i0) 2(i0,i1) 3(i0,i2)   we need to print the diagonal values which are
        // 4(i1,i0) 5(i1,i1) 6(i1,i2)    1(i0,i0) 5(i1,i1) 9(i2,i2)
        // 7(i2,i0) 8(i2,i1) 9(i2,i2)

        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i][i]);
        }

    }
}
