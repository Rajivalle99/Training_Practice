import java.util.*;

import bank.Account;
import bank.DepositAccount;
import bank.Driver;
import bank.DriverMethods;
import bank.SalaryAccount;
import bank.SavingsAccount;
public class BankAss implements MethodsInterface
{

	public static int amount;
	public static int accNo;
	public String accname;
	
	public int deposit_Limit,withdraw_Limit,transfer_Limit;
	public int deposited,transfered,withdrawn;

	
	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return amount;
		
	}

	@Override
	public void deposit(int depo_amount) {
		// TODO Auto-generated method stub
		if(depo_amount<=deposit_Limit)
		{
			amount=amount+depo_amount;
			deposited += depo_amount;
			System.out.println("Deposited amount:--"+depo_amount);
			
		}
		else
			System.out.println("you are exceeded your limit");
		
	}

	@Override
	public void withdrawn(int withdr_amount) {
		// TODO Auto-generated method stub
		if(amount>=withdr_amount && withdr_amount<=withdraw_Limit)
		{
			amount=amount-withdr_amount;
			withdrawn +=withdr_amount;
			System.out.println("Withdrawn_amount is:--"+withdr_amount);
		}
		else
			System.out.println("you don't have sufficient balance or you are exceeded your limit");
	}

	@Override
	public void transfer_fund(BankAss acc,int trans_amount) {
		// TODO Auto-generated method stub
		if(amount>=trans_amount && trans_amount<=transfer_Limit)
		{
			acc.amount+=trans_amount;
			amount-=trans_amount;
			transfered+=trans_amount;
			System.out.println("Transfered amount"+trans_amount+" to "+acc.accNo+" "+acc.accname);
		}
		else
			System.out.println("you don't have enough balance to transfer or you reached your limit");
	}
	

	 static Scanner sc1 = new Scanner(System.in);
	static final List<BankAss> customers = new ArrayList<BankAss>();
	
	public static void main(String[] args) {
		
		System.out.println("-------Welcome--------"
				+ "\n How can I help you?\n"
				+ "\n 1.Create New Account\n 2.Withdraw\n 3.Deposit\n"
				+ " 4.Transfer\n 5.Check Balance");
		
		int choice = sc1.nextInt();
		while(true) {
			
			switch(choice)
			{
				case 1:createAccount(); break;
				case 2:withdraw(); break;
				case 3: deposit(); break;
				case 4: transfer(); break;
				case 5: checkBalance(); break;
				default: System.exit(0);
			}
			System.out.println("\n 1.Create New Account\n 2.Withdraw\n 3.Deposit\n"
					+ " 4.Transfer\n 5.Check Balance");
			choice = sc1.nextInt();
		}
	}

	static Scanner sc = new Scanner(System.in);
	
	public static void createAccount()
	{
		
		System.out.println("Here we are diff accounts...Which acc u want\n"
				+ " 1.Salary\n 2.Savings\n 3.Deposit");
		
		int choice = sc1.nextInt();
		sc1.nextLine();
		System.out.println("Enter your name:: "); 
		String name = sc1.nextLine();
		System.out.println("Enter your desired account number:: ");
		int accountNumber = sc1.nextInt(); 
		if(!alreadyhaveacc(accountNumber))
		{
			System.out.println("Enter initial amount:: "); int initialAmount = sc1.nextInt();
			
			BankAss acc = null;;
			switch(choice)
			{
				case 1: acc =  new Salary_Account(accNo, name,amount); 
								customers.add(acc); break; 
				case 2: acc =  new Savings_Account(accNo,name,amount);
								customers.add(acc); break;
				case 3: acc = new Deposit_Account(accNo,name,amount);
								customers.add(acc); break;
				
				default: System.out.println("Invalid Choice");
			}
			if(choice == 1 || choice == 2 || choice == 3)
				System.out.println("Account created. ");
		}
		else
			System.out.println("Account number already taken");
	}
	
	public static void withdraw()
	{
		int accNumber = getAccountNumber();
		BankAss acc = selectCustomer(accNumber);
		
		if(acc != null)
		{
			System.out.println("Enter the amount to be withdrawn");
			int amount = sc1.nextInt();
			acc.withdrawn(amount);
		}
		else
			System.out.println("Account not found");
	}
	
	public static void deposit()
	{
		int accNumber = getAccountNumber();
		BankAss acc = selectCustomer(accNumber);
		if(acc != null) {
			System.out.println("Enter the amount to deposit");
			int amount = sc1.nextInt();
			acc.deposit(amount);
		}
		else
			System.out.println("Account not found");
	}
	
	public static void transfer()
	{
		System.out.println("Enter your account number");
		int accNumber = sc1.nextInt();
		BankAss acc = selectCustomer(accNumber);
		
		if(acc != null) {
			
			System.out.println("Enter recipient's account number");
			accNumber = sc1.nextInt();
			BankAss recAcc = selectCustomer(accNumber);
			
			if(recAcc != null) {
				System.out.println("Enter the amount to transfer");
				int amount = sc1.nextInt();
				acc.transfer_fund(recAcc, amount);
			}
			else
				System.out.println("Recipient account not found"); 
		}
		else
			System.out.println("Account not found");
	}
	
	public static void checkBalance()
	{
		int accNumber = getAccountNumber();
		BankAss acc = selectCustomer(accNo);
		
		if(acc != null)					//this method id for checkbalance
		{
			System.out.println("Balance:: "+ acc.getBalance());
		}
		else
			System.out.println("Account not found");
	}
	
	

	//supporting methods
	
	
	public static BankAss selectCustomer(int accNo)
	{
		for(BankAss a : customers)			//returns acc no is matching in list or not
		{
			if(a.accNo == accNo)
				return a;
		}
		return null;
	}
	
	
	public static int getAccountNumber()
	{
		System.out.println("Enter your account number");   //this method is for acc no
		int accNumber = sc1.nextInt();
		return accNo;
	}
	

	public static boolean alreadyhaveacc(int accNo)
	{
		for(BankAss a : customers)
		{									//This method is to check whether the acc no is already in customers list 
			if(a.accNo == accNo)
				return true;
		}
		return false;
	}

	
}

