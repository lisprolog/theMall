public class Coffeeshop extends Room{

    int index;
    
    public Coffeeshop(int i){
	super(i);
    }
    
    String welcome = "This is a coffee shop. They sell black coffe for 3€, espresso for 4 € and flat white for 5€";

    String [] commands = {
	"buyblack",
	"buyespresso",
	"buyflat",
	"atm",
	"entrance"
    };

    String [] feedback = {
	"security",
	"customer",
	"exchange",
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
    

    
