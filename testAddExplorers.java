package tests;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import project.GUI;
import project.Game;
import project.Players;
import project.Tile;
import project.TileProperties;
import project.addExplorers;

public class testAddExplorers {
@Test
public void testAdd(){//tests addExplorer method with 2 players.
	GUI gui = new GUI();
	Players player = new Players();
	Game game = new Game(2,player,new TileProperties(gui));
	addExplorers addExplorers = new addExplorers(game,gui,1,player);
	Tile tile = game.getTile(2,2);
	tile.addExplorer(game.turnTracker(),2,2);
	HashMap<String, Integer> expected = new HashMap<String,Integer>();
	expected.put("Player 1", 1);
	expected.put("Player 2", 0);
	HashMap<String,Integer> actual = tile.getMap();
	assertTrue(expected+" was expected. THis was returned: "+actual,actual.equals(expected));
}
@Test
public void testAdd2(){//tests multiple addExplorer calls.
	GUI gui = new GUI();
	Players player = new Players();
	Game game = new Game(2,player,new TileProperties(gui));
	addExplorers addExplorers = new addExplorers(game,gui,1,player);
	Tile tile = game.getTile(2,2);
	tile.addExplorer(game.turnTracker(),2,2);
	tile.addExplorer(game.turnTracker(),2,2);
	tile.addExplorer(game.turnTracker(),2,2);
	HashMap<String, Integer> expected = new HashMap<String,Integer>();
	expected.put("Player 1", 3);
	expected.put("Player 2", 0);
	HashMap<String,Integer> actual = tile.getMap();
	assertTrue(expected+" was expected. THis was returned: "+actual,actual.equals(expected));
}
@Test
public void testAdd3(){//tests if addExplorer affects other tiles.
	GUI gui = new GUI();
	Players player = new Players();
	Game game = new Game(2,player,new TileProperties(gui));
	addExplorers addExplorers = new addExplorers(game,gui,1,player);
	Tile tile = game.getTile(2,2);
	tile.addExplorer(game.turnTracker(),2,2);
	tile.addExplorer(game.turnTracker(),2,2);
	tile.addExplorer(game.turnTracker(),2,2);
	Tile tile2 = game.getTile(4,4);
	HashMap<String, Integer> expected = new HashMap<String,Integer>();
	expected.put("Player 1", 0);
	expected.put("Player 2", 0);
	HashMap<String,Integer> actual = tile2.getMap();
	assertTrue(expected+" was expected. This was actual: "+actual,actual.equals(expected));
}
}
