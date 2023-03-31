package withdrawCash;

import java.util.Scanner;

public class WithdrawClass {
	int withdrawn;
	int actualCode = 1234;
	int EnteredCode;
	int balanceAmt=4000;
	boolean isPinCorrect;
	Scanner sc = new Scanner(System.in);
	void EnterPinCode() {
		for(int counter = 1;counter<=3;counter++)
		{
			System.out.println("ENTER THE CODE");
			EnteredCode = sc.nextInt();
			if(actualCode==EnteredCode  ) {
				System.out.println("Entered code is correct");
				
				break;
			}
			//else if(counter = 4 ) { 
			//System.out.println("card block");
			//}
			else
			{
				System.out.println("Entered pin incorrent");
				System.out.println("Card blocked");
			}
		}
			
		}
		void CashWithdrawn() {
			System.out.println("Enter the withdrawn amount");
			withdrawn = sc .nextInt();
			if(withdrawn<=balanceAmt) {
				System.out.println("Cash withdrawn amount="+withdrawn);
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
		}
			
