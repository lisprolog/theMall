public class Grocery extends Room{

    int index;
    
    public Grocery(int i){
	super(i);
    }
    
    String welcome = "This is a grocery store. What do you need?";

    String [] commands = {
	"buyPopcorn",
	"buyDrink",
	"buyNachos",
	"sectionc",
    };

    String [] feedback = {
	"You have bought popcorn",
	"You have bought a soft drink.",
	"You have bought nachos.",
	"sectionc",
    };

    int [] prices = {
	5,
	10,
	15
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
    
    public int[] getPrices(){
	return this.prices;
    }    
}
    

    
