public class Sectionb extends Room{

    int index;
    
    public Sectionb(int i){
	super(i);
    }
    
    String welcome = "Section B of the Mall. There are grocery store, playground, sports store, music store, tools store, emergency exit";

    String [] commands = {
	"sectiona",
	"grocery",
	"seatsb",
	"playground",
	"sports",
	"music",
	"emergencyexitb",
	"tools",
	"sectionc"
    };

    String [] feedback = {
	"sectiona",
	"grocery",
	"seatsb",
	"playground",
	"sports",
	"music",
	"emergencyexitb",
	"tools",
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
}
    

    
