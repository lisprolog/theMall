public class Sports extends Room{

    int index;
    
    public Sports(int i){
	super(i);
    }
    
    String welcome = "This is a sports store. tennis, baseball, soccer.";

    String [] commands = {
	"buyTennisball",
	"buyBaseballbat",
	"buySoccerball",
	"customerSports",
	"entrance"
    };

    String [] feedback = {
	"You have bought a tennis ball.",
	"You have bought a baseball bat.",
	"You have bought a soccer ball.",
	"atm",
	"entrance"
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
    

    
