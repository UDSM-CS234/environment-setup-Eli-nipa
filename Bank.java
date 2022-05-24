package Bank;

import java.util.Objects;
import java.util.Scanner;

class BankAccount {

    private static double acc_balance ;
    private final String accName;
    private final float accNo;

    BankAccount(String accName , float accNo){
        this.accName = accName;
        this.accNo = accNo;
    }

    void withdraw(double withdraw_amount){

        if(withdraw_amount <= acc_balance){
            BankAccount.acc_balance = BankAccount.acc_balance -withdraw_amount ;
         System.out.println("withdraw sucessfull : your balance is "+BankAccount.acc_balance);
        }
        else {
            System.out.println("withdraw failed");
        }

    }

    public  double getAcc_balance() {
        return acc_balance;
    }

    public String getAccName() {
        return accName;
    }

    public double getAccNo() {
        return accNo;
    }

    public  void setAcc_balance(double acc_balance) {
        BankAccount.acc_balance = acc_balance;
    }
}

public class Bank {

    public static void main(String[] args) {

        //creating acc1 and acc2
        BankAccount acc1 = new BankAccount("Drift",2345678);
        BankAccount acc2 = new BankAccount("Jidamva",987653);

        Scanner KNOW_Your_Acc = new Scanner(System.in);


        System.out.println("You want to get into account 1 or 2 ?");
        String accountOwner = KNOW_Your_Acc.nextLine();


        if(Objects.equals(accountOwner, "1")){

            //get acc 1 balance
            System.out.println("Your acc1 name is "+" "+acc1.getAccName());
            System.out.println("Your account 1 balance "+"  "+acc1.getAcc_balance());
            System.out.println("Your account 1 no "+"  "+acc1.getAccNo());


            //deposit acc 1
            Scanner deposit = new Scanner(System.in);
            System.out.println("Enter Amount you want to deposit To account 1");
            double depositAMount = deposit.nextDouble();
            acc1.setAcc_balance(depositAMount);
            System.out.println("Your Account 1 balance is"+ "  "+acc1.getAcc_balance());

            //withdraw acc 1
            Scanner withdraw = new Scanner(System.in);
            System.out.println("Enter Amount you want to withdraw to acc 1");
            double withdrawAMountAcc1 = withdraw.nextDouble();
            acc1.withdraw(withdrawAMountAcc1);



        }

      else  if(Objects.equals(accountOwner, "2")){


            //get acc 2 balance
            System.out.println("Your acc2 name is "+" "+acc2.getAccName());
            System.out.println("Your account 2 balance "+"  "+acc2.getAcc_balance());
            System.out.println("Your account 2 no "+"  "+acc2.getAccNo());


            //deposit acc 2
            Scanner deposit2 = new Scanner(System.in);
            System.out.println("Enter Amount you want to deposit To account 2");
            double depositAMountAcc2 = deposit2.nextDouble();
            acc2.setAcc_balance(depositAMountAcc2);
            System.out.println("Your Account 2 balance is"+ "  "+acc2.getAcc_balance());



            //withdraw acc 2
            Scanner withdraw2 = new Scanner(System.in);
            System.out.println("Enter Amount you want to withdraw to Acc2");
            double withdrawAMountAcc2 = withdraw2.nextDouble();
            acc2.withdraw(withdrawAMountAcc2);


        }

        else {
            System.out.println("Enter valid acc number");

        }




    }





}
