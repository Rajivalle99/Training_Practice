import java.util.*;
public class Savings_Account extends BankAss
{
	public int depositlimit=10000,withdrawlimit=20000,transeferlimit=30000;
	
	public Savings_Account(int accNo,String accName,int amount) 
	{
		// TODO Auto-generated constructor stub
		this.deposit_Limit=depositlimit;
		this.withdraw_Limit=withdrawlimit;
		this.transfer_Limit=transeferlimit;
		this.accNo=accNo;
		this.accname=accName;
		this.amount=amount;
	}
	
	@Override
	public String toString() {
		return "Savings_Account [name:"+ accname+" accno:"+accNo+"amount:"+amount+"tranferamount:"+transfered+"withdrawn:"
					+withdrawn+"deposited:"+deposited+"]";
	}
	
	
}
