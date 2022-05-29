package practice;

import java.io.BufferedReader;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class strings {

	public static void main(String[] args) throws Exception, IOException {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    String n1=sc.next();
		    String n2=sc.next();
		    String res = "";
		    for(int i=0;i<(n2.length()-n1.length());i++) n1 = "0"+n1;
		    int p = n1.length()-1;
		    int q = n2.length()-1;	
		    while(p>=0&&q>=0){
		        int a = n1.charAt(p)-48;
		        int b = n2.charAt(q)-48;
		        System.out.println("a:"+a+",b:"+b);
		        if(b<a){
		        	b = (n2.charAt(q-1)-48)*10+b;
		            System.out.println("a:"+a+",b:"+b);
		            res=(""+(b-a))+res;
		            p--;
		            q-=2;
		        }
		        else{
		            res=(""+(b-a))+res;
		            p--;
		            q--;;
		        }
		        System.out.println("p:"+p+",q:"+q);
		    }
//		    res.replaceFirst("^0+(?!$)", "");
		    if(p==q) System.out.println("               "+(-1));
		    else System.out.println("               "+res);
		}
		
	}

	public static void test(long n) {
		int i=0,j=-1;
//		for(int k=1;k<=n;k++) {
//			if(i==j+1) {
//				i++;
//				j=0;
//			}
//			else {
//				j++;
//			}
//			System.out.println(i+" "+j+" "+k);
//		}
		double k=1;
		int count=0;
		while(n/k>=0) {
			count++;
			n-=k;
			k++;
		}
		System.out.print((long)(Math.pow(2,count)%1000000007+Math.pow(2,n+count-1)%1000000007)+",");
	}
	
	
	public static void ru(double n) {
		double k=1;
		int count=0;
		while(n/k>=0) {
			count++;
			n-=k;
			k++;
		}
		System.out.println(count+" "+(n+count-1));
	}
	
	
}
