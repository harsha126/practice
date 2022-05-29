package practice;

import java.util.*;
import java.io.*;
import java.lang.*;

public class nqueens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] board = new char[20][20];
		System.out.println("Enter the no of queens : ");
		int n = sc.nextInt();
		fillboard(board,n);
		printBoard(board,n);
		boolean done = solve(board,n);
		System.out.println();
		printBoard(board,n);
		System.out.println(done);
	}
	
	public static void printBoard(char board[][],int n){
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++) System.out.print(board[i][j]+" ");
	        System.out.println();
	    }
	}

	public static void  fillboard(char board[][],int n){
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            board[i][j]='_';
	        }
	    }
	}
	
	public static boolean findqueens(char board[][],int n ) {
		int count = 0;
		for(int i=0;i<n;i++) for(int j=0;j<n;j++) if(board[i][j]=='q') count++;
		if(count==n) return true;
		return false;
	}
	
	public static boolean solve(char board[][],int n){
	    if(findqueens(board,n)) return true;
//	    int count = n;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(isValid(board,i,j,n)){
	                board[i][j]='q';
	                if (solve(board,n)){
	                    return true;
	                }
	                board[i][j]='_';
	            }  
	        }
	    }
	    return false;
	    
	}
	
	public static boolean isValid(char board[][],int x,int y,int n){
	    for(int i=0;i<n;i++) if(board[x][i]=='q') return false;
	    for(int i=0;i<n;i++) if(board[i][y]=='q') return false;
	    int a = x;
	    int b = y;
	    while(a>0&&b>0) if(board[--a][--b]=='q') return false;
	    a = x;
	    b = y;
	    while(a<n-1&&b<n-1) if(board[++a][++b]=='q') return false;
	    a = x;
	    b = y;
	    while(a>0&&b<n) if(board[--a][++b]=='q') return false;
	    a = x;
	    b = y;
	    while(a<n&&b>0) if(board[++a][--b]=='q') return false;
	    return true;
	}
	
}
