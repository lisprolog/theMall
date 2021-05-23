public class Bank extends Room{

    int index;
    
    public Bank(int i){
	super(i);
    }
    
    String welcome = "You have entered Mall Banks Services. You see a security guy, a customer, a cash exchange and an ATM machine.";

    String [] commands = {
	"security",
	"customerbank",
	"exchange",
	"atm",
	"entrance"
    };

    String [] feedback = {
	"security",
	"customer",
	"exchange",
	"atm",
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
    

    
