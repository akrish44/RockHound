import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import java.awt.Color;
import java.util.ArrayList;


public class RockHound extends Critter {

	public void processActors(ArrayList<Actor> actors)
	{
	    for (Actor a : actors)
	    {
	        if ((a instanceof Rock) && !(a instanceof Critter))
	            a.removeSelfFromGrid();
	    }
	}	

	

}