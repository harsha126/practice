package practice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TrieTest {

	static final int size = 26;
	
	static class TrieNode{
		
		boolean isEndOfWord;
		TrieNode[] children = new TrieNode[size];
		
		TrieNode(){
			isEndOfWord = false;
			for(int i=0;i<26;i++) {
				children[i]=null;
			}
		}
		
	};
	
	static TrieNode root;
	
	static void insert(String str) {
		int index = 0;
		TrieNode test = root;
		for(int i=0;i<str.length();i++) {
			index = str.charAt(i)-'a';
			if(test.children[index]==null) {
				test.children[index] = new TrieNode();
			}
			test = test.children[index];
		}
		
		test.isEndOfWord = true;
	}
	
	public static boolean search(String str) {
		int index = 0;
		TrieNode test = root;
		for(int i=0;i<str.length();i++) {
			index = str.charAt(i)-'a';
			if(test.children[index]==null) return false;
			test = test.children[index];
		}
		return test.isEndOfWord;
	}
	
	public static boolean searchDot(TrieNode root,String str,int index) {
		if(root==null) return false;
//		System.out.println(index);
		if (index == str.length()){
			 return root.isEndOfWord;

		}
		char ch = str.charAt(index);
		if(ch =='.') {
			for(int i = 0;i<26;i++) {
				if(searchDot(root.children[i],str,index+1)) return true;
			}
		}
		else if (root.children[ch-'a']!=null) return searchDot(root.children[ch-'a'],str,index+1);
		return false;
		
	}
	
	public static void printlong(TrieNode root, String str) {
		boolean there = true;
		TrieNode tes = root;
		int index = 0;
		int i;
		for(i = 0;i<str.length();i++) {
			index = str.charAt(i)-'a';
			if(tes.children[index]!=null) {
				there = true;
				tes = tes.children[index];
			}
			else {
				there = false;
				break;
			}
		}
		if(!there) return;
		there = false;
		for(i=0;i<26;i++) {
			if(tes.children[i]!=null) there = true;
		}
		if(!there) return;
		for(int  j = 0;j<26;j++) {
//			System.out.print(j+" ");
			if(tes.children[j]!=null) trace(tes.children[j],str+""+(char)('a'+j));
		}
	}
	
	public static void printlong2(TrieNode root, String str) {
		boolean there = true;
		TrieNode tes = root;
		int index = 0;
		int i;
		for(i = 0;i<str.length();i++) {
			if(str.charAt(i)=='.') {
				if(tes.children[i]!=null) trace(tes.children[i],str+""+(char)('a'+i));
				
			}
			index = str.charAt(i)-'a';
			if(tes.children[index]!=null) {
				there = true;
				tes = tes.children[index];
			}
			else {
				there = false;
				break;
			}
		}
		if(!there) return;
		there = false;
		for(i=0;i<26;i++) {
			if(tes.children[i]!=null) there = true;
		}
		if(!there) return;
		for(int  j = 0;j<26;j++) {
//			System.out.print(j+" ");
			if(tes.children[j]!=null) trace(tes.children[j],str+""+(char)('a'+j));
		}
	}
	
	public static void trace(TrieNode root,String str) {
		boolean there = false;
		for(int i=0;i<26;i++) {
			if(root.children[i]!=null) {trace(root.children[i],str+""+(char)('a'+i)); there = true;}
			
		}
		if(!there) System.out.println(str);
		return;
	}
	
	
	public static void main(String[] args) throws Exception{
//		String[] strarr = {"there","are","some","strings"};
		root = new TrieNode();
//		for(int i=0;i<strarr.length;i++) {
//			insert(strarr[i]);
//		}
		
		File file = new File("C:\\Users\\DELL\\Desktop\\fiveletterwords.txt");
		Scanner scfile = new Scanner(file);
		int count = 0;
		while(scfile.hasNextLine()) {
			insert(scfile.nextLine().toLowerCase());
			count++;
		}
		
		System.out.println(count);
		System.out.println(searchDot(root,"fi.es",0));
		printlong(root,"fix");
		
		
	}

}














