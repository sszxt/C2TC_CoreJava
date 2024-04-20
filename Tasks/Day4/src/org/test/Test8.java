package org.test;

public class Test8 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			// original code has logic mistake for (int j = i + 1; j <= i; j++)
			// In original code code execution was successful but the output cannot be displayed
			// Changes are from for (int j = i + 1; j <= i + 1; j++) into for (int j = i + 1; j <= i + 1; j++)
		for (int j = i + 1; j <= i + 1; j++) {
			System.out.println(j);
		}
	}
}
}

