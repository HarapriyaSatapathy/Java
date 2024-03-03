package src.Conditions;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        //if triangle is equilateral-->3 sides are equal
        //if triangle is isosceles-->2 sides are equal
        //if triangle is scalene-->no sides are equal
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side1,side2 and side3");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();

//        if ((side1==side2) && (side2==side3)){
//            System.out.println("Its a equitriangle");
//        }
//        else if ((side1==side2) && (!(side2==side3)))
//        {
//            System.out.println("Its an isosceles");
//        }
        if((side1 == side2) && (side2 == side3) && (side1 == side3)){
            System.out.println("equitriangle");
        } else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
            System.out.println("isosceles");
        }else{
            System.out.println("Scalene");
        }
        }
    }

