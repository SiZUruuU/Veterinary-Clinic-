import java.util.*;
public class Clinic{

    Scanner in = new Scanner(System.in);
    String name;
    int age;
    double filler1;
    boolean account;
    float filler3;
    char res;

    public void Introduction(){

        System.out.println("Welcome to Den's Vet Clinic!");

        while(true){
            System.out.print("Do you have an account? [YES/NO]: ");
            res = in.next().charAt(0);

                switch(res){

                    case 'y','Y' -> {account = true; return;}
                    case 'n','N' -> {account = false; return;}
                    default -> {
                        System.out.print("\nWrong input, please try again.\n");
                        //Repeat process
                    }
                }
        }
    }  
} 