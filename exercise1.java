import java.util.Scanner;
public class exercise1{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		double rate	= 7.7/100;
		System.out.println("������������");
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
		System .out.println("ʵ�����ʣ�%����"+rate);
		System.out.println("���������:");
		int score = scanner.nextInt();
		String level = "" ;
		switch(score/10){
			case 10:
			case 9: level = "����"; break;
			case 8: level = "����"; break;
			case 7: level = "�е�"; break;
			case 6: level = "����"; break;
			default: level = "������";
		}
		System.out.println(level);
	}
}