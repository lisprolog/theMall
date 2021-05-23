public class Florist extends Room{

    int index;
    
    public Florist(int i){
	super(i);
    }
    
    String welcome = "This is a florist shop. There is a nice lady at the counter. There are many flowers to choose from. roses for 15€, tulips for 10€ and the cactus for 5€.";

    String [] commands = {
	"buyroses",
	"buytulips",
	"buycactus",
	"entrance"
    };

    String [] feedback = {
	"You have bought roses.",
	"You have bought tulips.",
	"You have bought a cactus.",
	"Bye"
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

    public int[] getPrices(){
	return this.prices;
    }
}
    

    
