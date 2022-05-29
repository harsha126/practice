package practice;

import java.io.*;
import java.util.*;

class node{
    int val,depth,height;
    node left,right;
    node(){
        this.val = -1;
        left = null;
        right = null;
    }
    node(int val){
        this.val = val;
        left = null;
        right = null;
    }
    
}


public class binarytree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            node root = null;
            while(n-->0){
                int x = sc.nextInt();
                root = insert(root,x);
            }
            prettyPrintTree(root);
//            System.out.println(height(root));
        }
    }
    
    public static node insert(node root,int x){
        if(root == null){
            return new node(x);
        }
        if(root.val>x) root.left = insert(root.left,x);
        else root.right = insert(root.right,x);
        return root;
    }
    
    public static int height(node root){
        if(root==null) return -1;
        return max(height(root.left),height(root.right))+1;
    }
    
    public static int max(int a , int b){
        if(a>=b) return a;
        else return b;
    }
    
    public static void prettyPrintTree(node node, String prefix, boolean isLeft) {
        if (node == null) {
            System.out.println("Empty tree");
            return;
        }
    
        if (node.right != null) {
            prettyPrintTree(node.right, prefix + (isLeft ? "│   " : "    "), false);
        }
    
        System.out.println(prefix + (isLeft ? "└── " : "┌── ") + node.val);
    
        if (node.left != null) {
            prettyPrintTree(node.left, prefix + (isLeft ? "    " : "│   "), true);
        }
    }
    
    public static void prettyPrintTree(node node) {
        prettyPrintTree(node,  "", true);
    }
    
}
