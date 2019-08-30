package exceptionsdemo;

public class BankAccount {

	String accountHolderName;
	double balance;
	double withdrawalAmount;
	double deposit;
	double interestRate;
	String Address;
	int SSN;
	int cellPhone;

	public static void main(String[] args) {

		BankAccount reja = new BankAccount("Reja", 2500, 240, 100, 1.5, "3270 NW Unknown Street", 0120230, 71897384);

		System.out.println(reja.Address);

	}

// a parameterized constructor:
	BankAccount(String accountHolderName, double balance, double withdrawalAmount, double deposit, double interestRate,
			String Address, int SSN, int cellPhone) {

		this.accountHolderName = accountHolderName; // this refers to the current object (this class itself)
		this.balance = balance;
		this.withdrawalAmount = withdrawalAmount;
		this.deposit = deposit;
		this.interestRate = interestRate;
		this.Address = Address;
		this.SSN = SSN;
		this.cellPhone = cellPhone;

	}

}
