package src.InterviewQuestions;

public class LongestWord {
    //Find longest word in the string
    public static void main(String[] args) {
        String s1 = "I am Harapriya";
        String s2[] = s1.split(" ");
        String longestword = s2[0];
        String shortestword = s2[0];
        int count;
        for (String word : s2) {
            if (word.length() > longestword.length()) {
                longestword = word;


            }
            if (word.length() < shortestword.length()) {
                {
                    shortestword = word;

                }
            }
        }
        System.out.println("long word--->"+" "+longestword);
        System.out.println("short word--->"+" "+shortestword);
    }
}





