public class Playground extends Person{

    int index;
    
    public Playground(int i){
	super(i);
    }
    
    String welcome = "This is a playground for children. You see one kid crying.";

    String [] commands = {
	"what",
	"why",
	"check",
	"help",
	"sectionb"
    };

    String [] questions = {
	"Whats going on here?",
	"Why are you crying?",
	"Let's check why!",
	"I will help you!",
	"Move to entrance."
    };
    
    String [] feedback = {
	"I don't wanna go into that cube anymore.",
	"Because it's dark in this cube.",
	"There is no light inside, because the bulb is broken.",
	"Moooommyyyy! I want my MMoooommmmyyy!",
	"entrance"
    };

    int [] prices = {
	15,
	10,
	5
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
    

    
