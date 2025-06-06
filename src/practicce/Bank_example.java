//class Bank with a getInterestRate()
//extend it with SBI and HDFC classes that override 
//getInterestRate() to return different values
//use base class reference to point to child class objects and call the method.

package practicce;

class Bank{
	double getInterestRate(){
		return 0.0;
	}
}

class SBI extends Bank{
	double getInterestRate() {
		return 6.5;
	}
}

class HDFC extends Bank{
	double getInterestRate() {
		return 7.0;
	}
}

public class Bank_example {

	public static void main(String[] args) {
		//base class reference for SBI
		Bank bank1 = new SBI();
		//base class reference for HDFC
		Bank bank2 = new HDFC();
		
		System.out.println("SBI interest rate: "+bank1.getInterestRate()+"%");
		System.out.println("HDFC interest rate: "+bank2.getInterestRate()+"%");
	}

}
