package day05.practice;

public class AccountUser {

	public static void main(String[] args) throws Exception {
		
		Account ac= new Account("123",5000);
		
		IciciATM iciciAtm = new IciciATM();
		AxisATM axisAtm = new AxisATM();
		axisAtm.deposit(ac, 20000);
		iciciAtm.withdraw(ac, 1000);
		axisAtm.withdraw(ac, 4000);
		
		System.out.println("Account balance is "+axisAtm.getBalance(ac)); 
		System.out.println("Total withdraw charges collected by Axis ATM is "+axisAtm.getTotalChargesAmount());
		System.out.println("Total withdraw charges collected by Icici ATM is "+iciciAtm.getTotalChargesAmount());
		
		
	}

}
