package org.college;

public class CollegeDetails {
private void collegeName() {
	System.out.println("Mohamed Sathak A.J College OF Engineering");

}
private void collegeCode() {
	System.out.println("3118");

}
private void collegeRank() {
	System.out.println("Rank 056");

}
public static void main(String[] args) {
	CollegeDetails c = new CollegeDetails();
	Student s = new Student();
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
	s.stName();
	s.stDep();
	s.stId();
	s.stHostelName();
	
}
}
