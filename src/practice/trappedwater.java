package practice;

import java.lang.Math;


public class trappedwater {

	public static void main(String[] args) {
		
		int arr[] = { 8,8,2,4,5,5,1 }, total = 0, maxl = 0, maxr = 0;
		for (int i = 1; i < arr.length - 1; i++) {

			for (int t = 0; t < arr.length; t++) {
				if (t >= 0 && t < i) {
					maxl = Math.max(maxl, arr[t]);
				} else {
					maxr = Math.max(maxr, arr[t]);
				}
			}

//		    for(int u=i+1;u<arr.length;u++) {
//		    	if(maxr<arr[u])
//		    		maxr=arr[u];
//		    }

			int current = Math.min(maxr, maxl);
			if (arr[i] < current)
				total = total + (current - arr[i]);
			System.out
					.println("at " + i + " maxl=" + maxl + " maxr=" + maxr + " current=" + current + " total=" + total);
			maxr = 0;
		}
		System.out.println(total);
		
	}
}
