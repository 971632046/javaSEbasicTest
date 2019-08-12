package Question;

import java.util.Arrays;

public class MultiChoice extends Question {
	String[] options;
	int[] answers;

	  public MultiChoice(String text, String[] options, int[] answers) {
		  this.text = text;
		  this.options = options;
	    this.answers = answers;
	  }
	 
	  public boolean check(int[] as) {
	    if(answers != null && as.length == answers.length) {
	    	Arrays.sort(as);
	    	for(int i=0;i<as.length;i++) {
	    		if(as[i] != answers[i]) {
	    			return false;
	    		}
	    	}
	    }
	    return true;
		
	  }
}
