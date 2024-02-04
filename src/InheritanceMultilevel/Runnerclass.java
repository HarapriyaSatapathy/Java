package src.InheritanceMultilevel;

public class Runnerclass {
    public static void main(String[] args) {

        Grandfather G = new Grandfather("3bhk","Alto");
        Father F = new Father("2bhk","Baleno");
        Child s=new Child("1bhk","Nexon");


         G.GProperties();
         F.FProperties();
         F.GProperties();
         s.Chproperty();
         s.FProperties();
         s.GProperties();

         Grandfather g1=new Father();//Possible as parent creates child
         Grandfather g2=new Child();//Possible as parent creates child
         Father f1= new Child();//Possible as parent creates child
        // Father f2=new Grandfather();//Not possible as child cant creates parent
        // Child c1=new Father ();//Not possible as child cant creates parent


        }


    }


