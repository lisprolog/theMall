public class HelpDesk extends Person{

    public HelpDesk(int i){
	super(i);
    }

    String welcome = "This is the Help Desk. A lady is smiling at you: May I help you?";

    String [] questions = {
	"Hello. I'm lost here. How can I leave?",
	"What is this place?",
	"Maybe...",
	"I don't know what to do.",
	"What is the inventory?",
	"Thank you! Bye!"
    };

    String [] commands = {
	"hello",
	"place",
	"anyway",
	"help",
	"inv",
	"entrance"
    };

    String [] feedback = {
	"Hello. To end the game just type <quit>.",
	"This is a text adventure written in Java Programming Language. It simulates a shopping mall and offers dialog options and interaction.",
	"Anyway, this helpdesk could use some flowers...",
	"Ask around to find a quest.",
	"The command <inventory> shows the recently bought items.",
	""
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
