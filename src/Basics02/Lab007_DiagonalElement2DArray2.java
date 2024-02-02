package src.Basics02;

public class Lab006_DiagonalElement2DArray2 {
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

        // 1(i0,j0) 2(i1,j0) 3(i2,j0)   we need to print the diagonal values which are
        // 4(i0,j1) 5(i1,j1) 6(i2,j1)    1(i0,j0) 5(i1,j1) 9(i2,j2) with 2 loops
        // 7(i0,j2) 8(i1,j2) 9(i2,j2)

        for(int i=0;i< arr.length;i++)
        {
            for (int j=0;j<arr[0].length;j++){
                if (i==j)
                {
                    System.out.println(arr[i][j]);
                }

        }

        }

    }
}
