package com.company;

import java.util.HashMap;

/*
 Our aim for this project is to recognise whether there are two intergers in an array where the sum is equal to the target sum and print their
 indices. For example in an array arr = [3,7,4,12,34] the program prints 0 and 2 which are indices of 3 and 4 whose sum is 7;
 */


public class ArraySumIndex {

    public static void main(String[] args){
        int[] array = new int[]{3,7,4,12,34};
        indexSumFinding(array,7);
    }


    public static void indexSumFinding(int[] array, int sum){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(sum-array[i])){
                System.out.println("The indecies are: "+map.get(sum-array[i])+" and "+i);
                return;
            }
            else{
                map.put(array[i],i);
            }
        }
        System.out.println("No such numbers exist!");
    }
}
