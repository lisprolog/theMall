public class MainEntrance extends Room{

    int index;
    
    public MainEntrance(int i){
	super(i);
    }
    
    String welcome = "Welcome to the Mall Adventure! This is the start of the adventure. You just entered through a door into the Main Entrance. In front of you is a help desk. Left of you: A bank. Right of you: a florist shop. You can also go to SECTION_A.";

    String [] commands = {
	"exit",
	"helpdesk",
	"bank",
	"florist",
	"sectiona"
    };

    String [] feedback = {
	"You have just entered. To leave the game enter <quit>.",
	"helpdesk",
	"bank",
	"florist",
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

    public void setAnswer(int i, String s){
	this.feedback[i] = s;
    }    
    
}
    

    
