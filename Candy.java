public class Candy extends Room{

    int index;
    
    public Candy(int i){
	super(i);
    }
    
    String welcome = "This is the Candy Shop. Please take an order.";

    String [] commands = {
	"buyBubblegum",
	"buyChocolate",
	"buyMarzipan",
	"atm",
	"entrance"
    };

    String [] feedback = {
	"You have bought bubblegum.",
	"You have bought Chocolate.",
	"You have bought Marzipan.",
	"atm",
	"sectiona"
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
    

    
