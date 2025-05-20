package src.Revision;

public class Banks {
    public static void main(String[] args) {

        BankAccount b= new BankAccount();
        b.PrintDetails();

        BankAccount b1=new BankAccount("HDFC",250,"HDFC001");
        b1.PrintDetails();

        BankAccount b2=new BankAccount("SBI",350,"SBI001");
        b2.PrintDetails();
    }
}
