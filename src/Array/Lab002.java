package src.Array;

public class Lab002 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={1,2,3,4};

        System.out.println(arr1==arr2);
        System.out.println(arr1.equals(arr2));
        int arr3[]=arr1;
        System.out.println(arr3.length);

        //equals to function compare the values in String concept
        //but in Arrays, it compares the reference value
    }
}
