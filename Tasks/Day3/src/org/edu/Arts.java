package org.edu;
public class Arts extends Education {
public void bSC() {
System.out.println("BSC degree availabe ");
}
public void bEd() {
System.out.println("BED degree availabe ");
}
public void bA() {
System.out.println("BA degree availabe ");
}
public void bBA() {
System.out.println("BBA degree availabe ");
}
public static void main(String[] args) {
Arts a = new Arts();
Education e = new Education();
a.bA();
a.bBA();
a.bEd();
a.bSC();
e.ug();
e.pg();
}
}