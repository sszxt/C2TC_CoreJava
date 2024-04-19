package org.bankdetails;

public class BankDetails {
	private void fullname() {
		System.out.println("Account Holder Name : Sameer");
	}
	private void sortCode() {
	System.out.println("details sorted");
	}
	private void accountNumber() {
	System.out.println("acc no is 987654321");
	}
	private void bankAddress() {
		System.out.println("Bank Address : XYZ BANK , SIRUSERI ");
	}

	public static void main(String[] args) {
		BankDetails bd = new BankDetails();
		bd.fullname();
		bd.sortCode();
		bd.accountNumber();
		bd.bankAddress();
	}
	}
