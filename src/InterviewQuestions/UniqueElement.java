package src.InterviewQuestions;

public class UniqueElement {
    public static void main(String[] args) {
        String str="abaaabntutuq";
        String str2="";
        int count;

        for(int i=0;i<str.length();i++){
            count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    count++;

                }
            }
            if(count==0){
                str2=str2+str.charAt(i);

            }
        }
        System.out.println(str2);
    }
}
