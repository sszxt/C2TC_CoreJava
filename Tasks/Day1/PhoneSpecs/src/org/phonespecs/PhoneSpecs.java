package org.phonespecs;

public class PhoneSpecs {
	private void phonename() {
		System.out.println("Phone Name : Samsung S24");
	}
	private void phoneIMEINum() {
		System.out.println("78926846543");

	}
	private void phonecamera() {
		System.out.println("64 MP");
	}
	private void phonestorage() {
		System.out.println("512 gb");
	}
	private void phoneOS() {
		System.out.println("android");
	}
	public static void main(String[] args) {
		PhoneSpecs ps = new PhoneSpecs();
		ps.phonename();
		ps.phoneIMEINum();
		ps.phonecamera();
		ps.phonestorage();
		ps.phoneOS();
	}
	}

