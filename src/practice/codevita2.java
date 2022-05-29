package practice;
import java.util.*;
import java.lang.*;
import java.io.*;

class sample implements Runnable{
	private Thread t;
	private String name;
	sample(String name){
		this.name = name;
	}
	
	public void run() {
		while(true) {
			System.out.println(name);
		}
	}
	
	public void start() {
		if(t==null) {
			t = new Thread(this,name);
			t.start();
		}
	}
}


public class codevita2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {114, 55, 95, 131, 77, 111, 141};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int num = binsearch(1,arr[arr.length-1],arr,95);
		System.out.println(num+" "+"nummm");
		
	}
	public static int binsearch(int low ,int high,int[] arr,int b) {
		int mid = (low+high)/2;
		int c = 0;
		while(c!=b) {
			mid = (low+high)/2;
			c = check(mid,arr);
			System.out.println("mid="+mid + " c="+c +" low="+low+" high="+high);
			if(c==b) return mid;
			if(c<b) high = mid-1;
			else low = mid+1;
		}
		return -1;
	}
	
	public static int check(int mid,int[] arr) {
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			int temp = arr[i] - mid;
			if(temp>0) sum += temp; 
		}
		return sum;
	}

}
