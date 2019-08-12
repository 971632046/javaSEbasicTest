package Question;

public class SingleChoice extends Question{
	int answer;
	String[] options;
	 
	  public SingleChoice(String text, String[] options, int answer) {
	    this.text = text;
	    this.options = options;
	    this.answer = answer;
	  }
	 
	  public boolean check(int[] answers) {
	    return this.answer == answers[0];
	  }
}
