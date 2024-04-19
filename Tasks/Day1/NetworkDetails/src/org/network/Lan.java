package org.network;

public class Lan {
public void lanName() {
System.out.println("MSAJCE LAN");
}
public static void main(String[] args) {
	Wifi w = new Wifi();
	MobileNetwork md = new MobileNetwork();
	Lan l = new Lan();
	w.WifiName();
	md.dataName();
	l.lanName();
}
}
