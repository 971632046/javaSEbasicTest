package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class questionBank {
    public static void main(String[] args) {
    	//  4�κ���ҵ7
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
    	// 4�κ���ҵ8.��һ�������е��ظ�Ԫ�ر���һ�����������㡣��֪ʶ�㣺�������������Ԫ�ط��ʣ�
    	int[] a1 = {1,2,2,2,2};
    	for(int i1=0 ;i1<a.length;i1++) {
    		for(int j=0 ;j<a.length;j++) {
        		if(a1[i1] ==a1[j] &&i1!=j) {
        			a1[j]=0;
        		}
        	}
    	}
    	System.out.println(Arrays.toString(a1));
    	//9������һά����{ -10��2��3��246��-100��0��5} ������������е�ƽ��ֵ�����ֵ����Сֵ����֪ʶ�㣺�������������Ԫ�ط���
    	int[] a2 = {-10,2,3,246,-100,0,5};
    	method.getMax(a2);
    	method.getMin(a2);
    	method.getAverage(a2);
    	//��дһ��������������n�Ľ׳ˣ�����5�Ľ׳���1x2x3x45
    	Scanner scanner = new Scanner(System.in);
        System.out.print("����nΪ");
        int a3 = scanner.nextInt();
        method.getFac(a3);
        // ��дһ���������жϸ������ƽ�껹�����ꡣ
        System.out.print("�����Ϊ");
        int a4 = scanner.nextInt();
        method.getYear(a4);
        // ��дһ���������������200����С������
        System.out.println("Please input a number<long>:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        method.findNumber(num);
        in.close();
        //дһ�����������ܣ�����һ��һά��int ���飬��������,Ȼ�����ǰ���С�����˳�������ʹ��ð�����򣩣�֪ʶ�㣺�����Ķ���ͷ��ʣ�
        int[] arr1 = {1,4,5,6,2};
    	arr1 =  method.arrays(arr1);
    	System.out.println(Arrays.toString(arr1));
        
    }
    	
}
