public class Emergencyexita extends Person{

    int index;
    
    public Emergencyexita(int i){
	super(i);
    }
    
    String welcome = "This is an emergency exit. An employee is looking at you.";

    String [] questions = {
	"Hello there. How's work today?",
	"Hello there. Are you hungry?",
	"Hey, what are you up to?",
	"Move to sectiona."
    };
    
    String [] commands = {
	"hello",
	"customerbank",
	"what",
	"sectiona"
    };

    String [] feedback = {
	"Work is great. I'm havin my break yet!",
	"No not any more, have already eatin my pizza.",
	"I'm bored. I'd like to play soccer.",
	"sectiona"
    };

    public String getWelcome(){
	return this.welcome;
    }

    public String[] getCommands(){
	return this.commands;
    }

    public String[] getFeedback(){
	return this.feedback;
    }

    public String[] getQuestions(){
	return this.questions;
    }

    public void setAnswer(int i, String s){
	this.feedback[i] = s;
    }
    
}
    

    
