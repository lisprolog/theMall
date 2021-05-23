public class Tools extends Room{

    int index;
    
    public Tools(int i){
	super(i);
    }
    
    String welcome = "This is a tools store.";

    String [] commands = {
	"buybulb",
	"buyhammer",
	"buyfan",
	"employee",
	"entrance"
    };

    String [] feedback = {
	"You have bought a light bulb",
	"You have bought a hammer",
	"You have bought a fan",
	"employeeTools",
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
    
}
    

    
