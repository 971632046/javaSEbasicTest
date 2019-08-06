package com.smh;

import java.util.Arrays;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		int[] arrs = new int[1500];
		Random r = new Random();
		for (int i=0;i<arrs.length;i++) {
			arrs[i] = r.nextInt();
		}
		int[] a = Arrays.copyOf(arrs, arrs.length);
		int[] b = Arrays.copyOf(arrs, arrs.length);
		long start = System.currentTimeMillis();
		Arrays.sort(a);
		long end = System.currentTimeMillis();
		System.out.println("系统API所花时间"+(end-start));
		
		long start2 = System.currentTimeMillis();
		chooseSort(b);
		long end2 = System.currentTimeMillis();
		System.out.println("选择排序所化时间"+(end2-start2));
	}
	public static int[] chooseSort(int[] arrays){
		for(int i=0;i<arrays.length-1;i++){
			for (int j=i+1;j<arrays.length;j++){
				if(arrays[i]>arrays[j]){
					int temp = arrays[i];
					arrays[i] = arrays[j];
					arrays[j] = temp;
				}
			}
		}
		return arrays;
	}
}
