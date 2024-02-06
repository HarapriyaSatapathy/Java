package src.InheritanceMultilevel;

public class Father extends Grandfather {

    String FProperty;
    String FCars;


    Father(){System.out.println("FDC");
    }
    Father(String FProp, String FCar){
        this.FProperty=FProp;
        this.FCars=FCar;
    }

    void FProperties(){
        System.out.println("Father's properties-->"+this.FProperty);
        System.out.println("Father's Car-->"+this.FCars);
    }

}
