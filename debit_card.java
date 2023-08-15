import java.util.*;
public class debit_card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentBalance = 10000;
        System.out.println("Enter your DEBIT CARD PIN number: ");
        int password = sc.nextInt();
        if(password == 9246){
    while(true){   
        System.out.println("Choose 1 for WITHDRAW");
        System.out.println("Choose 2 for DEPOSITE");
        System.out.println("Choose 3 for CHECK BALANCE");
        System.out.println("Choose 4 for EXIT");
        System.out.println("Choose a Choice");
        int choice = sc.nextInt();
    switch(choice)
    {
        case 1:
        System.out.println("Enter the money you want to withdraw :");
        int withdraw = sc.nextInt();
        if(currentBalance >= withdraw){
            currentBalance = currentBalance - withdraw;
            System.out.println("Collect your Money");
        }
        else{
            System.out.println("Insufficient Balance");
        }
            System.out.println("");
    break;
        case 2:
        System.out.println("Enter the money you want to deposite:");
        int deposite = sc.nextInt();
        currentBalance = currentBalance + deposite;
        System.out.println("Your Money successfully deposited");
        System.out.println("");
    break;
        case 3:
        System.out.println("Your Current Balance is :"+currentBalance);
        System.out.println("");
    break;
        case 4:
        System.exit(0);
    break;
    }
    
    }
}else{
    System.out.println("You have entered wrong PIN number");
}
    }
}