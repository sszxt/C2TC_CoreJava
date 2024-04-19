package org.student;
public class Student {

 // Method overload based on order
 public void studentId(int id) {
 // Implementation for order-based student ID
 System.out.println("id is "+id);
 }

 // Method overload based on type
 public void studentId(String type) {
 // Implementation for type-based student ID
 System.out.println("id is "+type);
 }

 // Method overload based on number
 public void studentId(int id, String type, int number) {
 // Implementation for number-based student ID
 System.out.println("id is "+id+type+number);
 }

 // Other methods and fields can be added here
 public static void main(String[] args) {
Student stu = new Student();
stu.studentId(123);
stu.studentId("xc13");
stu.studentId(23, "xcv", 18);
}
}
