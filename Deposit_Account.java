import java.util.*;
public class Deposit_Account extends BankAss 
{
	public int depositlimit=10000,withdrawlimit=20000,transeferlimit=30000;
	public Deposit_Account(int accNo,String accName,int amount) 
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
		return "Deposit_Account [name:"+ accname+" accno:"+accNo+"amount:"+amount+"tranferamount:"+transfered+"withdrawn:"
					+withdrawn+"deposited:"+deposited+"]";
	}
	
	
}
