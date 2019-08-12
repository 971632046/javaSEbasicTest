package Question;

public class Question {
	String text;
	 	  int id;  
	  String[] options;
	 
	  public void print(){
	    //this 实际引用的是单选题实例
	    System.out.println(this.text);
	    for(int i=0;i<=options.length;i++) {
	      System.out.print(options[i]+"\t");
	    }
	    System.out.println(); 
	  }
	 
	  public boolean check(char[] answers){
	    return false;//这个false表示用户答案是错误的,应该
	    //由子类型提供具体的检查答案的方法(叫"方法的覆盖")
	  } 	    	 	  
}
