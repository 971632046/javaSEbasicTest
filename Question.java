package exercise;
/**
 * @author smh
 * @since 20190808
 * @version 1.0
 */
public class Question {
    int id;
    String text;
    String[] options;
    public boolean check(String[] answer) {
    	return false;
    }
    
    public void print() {
    	System.out.println(id+"."+text);
    	for (int i=0; i<options.length;i++) {
    		System.out.print(" "+options[i]);
    	}
    	System.out.println();
    }
    
    
    
    
    
}
