package org.university;
public class College extends University {
@Override
 public void ug() {
System.out.println(" ug degree available to specific courses");
}
 @Override
 public void pg() {
 System.out.println(" pg degree available to 4 courses only");
 }
 public static void main(String[] args) {
College c = new College();
University u = new University();
u.ug();
c.ug();
u.pg();
c.pg();
}
}
