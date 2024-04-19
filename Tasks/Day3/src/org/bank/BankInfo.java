package org.bank;
public class BankInfo {
public void saving() {
System.out.println("savings is 256980");
}
public void deposit() {
System.out.println("deposit is 7200");
}
public static void main(String[] args) {
BankInfo b = new BankInfo();
b.saving();
b.deposit();
}
}