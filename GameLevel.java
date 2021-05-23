import java.util.ArrayList;
public class GameLevel{
    
    int i;

    private ArrayList<Room> roomList;
    
    public GameLevel(int i){
        this.i = i;
	roomList = new ArrayList<Room>();
    }

    public void addRoom(Room r){
	this.roomList.add(r);
    }

    public Room getRoom(int i){
	return this.roomList.get(i);
    }
}
