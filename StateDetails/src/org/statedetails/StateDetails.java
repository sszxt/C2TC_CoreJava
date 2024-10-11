package org.statedetails;

public class StateDetails {
		private void southIndia() {
			System.out.println("tamilnadu");
			}
		private void northIndia() {
			System.out.println("delhi");
			}
		public static void main(String[] args) {
			LanguageDetails li = new LanguageDetails();
			StateDetails sd = new StateDetails();
			li.tamil();
			li.english();
			sd.southIndia();
			sd.northIndia();
		}
		}

}
