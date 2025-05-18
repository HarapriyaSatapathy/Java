package src.InterviewQuestions;

public class OddIndextoUppercase {
    //input:automation
    //output:aUtOmAtIoN
    //convert the odd index charecter to uppercase
    public static void main(String[] args) {
        String str="automation";
        String str2[]=str.split("");
        String output="";

        for(int i=0;i<str2.length;i++){
            if(i%2!=0){
                output=output+str2[i].toUpperCase();
            }
            else{
                output=output+str2[i];
            }

        }
        System.out.println(output);


    }
}
