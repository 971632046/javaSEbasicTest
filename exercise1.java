import java.util.Scanner;
public class exercise1{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		double rate	= 7.7/100;
		System.out.println("请输入年数：");
		int year = scanner.nextInt();
		if(year <= 1){
			rate *= 0.5;
		}else if(year >1 && year <= 3){
			rate *= 0.7;
		}else if(year >3 &&year <= 5){
			rate = rate;
		}else{
			rate *= 1.1;
		}
		System .out.println("实际利率（%）："+rate);
		System.out.println("请输入分数:");
		int score = scanner.nextInt();
		String level = "" ;
		switch(score/10){
			case 10:
			case 9: level = "优秀"; break;
			case 8: level = "良好"; break;
			case 7: level = "中等"; break;
			case 6: level = "及格"; break;
			default: level = "不及格";
		}
		System.out.println(level);
	}
}