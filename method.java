package exercise;

import java.util.Scanner;

public class method {
    public static int getAverage(int[] arr) {
    	int avg = 0;
    	int sum = 0;
    	for(int i=0;i<arr.length;i++) {
    		sum = sum + arr[i];
    		
    	}
    	avg = sum/arr.length;
    	System.out.println("ƽ��ֵΪ"+avg);
    	return avg;
    }
    public static int getMax(int[] arr) {
    	int max = arr[0];
    	for(int i=0;i<arr.length;i++) {
    		if(max<arr[i]) {
    			max = arr[i];
    		}
    	}
    	System.out.println("���ֵΪ"+max);
    	return max;
    	
    }
    public static int getMin(int[] arr) {
    	int min = arr[0];
    	for(int i=0;i<arr.length;i++) {
    		if(min>arr[i]) {
    			min = arr[i];
    		}
    	}
    	System.out.println("���ֵΪ"+min);
    	return min;
    	
    }
    public static long getFac(int x) {
    	long result = 1;
    	for(int i =1;i<=x;i++) {
    		result=result*i;
    	}
    	System.out.print(result);
    	return result;
    }
    public static long getYear(int year) {
    	if(year%100==0){
			if(year%400==0){
				System.out.println("�����������������");
			}else{
				System.out.println("�������������������");
			}
		}else if(year%4==0){
			System.out.println("�����������������");
		}else{
			System.out.println("�������������������");
		}
    	return 0;
    }
    // ��дһ���������������200����С������
public static boolean isPrime(int num) {
        
        if(num > 2 && (num & 1) ==0) {
            return false;
        }
        
        for(int i = 3; i * i <= num; i += 2) { 
            if(num % i ==0 ) {
                return false;
            }
        }
        return true;
    }
    public static void findNumber(int number) {
        System.out.print("���� " + number + " ����С������Ϊ��");
        while (!isPrime(number)) {
            number ++;
        }
        System.out.println(number);
    } 
    
    public static void main(String[] args) {
        System.out.println("Please input a number<long>:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        findNumber(num);
        in.close();
    }
    //ð������
    public static int[] arrays(int[] arr){
		for (int i = 0; i < arr.length; i++){
			for(int j=0; j < arr.length-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]  =arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
    
}
    
