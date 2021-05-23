public class Security extends Person{

    public Security(int i){
	super(i);
    }

    String welcome = "A big guy in black uniform.";

    String [] questions = {
	"Hello there. How's work today?",
	"Hello there. Are you hungry?",
	"Have you seen the other guy over there? He looks suspicious to me!",
	"Move in bank.",
	"Move to entrance."
    };

    String [] commands = {
	"hello",
	"hungry",
	"have",
	"bank",
	"entrance"
    };

    String [] feedback = {
	"Great.",
	"Of course I am. I'd like chop suey. But I cannot leave here.",
	"I will keep an eye on him. There is no need to worry Mr.",
	"Bye.",
	"Ciao."
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
