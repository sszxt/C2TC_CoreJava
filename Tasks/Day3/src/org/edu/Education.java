package org.edu;
public class Education {
public void ug() {
 System.out.println("UG degree available only for BSC BED BBA & BA");
 }
 public void pg() {
 System.out.println("pg degree availabe for all courses");
 }
 public static void main(String[] args) {
Education e = new Education();
e.ug();
e.pg();
}
}