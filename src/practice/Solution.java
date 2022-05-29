package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int jj = 1;jj<=tc;jj++) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			int q = sc.nextInt();
			int sum = n*(n+1)/2;
			int leftsum = 0;
			int index = 0;
			if(sum%(p+q)==0) {
				System.out.println("Case #"+jj+": "+"POSSIBLE");
				HashSet<Integer> set = new HashSet<Integer>();
				ArrayList<Integer> arr = new ArrayList<Integer>();
				int share = (int)(((double)p/(p+q))*sum);
				for(int i = 1;i<=n;i++) {
					if(!set.contains(share)&&share<=n) {
						set.add(share);
						break;
					}
					share-=i;
					set.add(i);
					
				}
				System.out.println(set.size());
				for(int i=1;i<=n;i++) if(set.contains(i)) System.out.print(i+" ");
				System.out.println();
			}
			else System.out.println("Case #"+jj+": "+"IMPOSSIBLE");
			
		}

	}

}
