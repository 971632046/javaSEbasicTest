package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class questionBank {
    public static void main(String[] args) {
    	//  4课后作业7
    	int[] a = { 9, 6, 3, 4, 5 };
    	for (int i = 0; i < a.length/2; i++) {
    	int t;
    	t=a[i];
    	a[i]=a[a.length-1-i];
    	a[a.length-1-i]=t;
    	}
    	for (int i = 0; i < a.length; i++) {
    	System.out.print(a[i]);
    	}
    	System.out.println();
    	// 4课后作业8.将一个数组中的重复元素保留一个其他的清零。（知识点：数组遍历、数组元素访问）
    	int[] a1 = {1,2,2,2,2};
    	for(int i1=0 ;i1<a.length;i1++) {
    		for(int j=0 ;j<a.length;j++) {
        		if(a1[i1] ==a1[j] &&i1!=j) {
        			a1[j]=0;
        		}
        	}
    	}
    	System.out.println(Arrays.toString(a1));
    	//9、给定一维数组{ -10，2，3，246，-100，0，5} ，计算出数组中的平均值、最大值、最小值。（知识点：数组遍历、数组元素访问
    	int[] a2 = {-10,2,3,246,-100,0,5};
    	method.getMax(a2);
    	method.getMin(a2);
    	method.getAverage(a2);
    	//编写一个方法，求整数n的阶乘，例如5的阶乘是1x2x3x45
    	Scanner scanner = new Scanner(System.in);
        System.out.print("整数n为");
        int a3 = scanner.nextInt();
        method.getFac(a3);
        // 编写一个方法，判断该年份是平年还是闰年。
        System.out.print("该年份为");
        int a4 = scanner.nextInt();
        method.getYear(a4);
        // 编写一个方法，输出大于200的最小的质数
        System.out.println("Please input a number<long>:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        method.findNumber(num);
        in.close();
        //写一个方法，功能：定义一个一维的int 数组，长度任意,然后将它们按从小到大的顺序输出（使用冒泡排序）（知识点：方法的定义和访问）
        int[] arr1 = {1,4,5,6,2};
    	arr1 =  method.arrays(arr1);
    	System.out.println(Arrays.toString(arr1));
        
    }
    	
}
