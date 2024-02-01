package src.Function;

public class Lab003_FunctionCreation3 {
    public static void main(String[] args) {

        int x= main(10);
        System.out.println(x);

        String y=main("Rinky");
        System.out.println(y);

        float z=main(10.5f);
        System.out.println(z);

    }
    public static String main(String a){
        return a;

    }
    public static int main(int b){
        return b;
    }
    public static float main(float c){
        return c;
    }
}
