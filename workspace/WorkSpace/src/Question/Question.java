package Question;

public class Question {
	String text;
	 	  int id;  
	  String[] options;
	 
	  public void print(){
	    //this ʵ�����õ��ǵ�ѡ��ʵ��
	    System.out.println(this.text);
	    for(int i=0;i<=options.length;i++) {
	      System.out.print(options[i]+"\t");
	    }
	    System.out.println(); 
	  }
	 
	  public boolean check(char[] answers){
	    return false;//���false��ʾ�û����Ǵ����,Ӧ��
	    //���������ṩ����ļ��𰸵ķ���(��"�����ĸ���")
	  } 	    	 	  
}
