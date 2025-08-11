package task_5;

import java.util.ArrayList;

public class Account {
	
	private String accountHolder;
	private double balance;
	private ArrayList<String> transactionHistory;
	
	
	public Account(String accountHolder,double initialBalance)
	{
		this.accountHolder=accountHolder;
		this.balance=initialBalance;
		this.transactionHistory=new ArrayList<>();
		transactionHistory.add("Account opened with balance : "+initialBalance);
	}
	
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			transactionHistory.add("Deposited : "+amount+ "New Balance : "+balance);
			System.out.println("Deposit successful!");
			
		}
		else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance-=amount;
			transactionHistory.add("Withdraw : "+amount+ "New Balance : "+balance);
			System.out.println("Withdrawal successful!");
		}
		else if(amount>balance)
		{
			System.out.println("Insufficient funds.");
		}
		else {
			System.out.println("Invalid withdrawal amount.");
		}
	}
	
	public void showBalance()
	{
		System.out.println("Current balance : "+balance);
	}
	
	public void showTransactionHistory()
	{
		System.out.println("Transaction History:");
		for(String record:transactionHistory)
		{
			System.out.println(record);
		}
	}

}
