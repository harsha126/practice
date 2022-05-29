package practice;
import java.util.*;
import java.lang.*;
import java.io.*;

public class codevita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[3][3];
		for(int i =0;i<3;i++) {
			String s = sc.next();
			for(int j=0;j<3;j++) {
				char ch = s.charAt(j);
				if(ch=='X') mat[i][j]=1;
				else if(ch=='O') mat[i][j]=0;
				else mat[i][j] = -1;
			}
			
		}
		
//		for(int i=0;i<3;i++) {
//			for(int j =0;j<3;j++) {
//				System.out.print(mat[i][j]);
//			}
//			System.out.println();
//		}

		boolean xwin = false;
		boolean owin = false;
		int countx = 0;
		int county = 0;
		for(int i = 0 ; i<3;i++) {
			for(int j = 0;j<3;j++) {
				if(mat[i][j]==1) countx++;
				else if(mat[i][j]==0) county++;
			}
			if(countx==3) xwin = true;
			if(county==3) owin = true;
			countx = 0;
			county = 0;
		}
		
		countx = 0;
		county = 0;
		for(int i = 0 ; i<3;i++) {
			for(int j = 0;j<3;j++) {
				if(mat[j][i]==1) countx++;
				else if(mat[j][i]==0) county++;
			}
			if(countx==3) xwin = true;
			if(county==3) owin = true;
			countx = 0;
			county = 0;
			
		}
		countx = 0;
		county = 0;
		for(int i = 0 ; i<3;i++) {
			if(mat[i][i]==1) countx++;
			else if(mat[i][i]==0) county++;
		}
		if(countx==3) xwin = true;
		if(county==3) owin = true;
		countx = 0;
		county = 0;
		for(int i = 0 ; i<3;i++) {
			if(mat[i][3-i-1]==1) countx++;
			else if(mat[i][3-i-1]==0) county++;
		}
		if(countx==3) xwin = true;
		if(county==3) owin = true;
		if(xwin&&owin) System.out.println("NO");
		else if(xwin||owin) System.out.println("YES");
		else System.out.println("NO");
	}
}
