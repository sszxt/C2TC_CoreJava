package org.computer;
public class Desktop extends Computer {
 public void desktopSize() {
 System.out.println("Desktop size method called");
 }
 public static void main(String[] args) {
 Desktop desktop = new Desktop();
 desktop.computerModel();
 desktop.desktopSize();
 }
}
