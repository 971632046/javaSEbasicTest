import java.util.Scanner;
import java.util.Arrays;
public class QusetionBank{
	public static void main(String[] args){
		/*// �κ���ҵ1
		int a =0;
		int b = 1;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+" "+b);
		
	    // �κ���ҵ2
		System.out.println("��������Ҫ�����ֵ");*/
	    Scanner scanner = new Scanner(System.in);
        /*int x = scanner.nextInt();
        int y = x%10+x/10%10+x/100;
        System.out.println(y);
		// 3.1
        System.out.println("��������Ҫ�����ֵ");
        int z = scanner.nextInt();
        if(z%2==0){
		    System.out.println("�������ֵ��ż��");
	    }	
	    System.out.println("���������ֵ��"+z);
		// 3.2
		System.out.println("������i��ֵ");
        int i = scanner.nextInt();
		System.out.println("������j��ֵ");
		int j = scanner.nextInt();
		if(i>j){
			System.out.println(i);
		}else
			System.out.println(j);
	    // 3.3.1
		int sum = 0;
		int c=0;
	    while(c<=100){
			sum += c;	
			c++;
		}
		System.out.println(sum);
		// 3.3.2
		int sum1 = 0;
		int c1=1;
	    while(c1<=100 ){
				sum1 += c1;	
			    c1++;
				c1++;
		}
		System.out.println(sum1);
        // 3�κ���ҵ
		System.out.println("����������");
		double Sal =scanner.nextDouble();
		double bonus  = 0;
		if(Sal<=100000 && Sal>0){
			bonus = Sal*10/100;
		}
		else if(Sal>100000 &&Sal<=200000){
			bonus = 100000*10/100+ (Sal-100000)*75/1000 ;
		}
		else if(Sal>200000 && Sal<=400000){
		    bonus = 100000*10/100+100000*75/1000+(Sal-200000)*5/100;	
		}
		else if(Sal>400000 && Sal<=600000){
			bonus = 100000*10/100+100000*75/1000+200000*5/100+(Sal-400000)*3/100;
		}
		else if(Sal>600000 && Sal<=1000000){
			bonus = 100000*10/100+100000*75/1000+200000*5/100+200000*3/100+(Sal-600000)*15/1000;
		}
		else if(Sal>1000000){
			bonus = 100000*10/100+100000*75/1000+200000*5/100+200000*3/100+400000*15/1000+(Sal-1000000)*1/100;
		}
		System.out.println("���Ľ���Ϊ"+bonus);
	    // 3�κ���ҵ2
		System.out.println("������ɼ�");
		int score =scanner.nextInt();
		switch (score/10){
			case 10:
			case 9:
			System.out.println("���ĳɼ���A");
			break;
			case 8:
			System.out.println("���ĳɼ���B");
			break;
			case 7:
			System.out.println("���ĳɼ���C");
			break;
			case 6:
			System.out.println("���ĳɼ���D");
			break;
			default:
			System.out.println("���ĳɼ���E");
			break;
		}
		// 3�κ���ҵ3
		double Salary = 30000;
		double Salary1= 0;
		for (int a1=0;a1<=10;a1++){
			Salary = Salary+Salary*6/100;
			Salary1 = Salary+Salary1;
		}
	    System.out.println("��ʮ����нˮ�ܶ�Ϊ"+Salary1);
		System.out.println("������Ĺ���Ϊ"+Salary);
		// 3�κ���ҵ4
		int peach =1;
		for(int a2=0;a2<=10;a2++){
			peach = (peach+1)*2;
		}
		System.out.println("��һ�칲ժ��"+peach);
	    // 3�κ���ҵ5
		System.out.println("����������Ҫ�������");
		int num = scanner.nextInt();
		if(num%2==0){
			System.out.println("�����������ż��");
		}
		else{
			System.out.println("���������������");
		}
		// 3�κ���ҵ6
		System.out.println("����������Ҫ�������");
		int num1 = scanner.nextInt();
		if(num1 == 1){
			System.out.println("num1="+num1);
		}else if(num1 == 5){
			System.out.println("num1="+num1);
		}else if(num1 == 10){
			System.out.println("num1="+num1);
	    }else{
			System.out.println("num1=none");
		}
	    // 3�κ���ҵ7
		System.out.println("����������Ҫ�������");
	    int num3 = scanner.nextInt();
	    if(num3%5==0 && num3%6!=0){
			System.out.println("ֻ�ܱ�5����");	
		}else if(num3%6==0 && num3%5!=0){
			System.out.println("ֻ�ܱ�6����");
		}else if(num3%6==0 && num3%5==0){
			System.out.println("�ܱ�5��6����");
		}else{
			System.out.println("���ܱ�5��6����");
		}
		// 3�κ���ҵ8
		System.out.println("����������Ҫ���������");
		int year = scanner.nextInt();
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
		// 3�κ���ҵ9
		System.out.println("������ɼ�");
		int score1 =scanner.nextInt();
	    if(score1<=100 && score1>=90 ){
			System.out.println("�ɼ�ΪA");
		}else if(score1<90 && score1>=80 ){
			System.out.println("�ɼ�ΪB");
		}else if(score1<80 && score1>=70 ){
			System.out.println("�ɼ�ΪC");
		}else if(score1<70 && score1>=60 ){
			System.out.println("�ɼ�ΪD");
		}else if(score1<60 && score1>=0){
			System.out.println("�ɼ�ΪE");
		}else {
			System.out.println("�ɼ���Ч");
		}
	    // 3�κ���ҵ10
		System.out.println("����������Ҫ����ĵ�һ����");
		int s1 = scanner.nextInt();
		System.out.println("����������Ҫ����ĵڶ�����");
		int s2 = scanner.nextInt();
		System.out.println("����������Ҫ����ĵ�������");
		int s3 = scanner.nextInt();
	    if(s1<s2){
			if(s1<s3){
			    if(s2<s3){
					System.out.println(s1+"<"+s2+"<"+s3);
				}else{
				System.out.println(s1+"<"+s3+"<"+s2);
			}
			}else{
			System.out.println(s3+"<"+s1+"<"+s2);
			}
		}else{
			 if(s2<s3){
				 if(s1<s3){
					System.out.println(s2+"<"+s1+"<"+s3); 
				 }else{
				System.out.println(s2+"<"+s3+"<"+s1);
			}
				}else{
					System.out.println(s3+"<"+s2+"<"+s1);
				}
		}
		//3�κ���ҵ11
		System.out.println("����������Ҫ�������");
		int s4 = scanner.nextInt();
		if(s4/10000>=1){
			System.out.println("���������λ��"); 
			System.out.println("���������λ��Ϊ"+(s4/10000)); 
			System.out.println("�������ǧλ��Ϊ"+(s4/1000%10)); 
			System.out.println("������İ�λ��Ϊ"+(s4/100%10)); 
			System.out.println("�������ʮλ��Ϊ"+(s4/10%10)); 
			System.out.println("������ĸ�λ��Ϊ"+(s4%10)); 
		}else if(s4/1000>=1 && s4/1000<=9){
			System.out.println("���������λ��"); 
			System.out.println("�������ǧλ��Ϊ"+(s4/1000)); 
			System.out.println("������İ�λ��Ϊ"+(s4/100%10)); 
			System.out.println("�������ʮλ��Ϊ"+(s4/10%10)); 
			System.out.println("������ĸ�λ��Ϊ"+(s4%10)); 
		}else if(s4/100==1 && s4/10<=9){
			System.out.println("���������λ��"); 
			System.out.println("������İ�λ��Ϊ"+(s4/100)); 
			System.out.println("�������ʮλ��Ϊ"+(s4/10%10)); 
			System.out.println("������ĸ�λ��Ϊ"+(s4%10)); 
		}else if(s4/10==1 && s4/10<=9){
			System.out.println("������Ƕ�λ��"); 
			System.out.println("�������ʮλ��Ϊ"+(s4/10)); 
			System.out.println("������ĸ�λ��Ϊ"+(s4%10)); 
		}else if(s4/1==1 && s4/1<=9){
			System.out.println("�������һλ��"); 
			System.out.println("�����Ϊ"+s4); 
		}
		//3�κ���ҵ12
		System.out.println("����������Ҫ����Ļ����");
		double s5 = scanner.nextDouble();
		if(s5<100 &&s5>0){
			System.out.println("���Ϊ1Ԫ");
		}else if(s5>=100 && s5<=5000){
			System.out.println("���Ϊ"+(s5/100)+"Ԫ");
		}else if(s5>5000){
			System.out.println("���Ϊ50Ԫ");
		}
		// 3 �κ���ҵ13
		for(int o=0;o<=100;o++){
			if(o%3==0){
				System.out.print(o+"  ");
			}
		}
		int o1=0;
		while(o1<=99 ){
			if(o1%3==0){
				System.out.print(o1+"  ");
			}
			
			o1++;
		}
		int o2=0;
		do{
			if(o2%3==0){
				System.out.print(o2+"  ");
			}
			o2++;
		}while(o2<99);
		
		// 3�κ���ҵ14
		int a4 =0;
		if(a4<10){
			
			if(a4!=5){
				System.out.print(a4+"  ");
				a4++;
			}
		}
		// 3�κ���ҵ15
		System.out.println("����������Ҫ�������");
		int a5 = scanner.nextInt();
        int a6 =1;
		int a7 =1;
		if(a6<=a5){
			a7 = a7*a6;
			a6++;
		}
		System.out.println("�׳�Ϊ"+a7);*/
		// 3�κ���ҵ16
		int n=201,i;
        outer:
        for(;;n++){
            for(i=2;i*i<=n;i++) if(n%i==0)continue outer;
            break;
        }
        System.out.println(n);
		// 3�κ���ҵ17
		System.out.println("����������Ҫ�������");
		int a8 = scanner.nextInt();
		int i1 =a8/1000;
	    int j1 =a8%1000/100; 
	    int k1 =a8%100/10;
        int	u1= a8%10;
		System.out.println(u1+""+k1+""+j1+""+i1);
		// 4�κ���ҵ1
		int[] num4 = {10,20,30,40,50};
		System.out.println(Arrays.toString(num4));
		// 4�κ���ҵ2
		char[] nuedu = {'n','e','u','s','o','f','t','e','d','u','c','a','t','i','o','n'};
	    char[] nuedu1 = Arrays.copyOf(nuedu,nuedu.length);
		System.out.println(Arrays.toString(nuedu1));
		// 4�κ���ҵ3
		int[] num5 = {1,6,3,2,4,5,7,8};
	    Arrays.sort(num5);
		/*for (int element : num5){
			System.out.print(element+" ");
		}*/
		for (int i2 = 0; i2 < num5.length; i2++){
			for(int j2=0; j2 < num5.length-i2-1; j2++){
				if(num5[j2]>num5[j2+1]){
					int temp = num5[j2];
					num5[j2]  =num5[j2+1];
					num5[j2+1] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(num5));
		
		
		// 4�κ���ҵ4
		int[][] arr1;
		arr1 = new int [][]{{2,3,4},{4,6,8}};
		int[][] arr2;
		arr2 = new int[][]{{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
		int i4 =0;
		int j = 0;
		int k = 0;
		int sum = 0;
		for(i4=-0; i<arr1.length;i++){
			for (j =0;j<arr2[0].length;j++){
				for (k =0;k<arr2[0].length;k++){
					sum = sum +arr1[i][k]*arr2[k][j];
			}
		}
		}
		// 4�κ���ҵ5
		double[][] arr3;
        arr3 = new double[5][4];
        for(int i5 =0;i<arr1.length;i5++){
            for(int j3 = 0;j3<arr1[i].length;j3++){
                arr1[i5][j3] = (int)(Math.random()*10);//�����������Ԫ��
                System.out.print(arr1[i5][j3]+" ");
            }
            System.out.println("\n");
        }
		// 4�κ���ҵ6
		int[] a = {18,25,7,36,13,2,89,63}; 
		int max = a[0]; 
		int maxIndex = 0;
		for(int i3=1;i3<a.length;i3++){
				if(max<=a[i3]){
					max = a[i3]; 
					maxIndex = i3;
					}
		}
		System.out.println("���ֵΪ��"+max+"���ֵ�±�Ϊ��"+maxIndex);
		// 4�κ���ҵ7
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}