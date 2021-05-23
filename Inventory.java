public class Inventory extends Room{
    
    int index;
    int money = 50;
    int health = 100;
    int slotindex = 0;
    
    public Inventory(int i){
	super(i);
    }
    
    String welcome = "Inventory";

    String [] commands = {
	"slot1",
	"slot2",
	"slot3",
	"slot4",
	"slot5",
	"slot6",
	"slot7",
	"slot8",
	"slot9",
	"entrance"
    };

    String [] feedback = {
	"empty1",
	"empty2",
	"empty3",
	"empty4",
	"empty5",
	"empty6",
	"empty7",
	"empty8",
	"empty9",
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

    public int getMoney(){
	return this.money;
    }

    public void setCommand(String s){
	this.commands[slotindex] = s;
    }

    public void setFeedback(String s){
	this.feedback[slotindex++] = s;
    }
    
    public void setMoney(int n){
	this.money = money - n;
    }

    public int getHealth(){
	return this.health;
    }

    public void setHealth(int n){
	this.health += n;
    }

    public String[] copyCommands(){
	String[] copy = new String[9];
	for(int i = 0; i < 9; i++){
	    copy[i] = commands[i];
	}
	return copy;
    }

    public String[] copyFeedback(){
	String[] copy = new String[9];
	for(int i = 0; i < 9; i++){
	    copy[i] = commands[i];
	}
	return copy;
    }
    
    public void getCopy(Inventory copy){
	copy.money = this.money;
	copy.health = this.health;
	copy.welcome = this.welcome;
	copy.slotindex = this.slotindex;
	copy.commands = this.getCommands();
	copy.feedback = this.getFeedback();
    }
}
