package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;


/*
 This file of rearrange.java eases the array which means when array[i]=k and array[l]=k, where i<l and array[k]=0 where k is between i and l
 we double array[i] and make array[l] to zero. We push all the zeros in the array to the end.
 */
public class rearrange {

        public static void main (String[] args) {
            //code
            Scanner input = new Scanner(System.in);
            int cases = input.nextInt();
            while(cases>0){
                int length = input.nextInt();
                int[] array = new int[length];
                for(int i=0;i<length;i++){
                    array[i] = input.nextInt();
                }
                easythearray(array,length);
                print(array,length);
                cases--;
            }
        }
    public static void easythearray(int[] array,int length){
        boolean verify=false;int hook=-1; boolean invalidpass=true;
        for(int i=0;i<length;i++){
            if(invalidpass && array[i]!=0){
                verify = true;
                hook = i;
                invalidpass = false;
            }
            else if(verify && array[i]!=0){
                if(array[hook]==array[i] && hook+1==i){
                    array[hook]=array[hook]*2;
                    array[i]=0;
                    verify=false;
                    invalidpass = true;
                }
                else{
                    hook = i;
                }
            }
        }
    }

    public static void pushover(int[] array, int length){
        int hook = 0;
        for(int i=0;i<length;i++){
            if(array[i]!=0){
                array[hook]=array[i];
                hook++;
            }
        }
        for(int i=hook;i<length;i++){
            array[i]=0;
        }

    }
        public static void print(int[] array, int length){
            for(int i=0;i<length;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
}
