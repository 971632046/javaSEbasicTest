// 2019.8.3 ʷ���
import java.util.Arrays;
import javax.swing.*;
import java.util.Scanner;
public class homework33{
	// ͳ���ַ������ֵ�λ��
	public static void main(String[] args){
    String str = "ͳ��һ���ַ����ַ����е�����λ��";
	int[] arrays = countALL(str, '��');
	System.out.println(Arrays.toString(arrays));
	}
	public static int[] countALL(String str, char ch){
		int ary[] = {};
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			if(c == ch){
				ary = Arrays.copyOf(ary, ary.length+1);
				ary[ary.length-1] = i;
				
			}
		}return ary;
	}
	// ͳ��һ���ַ����ַ������е�����λ��
	char[] chs = {'ͳ','��','һ','��','��','��','��','��','��','��','��'};
	for( int i = 0;i< chs.length; i++){
		if (chs[i] == '��'){
			System.out.println("�ַ����ַ������е�λ��Ϊ"+i);
		}
	}
	// ��ϰ3��
	String str = "123456789012";
	int oldNum = 0;
	int evenNum = 0;
	for( int i =0;i<str.length();i++){
		if(i%2 == 0){
			oldNum += str.charAt(i)-'0';
	}else{
		evenNum += str.charAt(i)-'0';
	}
	
	}
	System.out.println("�����ͣ�"+oldNum);
	System.out.println("ż���ͣ�"+evenNum);
	
	
	
	
	// ��ϰ4��
	int num = 56123;
	int newNum = 0;
	while (num>0){
		newNum = newNum *10 +num %10;
		num = num / 10;
	}
	System.out.println(newNum);
	}
	
	// 20190804  
	// �׳�
    int a=10;
    long sum=1;
    for(int i=1;i<=a;i++){
   	    sum=sum*i;
   }
   System.out.println(+a+"!="+sum);
   
   // ����
	for(int i=1;i<1000;i++){
    int sum=0;
    for(int j=1;j<i/2+1;j++){
        if(i%j==0){
             sum+=j;
        if(sum==i){
            System.out.print(i+" ");
	}
}
	}
	}
	// С�򷴵�
	    double total_m = 0;
		double h = 100;
		for (int i = 1; i < 100; i++) {
			total_m += h*2;
			h = h/2;
			if(i == 10){
				System.out.println(total_m - 100);
				System.out.println(h);
			}
		}
		
		
		// �������
		 int[][] a = new int[10][10];
         for(int i=0;i<10;i++){
             for(int j=0;j<=i;j++){
                  if(j==0||i==j){
                      a[i][j]=1;
                    }else{
                           a[i][j]=a[i-1][j-1]+a[i-1][j];
                        }
                    }
                }
         for(int i=0;i<10;i++){
              for(int k=0;k<2*(10-i)-1;k++){
                  System.out.print(" ");
                }
                for(int j=0;j<=i;j++){
                    System.out.print(a[i][j]+"   ");
                }
                 System.out.println();
}
        // ������
		 for (int i = 1; i <= 33; i++) {
         for (int j = 1; j <= 20; j++) {
         int k = 100 - i - j;// С��
         if (3 * i + 5 * j + k / 3 == 100 && k % 3 == 0) {
     System.out.println("�ټ���Ǯ����: ����" + i + "ĸ��" + j + "С��" + k);
    }
   }
  }
     //  ����
	System.out.println("��һ�������ӵĶ���: 1");
    System.out.println("��һ�������ӵĶ���: 1");
    int f1=1,f2=2,f,m=24;
    for(int i=3;i<=m;i++){
    f=f2;
    f2=f1+f2;
    f1=f;
    System.out.println("��"+i+"���µ����Ӷ�����"+f2);

     // ��3�˳�
	  Scanner s = new Scanner(System.in);
        System.out.print("�������ų�һȦ��������");
        int n = s.nextInt();
        boolean[] arr = new boolean[n];
 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        } 
 
        int leftCount = n;
        int countNum = 0;
        int index = 0;
        while (leftCount > 1) {
            if (arr[index] == true) {
                countNum++;
                if (countNum == 3) {
                    countNum = 0;
                    arr[index] = false;
                    leftCount--;
                }
            }
            index++;
            if (index == n) {
                index = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == true) {
                System.out.println("ԭ���ڵ�" + (i + 1) + "λ���������ˡ�");
            }
        }
}
		
}	
	
