package src.Interface;

public class Examples {

    public static void main(String[] args) {

    }

    interface I1{};
    interface I2{};

    class C1{}
    class C2{}
    abstract class A1{}
    abstract class A2{}

    class Test extends C1{}
    //class Test2 extends C1,C2{}//Class cannot extend multiple classes
    class Test3 extends A1{}
    //class Test4 extends A1,A2{}//Class cannot extend multiple classes
    class Test4 implements I1{}
    class Test5 implements I1,I2{}
    //interface Test6 extends C1{}//not psooible--interface cant extend class
    //interface Test7 extends C1, C2 {}//not psooible--interface cant extend class

    class Test8 extends C1 implements I1,I2 {}
    interface Test9 extends I1,I2{}

    //interface Test10 implements I1, I2 {}//not possible




}
