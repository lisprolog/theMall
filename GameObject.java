public class GameObject{

    int index;

    String name;
    
    String [] commands;

    String [] answers;

    String [] flags;

    String welcome;
    
    public GameObject(int i, String s){}

    public String getInfo(){
	return this.welcome;
    }
    
}
