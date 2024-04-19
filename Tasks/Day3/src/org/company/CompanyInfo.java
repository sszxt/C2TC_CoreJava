package org.company;
public class CompanyInfo {
public void companyName() {
// TODO Auto-generated method stub
System.out.println("company id:");
}
public void companyName(int i) {
// TODO Auto-generated method stub
System.out.println("company id      " + i);
}
public void companyName(int j , String h) {
// TODO Auto-generated method stub
System.out.println("company id and name " +j+h);
}
public static void main(String[] args) {
CompanyInfo e = new CompanyInfo();
e.companyName();
e.companyName(1234);
e.companyName(5678, "tcs");
}
}