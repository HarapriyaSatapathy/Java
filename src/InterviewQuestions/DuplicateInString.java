package src.InterviewQuestions;

public class DuplicateInString {
    public static void main(String[] args) {
        String s1 = "I amm facing an issue";
        char s2[] = s1.toCharArray();

        int count;
        for (int i = 0; i < s2.length; i++) {
            count = 1;
            for (int j = i + 1; j < s2.length; j++) {
                if (s2[i] == s2[j]) {
                    count++;
                    s2[j] = 0;
                }


            }
            if (count > 1 && s2[i] != 0) {
                System.out.println(s2[i]);

            }

        }
    }
}


