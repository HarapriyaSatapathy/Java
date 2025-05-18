package src.InterviewQuestions;

public class FindUpperCaseLowercase {
    public static void main(String[] args) {

        String str="Harapriya Satapathy";
        char char_arr[]=str.toCharArray();
        int uppercase=0;
        int lowercase=0;

        for(int i=0;i<char_arr.length;i++){
            if(char_arr[i]>'A' && char_arr[i]< 'Z'){
                uppercase++;
            }
            if(char_arr[i]>'a' && char_arr[i]< 'z'){
                lowercase++;
            }

        }
        System.out.println("uppercase count-->"+uppercase);
        System.out.println("lowercase count-->"+lowercase);




    }
}
