/*
 * checks if a array is a subset of anotehr arr or not?
 * b is sunset of a or not ?
 * 
 */

import java.util.*;
public class isArrsubest {
    public static boolean subset(int[] a, int[] b){
        Set<Integer> hashSet = new HashSet<>();
        for(int num :a){
            hashSet.add(num);
        }

        for(int num :b){
            if(!hashSet.contains(num)){
                return false;
            }
        }
        return true; //all nums of b are in a 
    }
    public static void main(String[] args){
        int[] a ={2,4,6,8,9};
        int[] b = {40,9,6};

        if(subset(a,b)){
            System.out.println("true");

        }else{
            System.out.println("false");
        }
    }
}
