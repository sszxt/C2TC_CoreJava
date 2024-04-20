package org.test;

public class Test9 {
	public static void main(String[] args) {
		for(int i=1; i<=100;i++){
			// original code <for (int i=5; i<=100;i++)> condition: if (i==5) So the loop cannot exectued
			// changes are for(int i=1; i<=100;i++) where i = 1
		if (i == 5) {
		break;
		}
		System.out.println(i);
		}
	}
}
