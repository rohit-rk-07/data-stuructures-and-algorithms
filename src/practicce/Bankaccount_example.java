//real world example bank account

package practicce;

class Bankaccount{
	String accountHolder;
	double balance;
	
	Bankaccount(String name, double initialBalance){
		accountHolder = name;
		balance = initialBalance;
	}
	
	void deposit(double amount) {
		balance += amount;
	}
	
	void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balanace.");
		}
	}
	
	void display() {
		System.out.println(accountHolder+"'s Balance: "+balance);
	}
}

public class Bankaccount_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankaccount acc = new Bankaccount("Rohit", 1000.0);
		acc.deposit(500);
		acc.withdraw(200);
		acc.display();
	}

}
