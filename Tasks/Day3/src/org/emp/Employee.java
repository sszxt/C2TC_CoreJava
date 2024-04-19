package org.emp;
public class Employee {
public void empId() {
// TODO Auto-generated method stub
System.out.println("employee id:");
}
public void empId(int i) {
// TODO Auto-generated method stub
System.out.println("employee id :  " + i);
}
public void empId(int j , String h) {
// TODO Auto-generated method stub
System.out.println("employee id and name :"+j +h);
}
public static void main(String[] args) {
Employee e = new Employee();
e.empId();
e.empId( 123);
e.empId(1234, "Sameer");
}
}
