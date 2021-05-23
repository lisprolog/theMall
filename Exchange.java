public class Exchange extends Person{

    public Exchange(int i){
	super(i);
    }

    String welcome = "Welcome to Mall Bank Exchange. How can I help you?";

    String [] questions = {
	"Hello. I'm new here.",
	"Thank you! Bye!",
	"Thank you! Bye!"
    };

    String [] commands = {
	"hello",
	"bank",
	"entrance"
    };

    int [] prices = {
	15,
	10,
	5
    };

    String [] feedback = {
	"I can help you with money exchange. If you need to exchange one currency to another, you need to hand over a minimum amount of about 50€",
	"This is a club where like-minded people meet. Most guys/gals around here are into technology and/or art.",
	"You can hang around, socialize, do your work or just chill. Check out the other rooms and I will tell you more.",
	"Oh that! We sell drinks in the kitchen but have to store most of them here.",
	"It's a pachinko. It's a japanese slot machine. Ask the guy in the photo lab!"
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
    
}
