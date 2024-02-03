package src.oops;

public class BankAccountPersons {
  public static void main(String[] args) {
      BankAccount b1_1stentry = new BankAccount("HDFC", 300, "HDFC001");
      b1_1stentry.PrintDetails();
      BankAccount b1_2ndentry=new BankAccount("White",56);
      b1_2ndentry.OtherDetails();

      BankAccount b2=new BankAccount();
      b2.PrintDetails();
      b2.OtherDetails();


       BankAccount b3 = new BankAccount("AXIS", 300, "AXIS002");
       b3.PrintDetails();
       BankAccount b3_2ndentry=new BankAccount("Black", 55);
       b3_2ndentry.OtherDetails();

    }

   }

