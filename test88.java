package exercise;

/**
 * @author smh
 * @since 20190808
 * @version 1.0
 */
public class test88 {
   public static void main(String[] args) {
	   String[] options = {"Ҷ����","����","Ҷ��","����"};
	SingleQuestion singleQuestion=new SingleQuestion(1, "�η������ڴ˶ɽ�", options, "Ҷ��");
	String[] answer = {"Ҷ��"};
	boolean check = singleQuestion.check(answer);
	System.out.println(check);
}
}
