package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import project.GUI;
import project.Players;
import project.TileProperties;

public class testTurnCounter {
@Test
public void testTurnCounter(){//Testing the initial value for 2 players.
	Players player = new Players();
	GUI gui = new GUI();
	project.Game game = new project.Game(2,player,new TileProperties(gui));
	String actual = game.turnTracker();
	String expected = "Player 1";
	assertTrue("The actual value is "+actual,actual.equals(expected));
}
@Test
public void testTurnCounter2(){//Test 
	Players player = new Players();
	GUI gui = new GUI();
	project.Game game = new project.Game(5,player,new TileProperties(gui));
	game.increaseTurnCounter();
	game.increaseTurnCounter();
	game.increaseTurnCounter();
	String actual = game.turnTracker();
	String expected = "Player 4";
	assertTrue("The actual value is "+actual,actual.equals(expected));
}
}
