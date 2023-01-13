package com.bridgelabz.workshop1;

public class LargestSmallest {
    public static void main (String[]args){
        int a;
        int arr[] = {55,10,64,90,87,64};
        System.out.println("Array = "+arr.toString());
        int count = arr.length;
        for (int i =0;i<count;i++){
            for (int j = i+1;j<count;j++ ){
                if(arr[i]>arr[j]){
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j]= a;
                }
            }
            System.out.println("Second Smallest:"+arr[1]);
            System.out.println("Second Largest:"+arr[count-2]);
        }
    }
}

