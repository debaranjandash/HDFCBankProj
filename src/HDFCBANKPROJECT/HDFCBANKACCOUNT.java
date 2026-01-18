package HDFCBANKPROJECT;

class HDFCBankAccount implements BankAccount {  //Inheritance
	
	private long accNum;						//Encapsulation
	private String accHName;
	private double balance;
	
	public HDFCBankAccount(long accNum, String accHName, double balance) {
		this.accNum = accNum;
		this.accHName = accHName;
		this.balance = balance;
	}

	@Override									//Polymorphism
	public void deposit(double amt) throws NegativeAmountException {

		if(amt<=0) //logical programming [validation]
			throw new NegativeAmountException("amt can not zero or -ve value");  //Exception throwing
			
		this.balance = this.balance + amt;  //logical programming [calculation]
		System.out.println(amt + " is deposited in account "+ accNum);
	}
	
	@Override
	public void withdraw(double amt) throws NegativeAmountException, InsufficientFundsException {
		
		if(amt<=0)
			throw new NegativeAmountException("amt can not zero or -ve value");

		if(amt>balance)
			throw new InsufficientFundsException("Insufficient Funds");
		
		this.balance = this.balance - amt;
		System.out.println(amt + " is withdrawn from account "+ accNum);
	}
	
	@Override
	public void currentBalance() {
		System.out.println("current balance: "+ balance);
		
	}

	@Override
	public String toString() {
		return "HDFCBankAccount(accNum=" + accNum+")";
	}
	
}