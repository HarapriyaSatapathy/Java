package src;

import java.util.Arrays;

public class MovingNumbers {
    //import java.util.Arrays;

         public static void main(String[] args) {
            int[] arr = {1, 0, 14,0, 0, 19, 21,0, 1};

            // Call the method to rearrange the array
            rearrangeArray(arr);

            // Print the rearranged array
            System.out.println(Arrays.toString(arr));
        }

        public static void rearrangeArray(int[] arr) {
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }
    }


