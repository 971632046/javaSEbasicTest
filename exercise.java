import java.util.Scanner;
public class exercise{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		double num9 = scanner.nextInt();
		System.out.println("您的第一个数字为:"+num9+"请输入第二个数:");
		double num10 = scanner.nextInt();
		System.out.println("您的第二个数字为:"+num10+"请选择算法");
		double newDifference = getDifference(num9,num10);
		double newResult = sum(num9,num10);
		double newMultiply = getMultiply(num9,num10);
		double newDivision = getDivision(num9,num10);
		int style = scanner.nextInt();
		if(style == 1){	
			System.out.println(newResult);
		}
		
		if(style == 2)
		System.out.println(newDifference);
		if(style == 3)
		System.out.println(newMultiply);
		if(style == 4)
		System.out.println(newDivision);
	
}
    public static double sum(double num1, double num2){
		double sumResult = num1+num2;
		return sumResult;
		}
	public static double getDifference(double num3,double num4){
		double difference = num3-num4;
		return difference;
	}
	public static double getMultiply(double num5,double num6){
		double multiply = num5*num6;
		return multiply;
	}
	public static double getDivision(double num7,double num8){
		double division = num7/num8;
		return division;
	}



}


