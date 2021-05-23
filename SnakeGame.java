import snake.Snake;
public class SnakeGame extends Room{

    public SnakeGame(int i){
	super(i);
    }

    public void runGame(){
	Snake sn1 = new Snake();
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
