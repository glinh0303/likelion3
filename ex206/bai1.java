package ex206;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if (s.length() >= 2) {
			for (int i = 0; i < s.length() - 1; i++) {
				Character c1 = s.charAt(i);
				int j = i + 1;
				for (; j < s.length(); j++) {
					Character c2 = s.charAt(j);
					if (c1 == c2) {
						break;
					}
				}
				if (j == s.length()) {
					System.out.println(c1);
					break;
				}
			}
		} else {
			System.out.println(s.charAt(0));
		}
	}

}
