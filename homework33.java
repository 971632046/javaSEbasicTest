// 2019.8.3 史明昊
import java.util.Arrays;
import javax.swing.*;
public class homework33{
	// 统计字符串中字的位置
	public static void main(String[] args){
    String str = "统计一个字符在字符串中的所有位置";
	int[] arrays = countALL(str, '字');
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
	// 统计一个字符在字符数组中的所有位置
	char[] chs = {'统','计','一','个','字','符','在','字','符','串','中'};
	for( int i = 0;i< chs.length; i++){
		if (chs[i] == '字'){
			System.out.println("字符在字符数组中的位置为"+i);
		}
	}
	// 练习3：
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
	System.out.println("奇数和："+oldNum);
	System.out.println("偶数和："+evenNum);
	
	
	
	
	// 练习4：
	int num = 56123;
	int newNum = 0;
	while (num>0){
		newNum = newNum *10 +num %10;
		num = num / 10;
	}
	System.out.println(newNum);
	}
	
}	
	
	
