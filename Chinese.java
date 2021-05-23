public class Chinese extends Room{

    int index;
    
    public Chinese(int i){
	super(i);
    }
    
    String welcome = "Welcome to City Wok. What is your order?";

    String [] commands = {
	"buyChopSuey",
	"buyShrimpRice",
	"buyFortuneCookie",
	"entrance"
    };

    String [] feedback = {
	"You have bought a chop Suey.",
	"You have bought a rise with Shrimps.",
	"You have bought a Fortune cookies.",
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
    

    
