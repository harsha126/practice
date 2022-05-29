package practice;

import java.util.*;
import java.util.stream.IntStream;
import java.lang.*;
import java.io.*;

class sortnum implements Comparator<Integer>{
	
	public int compare(Integer a , Integer b) {
		if(a==b) return 0;
		if(a>b) return 1;
		else return -1;
	}
}

public class leetcode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		int len = arr.length;
//		for(int i=1;i<len;i++) System.out.print((arr[i]-arr[i-1])+",");
		int[] array = IntStream.range(1, n + 1).toArray();
		for(int i=1;i<=n;i++) if(isPrime(i)) System.out.print(i+",");
	}
	
	public static void swap(int[] arr , int i,int j){
	    int temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}
	
	public static boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) if(n%i==0) return false;
		return true;
	}
}
