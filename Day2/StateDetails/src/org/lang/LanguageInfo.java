package org.lang;
public class LanguageInfo extends StateDetails{
 public void tamilLanguage() {
 System.out.println("Tamil language method called");
 }
 public void englishLanguage() {
 System.out.println("English language method called");
 }
 public void hindiLanguage() {
 System.out.println("Hindi language method called");
 }
 public static void main(String[] args) {
 LanguageInfo languageInfo = new LanguageInfo();
 languageInfo.tamilLanguage();
 languageInfo.englishLanguage();
 languageInfo.hindiLanguage();
 languageInfo.southIndia();
 languageInfo.northIndia();
 }
}
