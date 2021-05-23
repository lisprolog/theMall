public class Theater extends Room{

    int index;
    
    public Theater(int i){
	super(i);
    }
    
    String welcome = "This is a cinema. You can get seats at front row (8€), middle rows (9€) or at the rear end (10€)";

    String [] commands = {
	"watchfront",
	"watchmiddle",
	"watchback",
	"sectionc",
    };

    String [] feedback = {
	"I cannot watch a movie without nachos.",
	"I cannot watch a movie without nachos.",
	"I cannot watch a movie without nachos.",
	"sectionc"
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
    
    int [] prices = {
	5,
	10,
	15
    };
    
    public int[] getPrices(){
	return this.prices;
    }

    public void setAnswer(int i, String s){
	this.feedback[i] = s;
    }

    public void setFeedback(int i, String s){
	this.commands[i] = s;
    }
}
    

    
