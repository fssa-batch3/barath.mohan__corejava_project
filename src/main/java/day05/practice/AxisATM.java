package day05.practice;


public class AxisATM implements ATM{

	protected final double withdrawCharges =5;
	
	static double  totalWithdrawChargesAmount;
	public boolean deposit(Account account, double amount) {
		
		double bal=account.getBalance()+amount;
		account.setBalance(bal);
		System.out.println(amount+" has been deposited successfully! New balance is "+bal);
		return true;
	}
	public boolean withdraw(Account account,double amount) throws Exception{
		double bal=account.getBalance()-amount -withdrawCharges;
		if(bal<5000) {
			throw new Exception("The balance is less than 5000! Unable to withdraw!");
		}
		account.setBalance(bal);
		totalWithdrawChargesAmount+=5;
		System.out.println(amount+" has been withdrawed successfully! New balance is "+bal);
		return true;
	}
	public double getTotalChargesAmount(){
		return totalWithdrawChargesAmount;
	}
	
	@Override
	public double getBalance(Account account) {

		return account.getBalance();
	}


}
