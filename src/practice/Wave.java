package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Wave {

	public static void main(String[] args) {
		int t, n, p;
		char NAme[] = { 'F', 'r', 'i', 'e', 'n', 'd', 's' };
	}

	class Solution {
		void matchPairs(char nuts[], char bolts[], int n) {
			Arrays.sort(nuts);
			Arrays.sort(bolts);
			boolean valid = true;
			if (nuts.length == bolts.length) {
				for (int i = 0; i < nuts.length; i++) {
					if (nuts[i] == bolts[i])
						valid = true;
					else
						valid = false;
				}
			} else
				valid = false;

			if (valid) {
				for (char ch : nuts)
					System.out.print(ch);
				System.out.println("");
				for (char h : bolts)
					System.out.print(h);
			} else
				System.out.println("not valid");

		}

	}

}
