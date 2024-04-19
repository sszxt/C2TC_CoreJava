package org.college;
public class Student extends Department {
 public void studentName() {
 System.out.println("Student name method called");
 }
 public void studentDept() {
 System.out.println("Student department method called");
 }
 public void studentId() {
 System.out.println("Student ID method called");
 }
 public static void main(String[] args) {
 Student student = new Student();
 student.studentName();
 student.studentDept();
 student.studentId();
 student.collegeName();
 student.collegeCode();
 student.collegeRank();
 student.deptName();
 student.hostelName();

 }
}
