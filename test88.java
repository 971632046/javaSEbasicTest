package exercise;

/**
 * @author smh
 * @since 20190808
 * @version 1.0
 */
public class test88 {
   public static void main(String[] args) {
	   String[] options = {"Ò¶Á¼³¼","³ÂÊö","Ò¶Çï","¹þº«"};
	SingleQuestion singleQuestion=new SingleQuestion(1, "ºÎ·½ÏÉÓÑÔÚ´Ë¶É½Ù", options, "Ò¶Çï");
	String[] answer = {"Ò¶Çï"};
	boolean check = singleQuestion.check(answer);
	System.out.println(check);
}
}
