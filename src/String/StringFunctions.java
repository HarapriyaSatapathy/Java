package src.String;

public class StringFunctions {
    public static void main(String[] args) {

        String name="Rinky"; //stored in the SCP
        String name1="Rinky";//stored in the SCP
        String name2=new String("Rinky");//stored in the Heap or OA area
        String name3=new String("Rinky");//stored in the Heap or OA area
        String name4=new String("rinky");
        //Few String operator and functions:

        System.out.println(name==name1);//== operator only compare the refernce not the value
                                        // as both are with same value and created inside SCP,in this case this will be true
        System.out.println(name.equals(name1));//.equals check the value not the refernce
        System.out.println(name1==name2);
        System.out.println(name2==name3);
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name2.equalsIgnoreCase(name4));

        System.out.println(name4.toUpperCase());
        System.out.println(name3.toLowerCase());
    }
}
