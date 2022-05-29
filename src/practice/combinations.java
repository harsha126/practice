package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class combinations {

	public static void main(String[] args) {

		int n;
		Vector<Vector<Character>> ans = new Vector<Vector<Character>>();
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		n = s.length();
		Vector<Character> ss = new Vector<Character>();
		List<Character> sss = new ArrayList<>();
		for (int h = 0; h < n; h++) {
			ss.add(s.charAt(h));
		}
		System.out.println(ss);
		permute(ss, 0, ans);
		System.out.println(ans);

	}

	static void permute(Vector<Character> ss, int n, Vector<Vector<Character>> ans) {
		if (n == ss.size()) {
			ans.add(ss);
			return;
		}
		for (int i = n; i < ss.size(); i++) {
			Collections.swap(ss, i, n);
			permute(ss, n + 1, ans);
			Collections.swap(ss, i, n);
		}

	}

}
