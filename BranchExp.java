import java.util.Scanner;

class BranchExp {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Bank user1 = new Bank(6016, "Rohan Chaudhari", 25000);
        boolean loggedIn = true;
            while (loggedIn) {
                System.out.println("\n----- Main Menu -----");
                System.out.println("1 - Display\n2 - Deposit\n3 - withdraw\n4 - Exit");
                System.out.println("enter Your Choice : ");
                int ch = scan.nextInt();
                switch (ch) {
                    case 1:
                        user1.display();
                        break;
                    case 2:
                        System.out.print("Enter the amount to Deposit : ");
                        user1.deposit(scan.nextInt());
                        break;
                    case 3:
                    System.out.print("Enter the amount to Withdraw : ");
                    try {
                        user1.withdraw(scan.nextInt());
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    case 4:
						System.out.println("\n----- Good Bye -----");
                        System.out.println("Thanks For Visiting My System !!!");
                        loggedIn = false;
                        break;
                    default:
                        System.out.println("Wrong Choice");
                        break;
                }
            }
        }
    }
class Bank {
    private int balance;
    private int no;
    private String name;

    public Bank(int no, String name, int balance) {
        this.name = name;
        this.no = no;
        this.balance = balance;
    }
    public void display() {
        System.out.println("\n----- Display -----");
        System.out.println("Your Acc. No : " + no);
        System.out.println("Acc. Holder Name : " + name);
        System.out.println("Your Acc. Balance : " + balance);
    }
    public void deposit(int amount) {
        System.out.println("\n----- Deposit -----");
        balance = balance + amount;
        System.out.println("Your Updated Balance is : " + balance);
    }
    public void withdraw(int amount) {
        System.out.println("\n----- Withdraw -----");
        if (amount > balance) {
            throw new ArithmeticException("No sufficient Balance to withdraw");
        } else {
            balance = balance - amount;
            System.out.println("Your Updated Balance is : " + balance);
        }
    }
}