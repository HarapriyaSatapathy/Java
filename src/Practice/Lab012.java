package src.Practice;

public class Lab012 {
    //print only the diagonal the elements of a 2d array
    //diagonal element is where row=column ex: r0c0,r1c1 and r2c2

    public static void main(String[] args) {

        int array_2d[][] = new int[3][3];

        array_2d[0][0] = 10;
        array_2d[0][1] = 20;
        array_2d[0][2] = 30;
        array_2d[1][0] = 40;
        array_2d[1][1] = 50;
        array_2d[1][2] = 60;
        array_2d[2][0] = 70;
        array_2d[2][1] = 80;
        array_2d[2][2] = 90;

////        for(int i=0;i< array_2d.length;i++) {
////            System.out.print("\t" + array_2d[i][i]);
//
//        }
        //or we can also use 2 loops for i and j
        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                if (i == j) {
                    System.out.print("\t" +  array_2d[i][j]);
                }
                else if(!(i==j)){
                   array_2d[i][j]=0;
                    System.out.print("\t" +  array_2d[i][j]);

                }

            }

            System.out.println();
        }
    }
}

