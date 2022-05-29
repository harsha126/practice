package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.math.*;

public class codechef {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder bin = new StringBuilder();
		for(int i=0;i<32;i++) {
			bin.append(n&1);
			n=n>>1;
		}
		char[] binarray=bin.toString().toCharArray();
		for(int i=0;i<32;i++) {
			char temp = binarray[i];
			binarray[i]=binarray[i+1];
			binarray[i+1]=temp;
			i++;
		}
		System.out.println(bin.toString());
		int res = 0;
		for(int i=31;i>=0;i--) {
			if(binarray[i]=='1') {
				res+=(int)Math.pow(2,i);
				System.out.println("yes");
				}
		}
//		System.out.println(binarray.toString());
		for(int i=0;i<32;i++) {
			System.out.print(binarray[i]+""+i+" ");
		}
		System.out.println();
//		System.out.println(bin.toString().toCharArray());
		System.out.println(res);
		
	}
	
	public static boolean isPal(StringBuilder str) {
		int n = str.length();
		for(int i=0;i<n/2;i++) {
			if(str.charAt(i)!=str.charAt(n-i-1)) return false;
		}
		return true;
	}
	
	public static int fact(int n ,int m) {
		int s = 1;
		for(int i=1;i<=n;i++) {
			s=(s*i)%m;
		}
		return s;
	}

}
