package src.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class UniqueDuplicateCount {
    public static void main(String[] args) {
        String str1 = "I llove my IIndia";
        char str2[] = str1.toCharArray();

        Map<Character, Integer> charmap = new HashMap<>();

        for (char c : str2) {
            if(!String.valueOf(c).isBlank()) {
                if (charmap.containsKey(c)) {

                    charmap.put(c, charmap.get(c) + 1);
                } else {
                    charmap.put(c, 1);
                }
//            }
//                if (charmap.get(c) > 1) {
//                    System.out.println(c + "-->Duplicate char");
//
//                } else {
//                    System.out.println(c + "-->unique char");


                }
            }
            System.out.println(charmap);


        }


    }

