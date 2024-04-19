package org.computer;
public class Computer implements Software, Hardware {
public void desktopDetails() {
System.out.println("system is Asus VivoBook 15");
}
@Override
public void hardwareDetails() {
System.out.println("8GB ram , 512 SSD");
}
@Override
public void softwareResources() {
System.out.println("windows 10");
}
public static void main(String[] args) {
Computer pc = new Computer();
pc.desktopDetails();
pc.hardwareDetails();
pc.softwareResources();
}
}