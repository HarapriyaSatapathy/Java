package src.InheritanceMultilevel;

public class Child extends Father {


        String CProperty;
        String CCars;

        Child(){
            System.out.println("CDC");
        }

        Child(String CProp,String CCar ) {
            this.CProperty = CProp;
            this.CCars = CCar;
        }


        void Chproperty() {
            System.out.println("Child Property-->"+" "+this.CProperty);
            System.out.println("Child Car-->"+ " "+this.CCars);
        }

}






