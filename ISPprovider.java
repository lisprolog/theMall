public class ISPprovider extends Person{

    int index;

    public ISPprovider(int i){
	super(i);
    }
    
    String welcome = "This is an ISP provider. Do you need help?";

    String [] questions = {
	"Hello there. How's work today?",
	"Hello there. Are you hungry?",
	"Anyway. So how are you?",
	"sectionb"
    };

    String [] commands = {
	"hello",
	"hungry",
	"anyway",
	"sectionb"
    };

    String [] feedback = {
	"Great. People pay their bills. Less work for me.",
	"No. I already had lunch. Thank you.",
	"Have you read the new issue of Detective Comics?",
	"sectionb"
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
    

    
