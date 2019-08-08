package exercise;
/**
 * @author smh
 * @since 20190808
 * @version 1.0
 */
public class SingleQuestion extends Question{
    String answer;

	public SingleQuestion(int id, String text, String[] options ,String answer) {
		this.id = id;
		this.text = text;
		this.options = options;
		this.answer = answer;
	}
    @Override
	public  boolean check(String[] answer) {
	if(answer == null || answer.length!=1) {
		return false;
	}
	return this.answer.equals(answer[0]);
    }
	
	
	
	
	
	
}
