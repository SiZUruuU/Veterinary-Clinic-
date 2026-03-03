import java.util.*;
public class Account {
    Scanner in = new Scanner(System.in);
    Scanner on = new Scanner(System.in);
    
    String name, address;
    int age, membership;
    boolean adult;

    public Account(){
        System.out.println("\n========ACCOUNT CREATION========");
        System.out.print("\nName: ");
        this.name = in.nextLine();

        System.out.print("Age: ");
        this.age = in.nextInt();
    

        if(this.age < 18){
            this.adult = false;
            System.out.print("An adult is required to make an account");
            System.exit(0);
        }

        System.out.print("Address: ");
        this.address = on.nextLine();

        System.out.println("\n                    =====PLEASE CHOOSE A MEMBERSHIP OPTION=====");
        System.out.println("\n[1] Chihuahua Membership - Only includes basic checkups and no discount in medicines");
        System.out.println("[2] Beagle Membership - Basic grooming is included with 15% discount in anti-bacterial medicine");
        System.out.println("[3] Rottweiler Membership - All grooming services available with 20% discount in viral and anti-bacterial medicine and access to raffle draw every month");
        System.out.println("[4] Tibetin Membership - All grooming services and cosmetics available with 30% discount in all medicine and access to raffle draw every month");
        System.out.print("\nPlease choose a number: ");
        this.membership = in.nextInt();
    }

    @Override
    public String toString(){
        String memberType = "";

        switch(this.membership){

            case 1 -> memberType = "Chihuahua Membership";
            case 2 -> memberType = "Beagle Membership";
            case 3 -> memberType = "Rottweiler Membership";
            case 4 -> memberType = "Tibetin Membership";
        }

        return  "\n=====ACCOUNT DETAILS=====" +
                "\nAccount Name: " + this.name +
                "\nAge: " + this.age + 
                "\nAddress: " + this.address +
                "\nMembership Type: " + memberType;
        
    }

}
