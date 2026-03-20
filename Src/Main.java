package Src;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        ArrayList<Account> accounts = new ArrayList<>();
        try (Scanner in = new Scanner(System.in)) {
            Clinic clinic = new Clinic();
            clinic.Introduction();

            if(clinic.account == false){
                Account account = new Account();
                accounts.add(account);
                System.out.print(accounts.get(0));
            }

            System.out.print("\n\n=====PRESS ENTER TO CONTINUE=====");
            String enter = in.nextLine();
        }

        System.out.print("UPDATES COMING...STAY TUNED!!!");
    }
}
