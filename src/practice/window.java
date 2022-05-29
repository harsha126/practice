package practice;

import java.util.*;
import java.lang.*;
import java.io.*;


public class window {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		HashMap<int[] , Integer > map = new HashMap<int[] , Integer>();
		int[][] arr = {{3,3},{5,-1},{-2,4}};
		int k = 2;
		for(int i=0;i<3;i++) { map.put(arr[i],(int)(Math.pow(arr[i][0],2)+Math.pow(arr[i][1],2)));
		
		}

		map.forEach((key,value)->System.out.println(Arrays.toString(key)+" "+value));
		LinkedList<Map.Entry<int[],Integer>> list = new LinkedList<Map.Entry<int[],Integer>>(map.entrySet());
		Collections.sort(list,(i1,i2) -> i1.getValue().compareTo(i2.getValue()));
		HashMap<int[],Integer> map1 = new LinkedHashMap<int[],Integer>();

        list.forEach(s->map1.put(s.getKey(),s.getValue()));
        map1.forEach((key,value)->System.out.println(Arrays.toString(key)+" "+value));
        int[][] res = new int[k][2];
        int h = 0;
        for(int[] ping : map1.keySet() ){
            if(h==k) break;
            res[h]=ping;
            h++;
        }	
//        for(int i=0;i<k;i++) {
//        	System.out.println(Arrays.toString(res[i]));
//        }
					
	}
				
}
		
