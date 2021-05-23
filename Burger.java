public class Burger extends Room{

    int index;
    
    public Burger(int i){
	super(i);
    }
    
    String welcome = "This is a burger franchise. Please take an order.";

    String [] commands = {
	"buyBurger",
	"buyNuggets",
	"buyIce",
	"atm",
	"entrance"
    };

    String [] feedback = {
	"Burger",
	"Nuggets",
	"Ice",
	"atm",
	"entrance"
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
    
    public void setAnswer(int i, String s){
	this.feedback[i] = s;
    }
    
}
    

    
