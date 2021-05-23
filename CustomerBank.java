public class CustomerBank extends Person{

    public CustomerBank(int i){
	super(i);
    }

    String welcome = "You are looking at a man in a tuxedo and black sun glasses. He holds a leather suitcase with him.";

    String [] questions = {
	"Hello. May I help you?",
	"Hi. I'm your last neighbour. Do you remember me?",
	"Excuse me. Do you have a cigarette?",
	"Why are you wearing black sun glasses here?",
	"bank"
    };

    String [] commands = {
	"hello",
	"remember",
	"cigarette",
	"glasses",
	"bank"
    };

    String [] feedback = {
	"Hello.",
	"No. I do not remember you..",
	"No, but I'd love to eat a burger right now.",
	"Because my other glasses are broken.",
	"bank"
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
