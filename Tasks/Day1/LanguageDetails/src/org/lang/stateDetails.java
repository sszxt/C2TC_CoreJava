package org.lang;

public class stateDetails {
private void southIndia() {
	System.out.println("tamilnadu");

}
private void northIndia() {
	System.out.println("delhi");

}
public static void main(String[] args) {
	LanguageInfo li = new LanguageInfo();
	stateDetails sd = new stateDetails();
	li.tamil();
	li.english();
	sd.southIndia();
	sd.northIndia();
}
}
