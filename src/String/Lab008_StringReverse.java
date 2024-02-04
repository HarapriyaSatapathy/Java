package src.String;

public class Lab008_StringReverse {
    public static void main(String[] args) {
        String name="RINKY";
        char [] arr= name.toCharArray();
        System.out.println(arr.length);

        int left=0;
        int right=arr.length-1;
        char temp;


        while(left<right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;

        }
        String rev_name= new String(arr);
        System.out.println(rev_name);
    }

}
