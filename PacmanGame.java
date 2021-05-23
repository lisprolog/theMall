import pacman.Pacman;
public class PacmanGame extends Room{

    Pacman pac;
    
    public PacmanGame(int i){
	super(i);
    }

    public void runGame(){
        Pacman pm1 = new Pacman();
    }
	
    public void stop(){
	
    }
	
    String welcome = "";

    String [] commands = {
	"betacade"
    };

    String [] feedback = {
	"betacade"
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
