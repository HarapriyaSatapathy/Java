package src.Inheritnace.Single;

public class Runnerclass {
    public static void main(String[] args) {
        Java l1= new Java("Java","Mr.ABC");
        Programming p1 =new Programming("OOPs","Mr.XYZ");
       // Programming p2=new Java("NewJava","Mr.New");p2 can only access function of programming
        //not functions of java, so p2 can only use PrintInfo() function from programming class

        //until we inherit programming class to the java class, here the output will only be DC
        //as its calling the DC of Java class. But the moment we inherit programming class to the java
        //class , the o/p will be DC DC. because it will also call the DC of programming class
        //and now in this runner class we can use all the features of Java as well as Programming class.


       l1.PrintLanInfo();
       p1.PrintInfo();
       //p2.PrintInfo();-----commented the p2 reference object above
       l1.PrintInfo();//possible that child can use parent function
     //p1.PrintLanInfo();--Its not possible, beacuse PrintLanInfo is a
                           //function of teh child class and parent class will not be able
                           //to use it



    }

}
