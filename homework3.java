// 2019.8.2 史明昊
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
public class homework3{
	public static void main(String[] args){
		//正方形
		/*int z = 11;
        String[][] arr = new String[z][z];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i > 0 & i < z - 1) && (j > 0 & j < z - 1)) {
                    arr[i][j] = "  ";
                    } else {
                         arr[i][j] = "史";
						 }
        System.out.print(arr[i][j]);
		}
        System.out.println();
		}*/
                // 打印*号形状
        /*int z= 11;
	    String[] [] array = new String[z] [z];
		for(int i = 0; i < array.length; i++){
			for (int j = 0; j < array.length; j++){
				if((i > 0 & i < z-1) && (j>0&j<z-1)){
					array[i][j] = "  ";
				} else {
					array[i][j] = "* ";
				}
			  System.out.print(array[i][j]);	
			}
			 System.out.println();*/
			// 九九乘法表
        /* for(int i=1; i<=9;i++){
		for(int j=1; j<=i;j++){
			System.out.print(i+"*"+j+"="+i*j);
		}
		System.out.println();*/
		    // 房子图案  2019.8.3
		/*System.out.println("    ******");
		System.out.println("   *****  *");
		System.out.println("  *****    *");
		System.out.println(" *****      *");
		System.out.println("*****        *");
		System.out.println("**************");
		System.out.println("*            *");
		System.out.println("*            *");
		System.out.println("*            *");
		System.out.println("**************");*/
		// 合并数组
		/*int[] a = {1,7,9,11,13,15,17,19};
       int[] b = {2,4,6,8,10};
       twoArray(a, b);
		}
		public static int[] twoArray(int[] a, int[] b) {
       int i =0;
       int j = 0;
       int k = 0;
       int aLen = a.length;
       int bLen = b.length;
       int[] arra = new int[aLen + bLen];
       while (i < aLen && j < bLen) {
           if (a[i] < b[j]) {
               arra[k] = a[i];
               i++;
                
           }  else {
               arra[k] = b[j];
               j++;
           }
           k++;   
       }
        
       if (i == aLen) {
           while(j < bLen) {
               arra[k] = b[j];
               k++;
               j++;
           }
       }
        
       if (j == bLen) {
           while(i < aLen) {
               arra[k] = a[i];
               k++;
               i++;
           }
       }
       for(int m = 0; m < arra.length; m++) {
           System.out.print(arra[m] + ",");
       }
        
       return arra;
   }
    */
	// 水仙花
	/*int i =0;
	int j =0;
	int k =0;
	int u = 0;
	for( int m = 100;m<=999;m++){
		i = m/1000;
		j = m/100%10;
		k = m/10%100%10;
		u = m%10;
		if(m==i*i*i+j*j*j+k*k*k+u*u*u){
			System.out.println(m+" ");
		}
		}*/
		// 除去余数为3的所有数的累加值
	/*int sum = 0;
	for (int i = 0;i<=100;i++){
		
		if(i%10 == 3){
			i++;
		}
		sum = sum+i;
        System.out.println(sum);
		}*/
		// 加密数据
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("请输入所传递的数据");
		int x = scanner.nextInt();
		int i =(x/1000+5)%10;
	    int j =(x/100%10+5)%10; 
	    int k =(x/10%100%10+5)%10;
        int	u = (x%10+5)%10;
	    System.out.println(u+""+k+""+j+""+i);*/
	}
	}