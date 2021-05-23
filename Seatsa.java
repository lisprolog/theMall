public class Seatsa extends Room{

    int index;
    
    public Seatsa(int i){
	super(i);
    }
    
    String welcome = "Chairs for food franchises.";

    String [] commands = {
	"seat1",
	"seat2",
	"seat3",
	"seat4",
	"sectiona"
    };

    String [] feedback = {
	"empty seat",
	"taken seat",
	"food leftover",
	"eur: 5",
	"entrance"
    };

    int [] prices = {
	15,
	10,
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
    

    
