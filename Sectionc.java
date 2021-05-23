public class Sectionc extends Room{

    int index;
    
    public Sectionc(int i){
	super(i);
    }
    
    String welcome = "Section C of the Mall. There are a Theater, Arcade, Chinese Restaurant, Bar, seats";

    String [] commands = {
	"sectionb",
	"theater",
	"arcade",
	"chinese",
	"comics",
	"barber",
	"emergencyexitc",
    };

    String [] feedback = {
	"sectionb",
	"theater",
	"arcade",
	"chinese",
	"comics",
	"barber",
	"will not open",
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
    

    
