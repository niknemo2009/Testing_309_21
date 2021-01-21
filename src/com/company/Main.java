package com.company;

import java.util.Arrays;

public class Main {
	public static void linearSearch(int [] arr,int key){
		for (int i = 0; i < arr.length; i++){
			if(arr[i]==key){
				System.out.println("found number:"+arr[i]+'\n'+"index:"+i);
			}
			else{
				System.out.print("The specified number was not found!!!");
			}
			break;
		}
	}

	public static int binarySearch(int [] arr,int key){
		int low = 0 ;
		int high = arr.length-1;
		int mid;
		while (low<=high){
			mid = low+(high - low) /2;
			if(key < arr[mid]){
				high = mid - 1;
			}else if(key > arr[mid]){
				low = mid + 1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	public static int makeNegative(final int x) {
		if(x>0){
			int y = x ;
			y = y-(x+y);
			return y;
		}
		return x;
	}
	public static void main(String[] args) {
	    int [] arr = {4,3,5,5,6};
		System.out.println(makeNegative( 0));
    }
}
