package org.edu;
public class Education extends Arts {
 public void ug() {
 System.out.println("Undergraduate method called");
 }
 public void pg() {
 System.out.println("Postgraduate method called");
 }
 public static void main(String[] args) {
 Education education = new Education();
 education.ug();
 education.pg();
 education.bEd();
 education.bA();
 education.bBA();
 education.bE();
 education.bTech();
 education.physio();
 education.dental();
 education.mbbs();
 }
}
