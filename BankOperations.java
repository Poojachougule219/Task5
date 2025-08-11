package task_5;

import java.util.Scanner;

public class BankOperations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		create account
		System.out.println("Enter account holder name:");
		String name=sc.nextLine();
		
		System.out.println("Enter initial balance:");
		double balance=sc.nextDouble();
		
		Account account=new Account(name, balance);
		
//		menu
		int choice;
		do {
			System.out.println("\n--- Bank Menu ---");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Show Balance");
			System.out.println("4. Show Transaction History");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter deposit amount : ");
					double depositAmt=sc.nextDouble();
					account.deposit(depositAmt);
					break;
					
				case 2:
					System.out.println("Enter withdrawal amount : ");
					double withdrawAmt=sc.nextDouble();
					account.withdraw(withdrawAmt);
					break;
					
				case 3:
					account.showBalance();
					break;
					
				case 4:
					account.showTransactionHistory();
					break;
					
				case 5:
					System.out.println("Thank you for using the bank system!");
					break;
					
				default:
					System.out.println("Invalid choice.Try again.");
			}
		}while(choice!=5);
		
		sc.close();
		
	}

}
