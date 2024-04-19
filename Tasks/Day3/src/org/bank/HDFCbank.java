package org.bank;
public class HDFCbank extends BankInfo {
 public void deposit() {
 System.out.println("HDFC deposit is 35000");
 }
 public static void main(String[] args) {
HDFCbank a = new HDFCbank();
BankInfo b = new BankInfo();
a.deposit();
b.saving();
b.deposit();
}
}