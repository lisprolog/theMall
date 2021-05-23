public class Music extends Room{

    int index;
    
    public Music(int i){
	super(i);
    }
    
    String welcome = "This is a music store. Take an order: harmonica (10€), guitar (100 €) , drumset (500 €)";

    String [] commands = {
	"buyGuitar",
	"buyHarmonica",
	"BuyDrumset",
	"sectionb"
    };
    
    int [] prices = {
	100,
	10,
	500
    };
    
    String [] feedback = {
	"You have bought a guitar.",
	"You have bought a harmonica.",
	"You have bought a drumset.",
	"sectionb"
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
    

    
