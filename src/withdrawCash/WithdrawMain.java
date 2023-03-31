package withdrawCash; 

class WithdrawMain {

	public static void main(String[] args) {
		WithdrawClass  cash = new WithdrawClass ();
		cash.actualCode = 1234;
		cash.EnteredCode = 4567;
		cash.EnterPinCode();
		cash.CashWithdrawn();
		
	}

}
