package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hashcourse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		List<Integer> v = new ArrayList<Integer>();
		List<Integer> k = new ArrayList<Integer>();
		List<Integer> w = new ArrayList<Integer>();
		List<Integer> q = new ArrayList<Integer>();

		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q;
		for (int i = 0; i < N - 1; i++) {
			a.add(sc.nextInt());
			b.add(sc.nextInt());
		}
		for (int i = 0; i < M; i++) {
			v.add(sc.nextInt());
			k.add(sc.nextInt());
			w.add(sc.nextInt());

		}
		Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			q.add(sc.nextInt());
		}
		System.out.println("N=" + N + " M=" + M + " a=" + a + " b=" + b + " v=" + v + " k=" + k + " w=" + w + " ");

	}

	public  int hash(String s) {
		int hash = 0;
		for (int i = 0; i < s.length(); i++) {
			hash += s.charAt(i);
		}
		return hash;
	}

}