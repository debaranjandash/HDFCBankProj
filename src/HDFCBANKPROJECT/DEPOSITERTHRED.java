package HDFCBANKPROJECT;

class DepositerThread extends Thread {
	
	private BankAccount acc;
	private double amt;
	
	public DepositerThread(BankAccount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}

	@Override
	public void run() {
		try {
			acc.deposit(amt);
		}catch (NegativeAmountException  e) {
			System.out.println(e.getMessage());
		}
	}
}