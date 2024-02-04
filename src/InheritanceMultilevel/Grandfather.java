package src.InheritanceMultilevel;

public class Grandfather {



    String GProperty;
    String GCars;

   Grandfather(){
       System.out.println("GDC");
   }

    Grandfather(String GProp, String GCar){
        this.GProperty=GProp;
        this.GCars=GCar;
    }

    void GProperties(){
        System.out.println("Grandfather's properties-->"+this.GProperty);
        System.out.println("GrandFather's Car-->"+this.GCars);
    }

    }


