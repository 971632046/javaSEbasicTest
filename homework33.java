// 2019.8.3 ʷ���
import java.util.Arrays;
import javax.swing.*;
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
	
}	
	
	
