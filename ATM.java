public class ATM extends Room{

    int index;
    
    public ATM(int i){
	super(i);
    }
    
    String welcome = "Thank you for using ATM Mall Serives.Please choose your option:";

    String [] commands = {
	"total",
	"payin",
	"payout",
	"bank"
    };

    String [] feedback = {
	"Your total is 100€",
	"You cannot pay in right now.",
	"You cannot pay out right now.",
	""
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
    

    
