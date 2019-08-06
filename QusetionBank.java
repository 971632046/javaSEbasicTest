import java.util.Scanner;
import java.util.Arrays;
public class QusetionBank{
	public static void main(String[] args){
		/*// 课后作业1
		int a =0;
		int b = 1;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+" "+b);
		
	    // 课后作业2
		System.out.println("请输入你要输入的值");*/
	    Scanner scanner = new Scanner(System.in);
        /*int x = scanner.nextInt();
        int y = x%10+x/10%10+x/100;
        System.out.println(y);
		// 3.1
        System.out.println("请输入你要输入的值");
        int z = scanner.nextInt();
        if(z%2==0){
		    System.out.println("输入的数值是偶数");
	    }	
	    System.out.println("您输入的数值是"+z);
		// 3.2
		System.out.println("请输入i的值");
        int i = scanner.nextInt();
		System.out.println("请输入j的值");
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
        // 3课后作业
		System.out.println("请输入利润");
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
		System.out.println("您的奖金为"+bonus);
	    // 3课后作业2
		System.out.println("请输入成绩");
		int score =scanner.nextInt();
		switch (score/10){
			case 10:
			case 9:
			System.out.println("您的成绩是A");
			break;
			case 8:
			System.out.println("您的成绩是B");
			break;
			case 7:
			System.out.println("您的成绩是C");
			break;
			case 6:
			System.out.println("您的成绩是D");
			break;
			default:
			System.out.println("您的成绩是E");
			break;
		}
		// 3课后作业3
		double Salary = 30000;
		double Salary1= 0;
		for (int a1=0;a1<=10;a1++){
			Salary = Salary+Salary*6/100;
			Salary1 = Salary+Salary1;
		}
	    System.out.println("您十年后的薪水总额为"+Salary1);
		System.out.println("您今年的工资为"+Salary);
		// 3课后作业4
		int peach =1;
		for(int a2=0;a2<=10;a2++){
			peach = (peach+1)*2;
		}
		System.out.println("第一天共摘了"+peach);
	    // 3课后作业5
		System.out.println("请输入你想要输入的数");
		int num = scanner.nextInt();
		if(num%2==0){
			System.out.println("您输入的数是偶数");
		}
		else{
			System.out.println("您输入的数是奇数");
		}
		// 3课后作业6
		System.out.println("请输入你想要输入的数");
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
	    // 3课后作业7
		System.out.println("请输入你想要输入的数");
	    int num3 = scanner.nextInt();
	    if(num3%5==0 && num3%6!=0){
			System.out.println("只能被5整除");	
		}else if(num3%6==0 && num3%5!=0){
			System.out.println("只能被6整除");
		}else if(num3%6==0 && num3%5==0){
			System.out.println("能被5和6整除");
		}else{
			System.out.println("不能被5和6整除");
		}
		// 3课后作业8
		System.out.println("请输入你想要输入的年数");
		int year = scanner.nextInt();
		if(year%100==0){
			if(year%400==0){
				System.out.println("你输入的年数是闰年");
			}else{
				System.out.println("你输入的年数不是闰年");
			}
		}else if(year%4==0){
			System.out.println("你输入的年数是闰年");
		}else{
			System.out.println("你输入的年数不是闰年");
		}
		// 3课后作业9
		System.out.println("请输入成绩");
		int score1 =scanner.nextInt();
	    if(score1<=100 && score1>=90 ){
			System.out.println("成绩为A");
		}else if(score1<90 && score1>=80 ){
			System.out.println("成绩为B");
		}else if(score1<80 && score1>=70 ){
			System.out.println("成绩为C");
		}else if(score1<70 && score1>=60 ){
			System.out.println("成绩为D");
		}else if(score1<60 && score1>=0){
			System.out.println("成绩为E");
		}else {
			System.out.println("成绩无效");
		}
	    // 3课后作业10
		System.out.println("请输入你想要输入的第一个数");
		int s1 = scanner.nextInt();
		System.out.println("请输入你想要输入的第二个数");
		int s2 = scanner.nextInt();
		System.out.println("请输入你想要输入的第三个数");
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
		//3课后作业11
		System.out.println("请输入你想要输入的数");
		int s4 = scanner.nextInt();
		if(s4/10000>=1){
			System.out.println("这个数是五位数"); 
			System.out.println("这个数的万位数为"+(s4/10000)); 
			System.out.println("这个数的千位数为"+(s4/1000%10)); 
			System.out.println("这个数的百位数为"+(s4/100%10)); 
			System.out.println("这个数的十位数为"+(s4/10%10)); 
			System.out.println("这个数的个位数为"+(s4%10)); 
		}else if(s4/1000>=1 && s4/1000<=9){
			System.out.println("这个数是四位数"); 
			System.out.println("这个数的千位数为"+(s4/1000)); 
			System.out.println("这个数的百位数为"+(s4/100%10)); 
			System.out.println("这个数的十位数为"+(s4/10%10)); 
			System.out.println("这个数的个位数为"+(s4%10)); 
		}else if(s4/100==1 && s4/10<=9){
			System.out.println("这个数是三位数"); 
			System.out.println("这个数的百位数为"+(s4/100)); 
			System.out.println("这个数的十位数为"+(s4/10%10)); 
			System.out.println("这个数的个位数为"+(s4%10)); 
		}else if(s4/10==1 && s4/10<=9){
			System.out.println("这个数是二位数"); 
			System.out.println("这个数的十位数为"+(s4/10)); 
			System.out.println("这个数的个位数为"+(s4%10)); 
		}else if(s4/1==1 && s4/1<=9){
			System.out.println("这个数是一位数"); 
			System.out.println("这个数为"+s4); 
		}
		//3课后作业12
		System.out.println("请输入你想要输入的汇款金额");
		double s5 = scanner.nextDouble();
		if(s5<100 &&s5>0){
			System.out.println("汇费为1元");
		}else if(s5>=100 && s5<=5000){
			System.out.println("汇费为"+(s5/100)+"元");
		}else if(s5>5000){
			System.out.println("汇费为50元");
		}
		// 3 课后作业13
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
		
		// 3课后作业14
		int a4 =0;
		if(a4<10){
			
			if(a4!=5){
				System.out.print(a4+"  ");
				a4++;
			}
		}
		// 3课后作业15
		System.out.println("请输入你想要输入的数");
		int a5 = scanner.nextInt();
        int a6 =1;
		int a7 =1;
		if(a6<=a5){
			a7 = a7*a6;
			a6++;
		}
		System.out.println("阶乘为"+a7);*/
		// 3课后作业16
		int n=201,i;
        outer:
        for(;;n++){
            for(i=2;i*i<=n;i++) if(n%i==0)continue outer;
            break;
        }
        System.out.println(n);
		// 3课后作业17
		System.out.println("请输入你想要输入的数");
		int a8 = scanner.nextInt();
		int i1 =a8/1000;
	    int j1 =a8%1000/100; 
	    int k1 =a8%100/10;
        int	u1= a8%10;
		System.out.println(u1+""+k1+""+j1+""+i1);
		// 4课后作业1
		int[] num4 = {10,20,30,40,50};
		System.out.println(Arrays.toString(num4));
		// 4课后作业2
		char[] nuedu = {'n','e','u','s','o','f','t','e','d','u','c','a','t','i','o','n'};
	    char[] nuedu1 = Arrays.copyOf(nuedu,nuedu.length);
		System.out.println(Arrays.toString(nuedu1));
		// 4课后作业3
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
		
		
		// 4课后作业4
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
		// 4课后作业5
		double[][] arr3;
        arr3 = new double[5][4];
        for(int i5 =0;i<arr1.length;i5++){
            for(int j3 = 0;j3<arr1[i].length;j3++){
                arr1[i5][j3] = (int)(Math.random()*10);//随机产生数组元素
                System.out.print(arr1[i5][j3]+" ");
            }
            System.out.println("\n");
        }
		// 4课后作业6
		int[] a = {18,25,7,36,13,2,89,63}; 
		int max = a[0]; 
		int maxIndex = 0;
		for(int i3=1;i3<a.length;i3++){
				if(max<=a[i3]){
					max = a[i3]; 
					maxIndex = i3;
					}
		}
		System.out.println("最大值为："+max+"最大值下标为："+maxIndex);
		// 4课后作业7
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}