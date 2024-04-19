package org.companyinfo;

public class CompanyInfo {
	private void companyName() {
		System.out.println("Tata Consultancy Services");
	}
	private void companyId() {
		System.out.println("698754");
	}
	private void companyAddress() {
		System.out.println("Siruseri IT Park , Chennai");
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();
	}
}
