package src.Operators;

public class InstanceOf {
    public static void main(String[] args) {
        String name="Rinky";
        System.out.println(name instanceof String);
        System.out.println(name instanceof Object);

        // name is instance of String
        //name is also instance of Object, because Object is the Father of all we can say
        //Ex: Human is instance of God
        //instance of always return boolean value
    }
}
