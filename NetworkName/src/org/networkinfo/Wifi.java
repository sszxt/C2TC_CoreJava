package org.networkinfo;
public class Wifi {
	public void wifiName() {
	System.out.println("msajce wifi");
}
public static void main(String[] args) {
	Wifi w = new Wifi();
	MobileData md = new MobileData();
	Lan l = new Lan();
	Wireless x = new Wireless();
	w.wifiName();
	md.dataName();
	l.lanName();
	x.modemName();
}
}