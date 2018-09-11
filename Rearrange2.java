package com.company;

/*
In this program, given two arrays of same size, arr[] and index[] reorder elements in arr[] according to given index array

Example: Input: arr[] = {10,11,12}
                index[] = {1,0,2}

         Output arr[] = {11,10,12}
                index[] = {0,1,2}

 */


public class Rearrange2 {

    int[] array;
    int[] index;

    Rearrange2(){
        this.array = new int[]{50,40,70,60,90};
        this.index = new int[]{3,0,4,1,2};
    }

    public static void main(String[] args){

        Rearrange2 problem1 = new Rearrange2();
        problem1.rearrange();
        problem1.print();

    }

    public void rearrange(){
        int length=this.index.length;
        int i=0;
        while(i<length){
            if(index[i]==i){
                i = i+1;
            }
            else{
                int temp = index[index[i]]; int temp1 = array[index[i]];
                index[index[i]] = index[i]; array[index[i]] = array[i];
                index[i] = temp;            array[i] = temp1;
            }
        }
    }

    public void print(){
        int length = this.index.length;

        for(int i=0;i<length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        for(int i=0;i<length;i++){
            System.out.print(index[i]+" ");
        }
        System.out.println();
    }
}
