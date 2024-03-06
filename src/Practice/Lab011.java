package src.Practice;

public class Lab011 {
    //print all the elements of a 2d array

    public static void main(String[] args) {

        int array_2d[][]=new int [3][3];

        array_2d[0][0]=10;
        array_2d[0][1]=20;
        array_2d[0][2]=30;
        array_2d[1][0]=40;
        array_2d[1][1]=50;
        array_2d[1][2]=60;
        array_2d[2][0]=70;
        array_2d[2][1]=80;
        array_2d[2][2]=90;

        for(int i=0;i< array_2d.length;i++){
            for (int j=0;j<array_2d[i].length;j++){
                System.out.print("\t"+array_2d[i][j]);


            }
            System.out.println();
        }




    }

}
