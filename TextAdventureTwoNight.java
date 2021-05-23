import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
public class TextAdventureTwoNight{
    
    static Scanner sc;

    private GameLevel g01;
    private String temporaryWelcome, temporaryAnswer;
    private static int [] save = {0,0,0,0,0,0,0,0,0,0};//this bits make sure a quest is not repeated.
    private static boolean finish = false;
    //Quests:
    //security
    //helpdesk
    //customerbank
    //seat4
    //emergencySoccer
    //playground
    //seat3
    //ispProvider
    //theater
    //music
    private ArrayList<GameLevel> levelList = new ArrayList<GameLevel>();
    private GameLevel temporaryGameLevel;
    private Room temporaryRoom;
    private String [] temporaryCommands;
    private String [] temporaryFeedback;
    private String [] temporaryQuestions;
    private static int [] temporaryPrices;
    private String bufferCommand = "";
    private int commandIndex = 0;
    private HashMap map1;
    private boolean isPerson = false;
    private static String item = "";
    
    public static void main(String [] args){

	TextAdventureTwoNight t1 = new TextAdventureTwoNight();

	GameLevel g01 = new GameLevel(0);
	t1.levelList.add(g01);
	t1.setTemporaryGameLevel(g01);
	HashMap<String, Room> mapsRoom = new HashMap<String, Room>();
	HashMap<String, Room> mapsPerson = new HashMap<String, Room>();
	Room r0 = new MainEntrance(0);
	mapsRoom.put("entrance", r0);
	Room r1 = new Bank(1);
	mapsRoom.put("bank", r1);
	Room r2 = new ATM(2);
	mapsRoom.put("atm", r2);
	Room r3 = new CustomerBank(3);
	mapsPerson.put("customerbank", r3);
	Room r4 = new Florist(4);
	mapsRoom.put("florist", r4);
	Room r5 = new Security(5);
	mapsPerson.put("security", r5);
	Room r6 = new Exchange(6);
	mapsPerson.put("exchange", r6);    
	Room r7 = new Coffeeshop(7);	
	mapsRoom.put("coffeeshop", r7);	
	Room r8 = new Chinese(8);
	mapsRoom.put("chinese", r8);
	Room r9 = new Sectiona(9);
	mapsRoom.put("sectiona", r9);
	Room r10 = new Sectionb(10);
	mapsRoom.put("sectionb", r10);
	Room r11 = new Sectionc(11);
	mapsRoom.put("sectionc", r11);	
	Room r12 = new Burger(12);
	mapsRoom.put("burger", r12);
	Room r13 = new Candy(13);
	mapsRoom.put("candy", r13);
	Room r14 = new Emergencyexita(14);
	mapsPerson.put("emergencyexita", r14);	
	//r15 deleted
	Room r16 = new HelpDesk(16);
	mapsPerson.put("helpdesk", r16);
	Room r17 = new Grocery(17);
	mapsRoom.put("grocery", r17);
	Room r18 = new ISPprovider(18);
	mapsPerson.put("ISPprovider", r18);
	//r19 deleted
	Room r20 = new Playground(20);
	mapsPerson.put("playground", r20);
	Room r21 = new Seatsa(21);
	mapsRoom.put("seatsa", r21);
	Room r22 = new Seatsb(22);
	mapsRoom.put("seatsb", r22);
	Room r23 = new Sports(23);
	mapsRoom.put("sports", r23);
	Room r24 = new Theater(24);
	mapsRoom.put("theater", r24);
	Room r25 = new Tools(25);
	mapsRoom.put("tools", r25);	
	Room r27 = new BetaCade(27);
	mapsRoom.put("arcade", r27);	
	Room r29 = new Music(29);
	mapsRoom.put("music", r29);
	Room r30 = new Comics(30);
	mapsRoom.put("comics", r30);
	Room r37 = new PacmanGame(37);
	mapsRoom.put("pacman", r37);
	Room r38 = new SnakeGame(38);
	mapsRoom.put("snake", r38);
	Room r39 = new Inventory(39);
	mapsRoom.put("inventory", r39);
	//r40 deleted
	Room r41 = new Emergencyexitc(41);
	mapsPerson.put("emergencyexitc", r41);
	
	sc = new Scanner(System.in);

	t1.setTemporaryGameLevel(g01);
	t1.setTemporaryRoom(r0);
	t1.setTemporaryCommands(t1.copyArray(r0.getCommands()));
	t1.setTemporaryFeedback(t1.copyArray(r0.getFeedback()));
	t1.setTemporaryAnswer("Entrance");
	t1.setTemporaryWelcome(r0.getWelcome());

	boolean mainLoop = true;
	String buffer = "";

	t1.toStringOutput();
	
	while(mainLoop){
	    buffer = sc.next();
	    t1.setBufferCommand(buffer);
	    t1.setTemporaryAnswer(" ");
	    if(buffer.equals("quit")){
		mainLoop = false;
	    }else if(buffer.equals("please")){
		if(t1.getTemporaryRoom().index == 5){
		}   
	    }else if(mapsRoom.containsKey(buffer)){// change Room
		t1.setTemporaryRoom(mapsRoom.get(buffer));
		t1.setTemporaryWelcome(t1.getTemporaryRoom().getWelcome());
		t1.setPersonBoolean(false);
		t1.setTemporaryAnswer(" ");
		if(t1.getTemporaryRoom().index == 37){
		    t1.getTemporaryRoom().runGame();
		}else if(t1.getTemporaryRoom().index == 38){
		    t1.getTemporaryRoom().runGame();
		}else if(t1.getTemporaryRoom().index == 39){
		    t1.setTemporaryAnswer("€: " + t1.getTemporaryRoom().getMoney() + " @: " + t1.getTemporaryRoom().getHealth());
		}
     	    }else if(mapsPerson.containsKey(buffer)){// change Person/Room
		t1.setTemporaryRoom(mapsPerson.get(buffer));
		t1.setTemporaryWelcome(t1.getTemporaryRoom().getWelcome());
		t1.setPersonBoolean(true);
		t1.setTemporaryAnswer(" ");
		
	    }else{//Level commands
		try{
		    String[] commands = t1.getTemporaryRoom().getCommands();
		    String[] feedback = t1.getTemporaryRoom().getFeedback();
		    int index = t1.checkCommands(commands, buffer);
		    t1.setTemporaryAnswer(feedback[index]);
		    if(t1.checkBuy(buffer)){// buy command
		    	t1.setTemporaryFeedback(t1.copyArray(r0.getFeedback()));
		    	temporaryPrices = t1.getTemporaryRoom().getPrices();
		      Room inventory = mapsRoom.get("inventory");
		      for(int i = 3; i < buffer.length(); i++){
		    		item += buffer.charAt(i);
		      }
		      if(inventory.getMoney() >= temporaryPrices[index]){
		    		inventory.setCommand(item);
		    		inventory.setFeedback(feedback[index]);
		    		inventory.setMoney(temporaryPrices[index]);
		    		mapsRoom.remove("inventory");
		    		mapsRoom.put("inventory", inventory);
				item = "";
		      }
		      
		      
		    }
		}catch(Exception e){
		    t1.setTemporaryAnswer("wrong command");
		}
	    }
	    if(buffer.equals("buyChopSuey")){
		save[0] = 1;
	    }
	    if(buffer.equals("buyroses")){
		save[1] = 1;
	    }
	    if(buffer.equals("buyBurger")){
		save[2] = 1;
	    }
	    if(buffer.equals("seatsa")){
		save[3] = 1;
	    }
	    if(buffer.equals("buySoccerball")){
		save[4] = 1;
	    }
	    if(buffer.equals("buybulb")){
		save[5] = 1;
	    }
	    if(buffer.equals("seatsb")){
		save[6] = 1;
	    }
	    if(buffer.equals("buyDetectiveComics")){
		save[7] = 1;
	    }
	    if(buffer.equals("buyNachos")){
		save[8] = 1;
	    }
	    if(buffer.equals("buyHarmonica")){
		save[9] = 1;
	    }	    
	    if(t1.getTemporaryRoom().index == 5 && save[0] == 1 && buffer.equals("security")){
		Room newSecurity = mapsPerson.get("security");
		newSecurity.setAnswer(1, "Hm. Delicious! Thank you very much.");
		mapsPerson.remove("security");
		mapsPerson.put("security", newSecurity);
		Room inventory = mapsRoom.get("inventory");
		inventory.setMoney(-15);
		mapsRoom.remove("inventory");
		mapsRoom.put("inventory", inventory);
		save[0] = 2;
	    }
	    if(t1.getTemporaryRoom().index == 16 && save[1] == 1 && buffer.equals("helpdesk")){
		Room newHelpdesk = mapsPerson.get("helpdesk");
		newHelpdesk.setAnswer(2, "These roses are wonderful. Thank you very much!");
		mapsPerson.remove("helpdesk");
		mapsPerson.put("helpdesk", newHelpdesk);
		Room inventory = mapsRoom.get("inventory");
		inventory.setMoney(-15);
		mapsRoom.remove("inventory");
		mapsRoom.put("inventory", inventory);
		save[1] = 2;
	    }// the other quests repeat this newCustomer pattern via copy/paste
	    if(t1.getTemporaryRoom().index == 3 && save[2] == 1 && buffer.equals("customerbank")){
		Room newCustomer = mapsPerson.get("customerbank");
		newCustomer.setAnswer(2, "This burger is great. Thank you very much!");
		mapsPerson.remove("customerbank");
		mapsPerson.put("customerbank", newCustomer);
		Room inventory = mapsRoom.get("inventory");
		inventory.setMoney(-15);
		mapsRoom.remove("inventory");
		mapsRoom.put("inventory", inventory);
		save[2] = 2;
	    }
	    if(t1.getTemporaryRoom().index == 21 && save[3] == 1 && buffer.equals("seat4")){
		Room inventory = mapsRoom.get("inventory");
		inventory.setMoney(-5);
		mapsRoom.remove("inventory");
		mapsRoom.put("inventory", inventory);
		save[3] = 2;
	    }
	    if(t1.getTemporaryRoom().index == 14 && save[4] == 1 && buffer.equals("emergencyexita")){
		Room newCustomer = mapsPerson.get("emergencyexita");
		newCustomer.setAnswer(2, "Cool! I can play soccer! Thank you very much!");
		mapsPerson.remove("emergencyexita");
		mapsPerson.put("emergencyexita", newCustomer);
		Room inventory = mapsRoom.get("inventory");
		inventory.setMoney(-15);
		mapsRoom.remove("inventory");
		mapsRoom.put("inventory", inventory);
		save[4] = 2;
	    }
	    if(t1.getTemporaryRoom().index == 20 && save[5] == 1 && buffer.equals("playground")){
		Room newCustomer = mapsPerson.get("playground");
		newCustomer.setAnswer(2, "Light! Wow! Thank you!");
		mapsPerson.remove("playground");
		mapsPerson.put("playground", newCustomer);
		Room inventory = mapsRoom.get("inventory");
		inventory.setMoney(-15);
		mapsRoom.remove("inventory");
		mapsRoom.put("inventory", inventory);
		save[5] = 2;
	    }
	    if(t1.getTemporaryRoom().index == 22 && save[6] == 1 && buffer.equals("Seat3")){
		Room inventory = mapsRoom.get("inventory");
		inventory.setMoney(-55);
		mapsRoom.remove("inventory");
		mapsRoom.put("inventory", inventory);
		save[6] = 2;
	    }	   
	    if(t1.getTemporaryRoom().index == 18 && save[7] == 1 && buffer.equals("ISPprovider")){
		Room newCustomer = mapsPerson.get("ISPprovider");
		newCustomer.setAnswer(2, "The new DC issue! Thank you!");
		mapsPerson.remove("ISPprovider");
		mapsPerson.put("ISPprovider", newCustomer);
		Room inventory = mapsRoom.get("inventory");
		inventory.setMoney(-15);
		mapsRoom.remove("inventory");
		mapsRoom.put("inventory", inventory);
		save[7] = 2;
	    }
	    if(t1.getTemporaryRoom().index == 24 && save[8] == 1 && buffer.equals("theater")){
		Room newCustomer = mapsRoom.get("theater");
		newCustomer.setFeedback(0, "buyfrontticket");
		newCustomer.setFeedback(1, "buymiddleticket");
		newCustomer.setFeedback(2, "buybackticket");
		newCustomer.setAnswer(0, "You have watched a movie. You neck hurts.");
		newCustomer.setAnswer(1, "You have watched a movie. Someone next to you was making telephone calls.");
		newCustomer.setAnswer(2, "You have enjoyed the movie.");		
		mapsRoom.remove("theater");
		mapsRoom.put("theater", newCustomer);
		save[8] = 2;
	    }
	    if(t1.getTemporaryRoom().index == 41 && save[9] == 1 && buffer.equals("emergencyexitc")){
		Room newCustomer = mapsPerson.get("emergencyexitc");
		newCustomer.setAnswer(2, "A harmonica! Thank you! I can play music!");
		mapsPerson.remove("emergencyexitc");
		mapsPerson.put("emergencyexitc", newCustomer);
		Room inventory = mapsRoom.get("inventory");
		inventory.setMoney(-10);
		mapsRoom.remove("inventory");
		mapsRoom.put("inventory", inventory);
		save[9] = 2;
	    }	    
	    if(save[0] == 2 &&
	       save[1] == 2 &&
	       save[2] == 2 &&
	       save[3] == 2 &&
	       save[4] == 2 &&
	       save[5] == 2 &&	       
	       save[6] == 2 &&	       
	       save[7] == 2 &&	       
	       save[8] == 2 &&	       
	       save[9] == 2){
		finish = true;
	    }
	    if(t1.getTemporaryRoom().index == 0 && finish == true  && buffer.equals("entrance")){
		Room newCustomer = mapsRoom.get("entrance");
		newCustomer.setAnswer(0, "Congratulations.You have completed the game!");
		mapsRoom.remove("entrance");
		mapsRoom.put("entrance", newCustomer);
	    }
	    
	    t1.clearScreen();
	    t1.toStringOutput();
	    
	}
    }


    public void toStringOutput(){
	System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +\n");
	System.out.println(this.temporaryWelcome);
	System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +\n");
	System.out.println(this.temporaryAnswer);
	System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
	String[] commands = temporaryRoom.getCommands();
	if(this.isPerson){
	    this.setTemporaryQuestions(this.copyArray(temporaryRoom.getQuestions()));
	    String[] questions = this.getTemporaryRoom().getQuestions();
	    for(int i = 0; i < commands.length; i++){
		System.out.println(commands[i] + ": " + questions[i]);
	    }
	}else{
	    for(int i = 0; i < commands.length; i++){
		System.out.println(commands[i]);
	    }
	}
	System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
	System.out.print(">");
    }

    public void clearScreen(){
	Process p;
	try {
	    String[] cmd = { "sh", "/home/user/gitTextAdventure_TwoNight/clear.sh"};
	    p = Runtime.getRuntime().exec(cmd); 
	    p.waitFor(); 
	    BufferedReader reader = new BufferedReader(new InputStreamReader(
									     p.getInputStream())); 
	    String line; 
	    while((line = reader.readLine()) != null) { 
		System.out.println(line);
	    } 
	} catch (IOException e) {
	    e.printStackTrace();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    //check if the user command input is present in mapRooms commands
    public int checkCommands(String [] commands, String command){
	for(int i = 0; i < commands.length; i++){
	    if(commands[i].equals(command)){
		return i;
	    }
	}
	System.out.println("Error: " + command + " not in commands!");
	return -1;
    }

    //checks if the command is a buy/transaction command
    public boolean checkBuy(String s){
	String buff = "";
	for(int i = 0; i < 3; i++){
	    buff += s.charAt(i);
	}
	if(buff.equals("buy")){
	    return true;
	}else{
	    return false;
	}
    }

    public static String[] copyArray(String [] array){
	String[] copy = new String[array.length];
	for(int i = 0; i < array.length; i++){
	    copy[i] = array[i];
	}
	return copy;
    }

    public static int[] copyArray(int [] array){
	int[] copy = new int[array.length];
	for(int i = 0; i < array.length; i++){
	    copy[i] = array[i];
	}
	return copy;
    }
    
    public void setTemporaryWelcome(String s){
	this.temporaryWelcome = s;
    }

    public String getTemporaryWelcome(){
	return this.temporaryWelcome;
    }
    
    public void setTemporaryAnswer(String s){
	this.temporaryAnswer = s;
    }

    public void setTemporaryGameLevel(GameLevel l){
	this.temporaryGameLevel = l;
    }
    
    public void setTemporaryRoom(Room r){
	this.temporaryRoom = r;
    }

    public Room getTemporaryRoom(){
	return this.temporaryRoom;
    }

    public int[] getTemporaryPrices(){
	return this.temporaryPrices;
    }
    
    public void setTemporaryCommands(String[] tc){
	this.temporaryCommands = tc;
    }

    public void setTemporaryQuestions(String[] q){
	this.temporaryQuestions = q;
    }

    public void setTemporaryPrices(int[] p){
	this.temporaryPrices = p;
    }
    
    public void setCommandIndex(int i){
	this.commandIndex = i;
    }

    public void setBufferCommand(String s){
	this.bufferCommand = s;
    }

    public String getBufferCommand(){
	return this.bufferCommand;
    }

    public void setTemporaryFeedback(String[] fb){
	this.temporaryFeedback = fb;
    }

    public ArrayList<GameLevel> getLevelList(){
	return this.levelList;
    }

    public void setPersonBoolean(boolean b){
	this.isPerson = b;
    }	
}
