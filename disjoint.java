/*
checks if both arr 1 and arr2 are disjoint 
no common element in both
 */

 import java.util.*;
 public class disjoint {
     public static boolean subset(int[] a, int[] b){
         Set<Integer> hashSet = new HashSet<>();
         for(int num :a){
             hashSet.add(num);
         }
 
         for(int num :b){
             if(hashSet.contains(num)){
                 return false;
             }
         }
         return true; 
     }
     public static void main(String[] args){
         int[] a ={2,4,6,8,9};
         int[] b = {40,19,66};
 
         if(subset(a,b)){
             System.out.println("true");
 
         }else{
             System.out.println("false");
         }
     }
 }
