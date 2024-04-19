package org.phone;
public class Phone {
public void phoneDetails() {
// TODO Auto-generated method stub
System.out.println("company id");
}
public void phoneDetails(int i) {
// TODO Auto-generated method stub
System.out.println("company id" + i);
}
public void phoneDetails(int j , String h) {
// TODO Auto-generated method stub
System.out.println("company id" +j+h);
}
public static void main(String[] args) {
Phone e = new Phone();
e.phoneDetails();
e.phoneDetails(1234);
e.phoneDetails(2345, " samsung");
}
}