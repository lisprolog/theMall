public class Barber extends Room{

    int index;
    
    public Barber(int i){
	super(i);
    }
    
    String welcome = "This is a barber shop. A shortcut 10€, a nice cut 15€ and the beauty for 20€.";

    String [] commands = {
	"buyshortcut",
	"buymediumcut",
	"buylongcut",
	"entrance"
    };

    int [] prices = {
	10,
	15,
	20
    };
    
    String [] feedback = {
	"You got a short cut.",
	"You got a medium hair cut.",
	"You got a fancy hair cut.",
	"Bye"
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
    

    
