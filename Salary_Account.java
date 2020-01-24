import java.util.*;
public class Salary_Account extends BankAss
{
	public int depositlimit=20000,withdrawlimit=30000,transeferlimit=40000;
	public Salary_Account(int accNo,String accName,int amount) 
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
		return "Salary_Account [name:"+ accname+" accno:"+accNo+"amount:"+amount+"tranferamount:"+transfered+"withdrawn:"
					+withdrawn+"deposited:"+deposited+"]";
	}
	
	

}
