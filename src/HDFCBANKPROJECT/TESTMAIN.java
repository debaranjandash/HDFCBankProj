package HDFCBANKPROJECT;

public class TESTMAIN {
public static void main(String[] args) throws InterruptedException {
	
	HDFCBankAccount acc1 = new HDFCBankAccount(1234, "HK", 10000);
	HDFCBankAccount acc2 = new HDFCBankAccount(4567, "BK", 20000);
	HDFCBankAccount acc3 = new HDFCBankAccount(4321, "PK", 30000);
	
	DepositerThread dt1 = new DepositerThread(acc1, 5000);
	DepositerThread dt2 = new DepositerThread(acc2, 3000);
	WithdraweeThread dt3 = new WithdraweeThread(acc3, 2000);
	
	dt1.start();
	dt2.start();
	dt3.start();
	
	Thread.sleep(1000); //pauses main thread for 1 second 
	
	System.out.print("\nacc1 "+ acc1 +" "); acc1.currentBalance(); 
	System.out.print("acc2 "+ acc2 +" "); acc2.currentBalance(); 
	System.out.print("acc3 "+ acc3 +" "); acc3.currentBalance(); 
	
}
}


