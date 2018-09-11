package com.company;

import java.util.Scanner;

public class QuickSort {
    int[] array;

    QuickSort(int length){
        array = new int[length];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<length;i++){
            array[i] = input.nextInt();
        }
    }

    public static void main(String[] args){

        QuickSort arrayofnumbers = new QuickSort(12);
        arrayofnumbers.QuickSort(0,arrayofnumbers.array.length-1);
        arrayofnumbers.printarray(12);


    }

    public void QuickSort(int start, int end){

        if(start<end){
            int pi = partition(start,end);
            this.QuickSort(start,pi-1);
            this.QuickSort(pi+1,end);
        }

    }

    public int partition(int start, int end){

        int pivot = array[end];
        int i = start;
        for(int j=start;j<end;j++){
            if(array[j]<=pivot){
                int temp=array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        int temp = array[i];
        array[i]=array[end];
        array[end] = temp;
        return i;
    }

    public void printarray(int length){
        for(int i=0;i<length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
