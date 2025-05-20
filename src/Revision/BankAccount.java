package src.Revision;

import java.sql.SQLOutput;

public class BankAccount {

    String Bankname;
    int BankBal;
    String BankCode;

    BankAccount(){
        System.out.println("DC");
    }
    BankAccount(String Bname, int Bbal, String Bcode){
        this.Bankname=Bname;
        this.BankBal=Bbal;
        this.BankCode=Bcode;
    }

    void PrintDetails(){
        System.out.println(this.Bankname);
        System.out.println(this.BankBal);
        System.out.println(this.BankCode);
    }
}