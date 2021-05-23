import java.util.ArrayList;
public class Room{
    
    int index;
    int money;
    int health;
    int slotindex;
    
    String welcome;

    String [] commands;

    String [] feedback;

    String [] questions;

    int [] prices;
    
    private ArrayList<Person> personList = new ArrayList<Person>();
    private ArrayList<GameObject> gameObjectList = new ArrayList<GameObject>();

    public Room(int i){
	this.index = i;
    }

    public int getIndex(){
	return this.index;
    }

    public String getWelcome(){
	return this.welcome;
    }
    
    public void addPerson(Person p){
	this.personList.add(p);
    }

    public Person getPerson(int i){
	return this.personList.get(i);
    }

    public GameObject getGameObject(int i){
	return this.gameObjectList.get(i);
    }

    public String[] getCommands(){
	return this.commands;
    }

    public String[] getFeedback(){
	return this.feedback;
    }

    public String[] getQuestions(){
	return this.questions;
    }

    public int[] getPrices(){
	return this.prices;
    }

    public void setCommand(String s){
    }

    public void setFeedback(int i, String s){
    }

    public void setFeedback(String s){
    }

    public void setAnswer(int i, String s){
    }

    public int getMoney(){
	return this.money;
    }

    public int getHealth(){
	return this.health;
    }
    
    public void setMoney(int n){
	this.money = this.money - n;
    }
    
    public void runGame(){
        //Pacman pm1 = new Pacman();
    }    

    public void getCopy(Inventory copy){
	copy.money = this.money;
	copy.health = this.health;
	copy.welcome = this.welcome;
	copy.slotindex = this.slotindex;
	copy.commands = this.getCommands();
	copy.feedback = this.getFeedback();
    }

    public int getID(){
	return this.index;
    }
    
}
