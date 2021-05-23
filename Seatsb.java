public class Seatsb extends Room{

    int index;
    
    public Seatsb(int i){
	super(i);
    }
    
    String welcome = "Chairs for food franchises.";

    String [] commands = {
	"Seat1",
	"Seat2",
	"Seat3",
	"Seat4",
	"sectionc"
    };

    String [] feedback = {
	"Food leftover",
	"Clean empty seat",
	"55$",
	"empty seat",
	"entrance"
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
    

    
