package src.Practice;

public class Lab002 {
    public static void main(String[] args) {


        int marks= TotalMarks(78,89,90);
        System.out.println(marks);

    }
    static int TotalMarks(int sub_1, int sub_2,int sub_3) {
        return sub_1+sub_2+sub_3;
    }
}
