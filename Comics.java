public class Comics extends Room{

    int index;
    
    public Comics(int i){
	super(i);
    }
    
    String welcome = "This is a comic store.";
   
    String [] commands = {
	"buyDetectiveComics",
	"buyMarvelComics",
	"buyDonaldDuck",
	"sectionb"
    };

    String [] feedback = {
	"You have bought a Batman Comic.",
	"You have bought a Spiderman Comic.",
	"You have bought a Donald Duck.",
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

    public String[] getQuestions(){
	return this.questions;
    }

    public void setAnswer(int i, String s){
	this.feedback[i] = s;
    }
    
}
    

    
