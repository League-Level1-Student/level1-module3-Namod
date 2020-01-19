package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorldRunner {
public static void main(String[] args) {
	World x = new World(); 
	Bug y = new Bug();
	Flower z = new Flower();
	 x.show();
	 x.add(new Location(5,5), z);
	 x.add(new Location(2,2),y);
	 x.add(new Location(1,1),z);
	 x.add(new Location(6,6),y);
	 x.add(new Location(8,8),y);
	 x.add(new Location(7,7),z);
	 x.add(new Location(4,4), y);
	 x.add(new Location(3,3),z);
	 x.add(new Location(0,0),y);
	 x.add(new Location(9,9),z);
	
}



}
