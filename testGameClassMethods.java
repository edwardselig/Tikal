package tests;

import static org.junit.Assert.*;

import javax.swing.ImageIcon;

import org.junit.Test;

import project.GUI;
import project.Game;
import project.Players;
import project.Tile;
import project.TileProperties;

public class TestGameClassMethods {
@Test
public void TestCanPlace1(){
	Players play = new Players();
	GUI gui = new GUI();
	TileProperties prop = new TileProperties(gui);
	Game game = new Game(2,play,prop);
	ImageIcon[] i = gui.getIcons();
	//Tile tile = new Tile(2,"Terrain",game);
	Tile tile = game.getTile(2,3);
	tile.setImageIcon(i[5]);
	boolean actual = game.canPlace(3, 3, i[5]);
	boolean expected = false;
	assertTrue("actual: "+actual+" expected: "+expected,expected==actual);
}
@Test
public void getScore(){
	Players play = new Players();
	GUI gui = new GUI();
	TileProperties prop = new TileProperties(gui);
	Game game = new Game(2,play,prop);
	Tile t = game.getTile(2, 3);
	t.addExplorer("Player 1", 2, 3);
	t.addExplorer("Player 1", 2, 3);
	t.addExplorer("player 2,",2,3);
	String actual = game.getScore();
	String expected = "";
	assertTrue("actual: "+actual+" expected: "+expected,expected==actual);
}
@Test
public void firstTurn(){
	Players play = new Players();
	GUI gui = new GUI();
	TileProperties prop = new TileProperties(gui);
	Game game = new Game(2,play,prop);
	boolean expected = true;
	boolean actual = game.firstTurn();
	assertTrue("actual: "+actual+" expected: "+expected,expected==actual);
}
@Test
public void firstTurn2(){
	Players play = new Players();
	GUI gui = new GUI();
	TileProperties prop = new TileProperties(gui);
	Game game = new Game(2,play,prop);
	game.endTurn(gui);
	boolean expected = false;
	boolean actual = game.firstTurn();
	assertTrue("actual: "+actual+" expected: "+expected,expected==actual);
}
}
