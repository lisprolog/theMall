import java.util.HashMap;

public class BetaCade extends Room{
    
    int index;
    
    public BetaCade(int i){
	super(i);
    }
    
    String welcome = "This is an arcade room with retro video games. It has two old school arcade joysticks and some colorful buttons. The screen is not a flat screen but a cathode ray tube.";

    String [] commands = {
	"pacman",
	"snake",
	"sectionc"
    };

    String [] feedback = {
	"pacman",
	"snake",
	"sectionc"
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
    

    
