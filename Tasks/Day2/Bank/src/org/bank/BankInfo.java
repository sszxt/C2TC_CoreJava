package org.bank;
public class BankInfo extends AxisBank{
 public void saving() {
 System.out.println("Saving method called");
 }
 public void fixed() {
 System.out.println("Fixed method called");
 }
 public static void main(String[] args) {
 BankInfo bankInfo = new BankInfo();
 bankInfo.saving();
 bankInfo.fixed();
 bankInfo.deposit();
 }
}
