package practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;

public class isPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum=(sum^arr[i]);
			System.out.println(arr[i]+":"+sum);
		}
		System.out.println(sum);
		
         	
  }
	public static void toh(int n,String x,String y,String z) {
		if(n>=1) {
			if(n==1) System.out.println("move 1 from "+x+" to "+y);
			toh(n-1,"x","z","y");
			System.out.println(n+"move top disk from "+x+" to top of tower "+y);
			toh(n-1,"z","y","x");
		}
	}
	
	
	
	public static boolean isPalindrome(String str){
	    int n = str.length();
	    for(int i=0;i<n/2;i++){
	        if(str.charAt(i)!=str.charAt(n-i-1)) return false;
	    }
	    return true;
	}
 
}
