import java.util.ArrayList;
public class Person extends Room{
    
    private int index;
        private String [] questions;
        private String [] answers;
        private GameObject[] objectList;

    public Person (int i){
	super(i); 
	//this.index = i;
    }

    public int getIndex(){
	return this.index;
    }

    public String getQuestion(int i){
	if(checkArrayLength(i, questions)){
		return questions[i];
	}else{
		return "GetQuestionsError!";
	}
    }

    public String getAnswers(int i){
	if(checkArrayLength(i, answers)){
		return answers[i];
	}else{
		return "GetAnswersError!";
	}
    }

    public String[] getQuestions(){
	return this.questions;
    }
    

    private boolean checkArrayLength(int i, String [] s){
	return i <= s.length? true : false;
    }
}
