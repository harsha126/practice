package practice;
import java.lang.*;
import java.util.*;
import java.io.*;

public class sumofsubsets {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		File file = new File("c:/users/dell/desktop/fiveletterwords.txt");
		Scanner scfile = new Scanner(file);
		int[] arr = {2,3,6,4,8,64,3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int[] visited = new int[7];
		boolean there = solve(arr,visited,7,92);
		System.out.println(there);
	}
	
	public static boolean solve(int[] arr,int[] visited ,int n,int k) {
//		System.out.println(Arrays.toString(visited));
		if(sum(arr,visited) == k) return true;
		for(int i=0;i<n;i++) {
			if(visited[i]!=1) {
				visited[i]=1;
				if(sum(arr,visited)<=k) {
					if(solve(arr,visited,n,k)) return true;
				}
				visited[i]=0;
			}
		}
		return false;
	}
	
	public static  int sum(int[] arr,int[] visited) {
		int h = 0;
		for(int i=0;i<arr.length;i++) if(visited[i]==1) h+=arr[i];
		return h;
	}

}
