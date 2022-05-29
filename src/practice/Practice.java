package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class Practice {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of test cases");
		int tc = Integer.parseInt(bf.readLine());
		System.out.println(tc);
		while(tc-->0){
			int k = (int)bf.read();
			System.out.println(k);
			int n = (int)bf.read();
			System.out.println(n);
		    int count=0;
		    String lang = bf.readLine();
		    System.out.println(k);
		    System.out.println(n);
		    System.out.println(lang);
//		    for (int i = 0;i<n ;i++ ){
//		        if (lang.charAt(i)=='*'){
//		            int c = i;
//		            while(lang.charAt(c)=='*'&&c!=n){
//		                count++;
//		                c++;
//		            }
//		            if(count==k)
//		                System.out.println("YES");
//		            else 
//		                System.out.println("NO");
//		        }
//		        else
//		            System.out.println("NO");
//		    } 
		}
	}
		
	
	
	
	

}
