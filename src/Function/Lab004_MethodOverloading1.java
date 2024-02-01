package src.Function;

public class Lab004_MethodOverloading1 {
    public static void main(String[] args) {
        int a = main(3, 4);
        System.out.println(a);

        float s=main(10.7f);
        System.out.println(s);


    }

    public static int main(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String s) {
        System.out.println("Rinky");
    }

    public static void main(int num) {
        num = 10;
        System.out.println(num);
    }


    public static float main(float s) {
        return s;

    }
}
