package src.InterviewQuestions;

import java.util.Arrays;

public class WordSortingLengthWise {
    public static void main(String[] args) {
        String str[] = {"HTML", "C#", "Python", "C++", "C"};
        String result[] = new String[str.length];

        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {
            result[i] = str[i];
            System.out.println(result[i]);

        }

    }
}
