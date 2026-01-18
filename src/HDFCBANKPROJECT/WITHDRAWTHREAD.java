package HDFCBANKPROJECT;

class WithdraweeThread extends Thread {
	private BankAccount acc;
	private double amt;
	
	public WithdraweeThread(BankAccount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}

	@Override
	public void run() {
		try {
			acc.withdraw(amt);
		} catch (NegativeAmountException | InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
	}
}