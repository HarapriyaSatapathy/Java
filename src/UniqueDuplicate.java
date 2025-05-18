package src;

public class UniqueDuplicate {

        public static void main(String[] args) {
            String input = "hello world";
            findDuplicateAndUniqueCharacters(input);
        }

        public static void findDuplicateAndUniqueCharacters(String str) {
            int length = str.length();
            char[] chars = str.toCharArray();

            System.out.print("Duplicate characters: ");
            for (int i = 0; i < length; i++) {
                char currentChar = chars[i];
                if (currentChar == ' ') {
                    continue; // Skip whitespace characters
                }
                boolean isDuplicate = false;
                for (int j = i + 1; j < length; j++) {
                    if (chars[j] == currentChar) {
                        isDuplicate = true;
                        chars[j] = ' '; // Mark duplicate characters as whitespace to avoid counting them again
                    }
                }
                if (isDuplicate) {
                    System.out.print(currentChar + " ");
                }
            }
            System.out.println();

            System.out.print("Unique characters: ");
            for (int i = 0; i < length; i++) {
                char currentChar = chars[i];
                if (currentChar != ' ') {
                    boolean isUnique = true;
                    for (int j = i + 1; j < length; j++) {
                        if (chars[j] == currentChar) {
                            isUnique = false;
                            break;
                        }
                    }
                    if (isUnique) {
                        System.out.print(currentChar + " ");
                    }
                }
            }
            System.out.println();
        }
    }

