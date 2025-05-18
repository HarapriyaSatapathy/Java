package src.InterviewQuestions;

public class DuplicateInArray {
    public static void main(String[] args) {

        int arr[] = {30, 30, 30, 40, 80, 40, 90, 80};
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = 0;
                }
                }
                if (count > 1 && arr[i] != 0) {
                    System.out.println(arr[i]);

                }




            }


            }
        }


