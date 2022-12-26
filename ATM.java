 import java.util.*;
 public class ATM {
    static ArrayList<String> ar = new ArrayList<>();
    public static void History(){
        if(ar.size()==0){
           System.out.println("No History Available"); 
        }
        for(int i=ar.size()-1;i>=0;i--){
            System.out.println(ar.get(i));
            System.out.println("----------------------------------------------------------------");
            
        }
        System.out.println("Initial Balance: 5000");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        
    }
    public static void main(String args[] )
    { 
        int balance = 5000, withdraw, deposit, Transfered;
        int atmpin =123;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome to ATM");
            System.out.println("****************");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Transfer Money");
            System.out.println("5. Transaction History");
            System.out.println("6. Quit");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter ATM Pin: ");
                int pin=s.nextInt();
                if(atmpin == pin){
                    
                 System.out.print("Enter money to be withdrawn:");
                 withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                    ar.add("Withdraw: "+withdraw+"  ||  Balance: "+balance);
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
            }
            else{
                System.out.println("Incorrect ATM pin");
                System.exit(0);
            }
   
 
                case 2:
                System.out.print("Enter ATM Pin: ");
                int apin=s.nextInt();
                if(atmpin == apin){ 
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                ar.add("Deposit: "+deposit+"  ||  Balance: "+balance);
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
                }
                else{
                    System.out.println("Incorrect Atm Number or pin");
                    System.exit(0);
                }
 
                case 3:
                System.out.print("Enter ATM Pin: ");
                int cpin=s.nextInt();
                if(atmpin==cpin){ 
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
                }
                else{
                    System.out.println("Incorrect Atm Number or pin");
                    System.exit(0);
               }
     
 
                case 4:
                System.out.print("Enter ATM Pin: ");
                int bpin=s.nextInt();
                if(atmpin==bpin){ 
                System.out.print("Enter money to be Transfered:");
                Transfered = s.nextInt();
                if(balance >= Transfered)
                {
                    balance = balance - Transfered;
                    System.out.println("Money Transfered Sucessfully");
                    ar.add("Tranfer: "+Transfered+"  ||  Balance: "+balance);
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
            }
            else{
                System.out.println("Incorrect Atm Number or pin");
                System.exit(0);
           }
                case 5:
                System.out.println("---------------------------------------------------------------");
                   System.out.println("Transaction History are : ");
                   History();
                   break;

                case 6:
                System.exit(0);
            }
        }
    }
}

