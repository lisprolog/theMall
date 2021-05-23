public class Sectiona extends Room{

    int index;
    
    public Sectiona(int i){
	super(i);
    }
    
    String welcome = "Section A of the Mall. There are massage seats, burger shop, candy store, , emergency exit";

    String [] commands = {
	"entrance",
	"coffeeshop",
	"seatsa",
	"burger",
	"candy",
	"phonecompany",
	"emergencyexita",
	"ISPprovider",
	"sectionb"
    };

    String [] feedback = {
	"entrance",
	"massage",
	"seatsa",
	"burger",
	"candy",
	"phone",
	"emergencyexita",
	"isp",
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
}
    

    
