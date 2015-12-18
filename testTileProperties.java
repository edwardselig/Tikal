package tests;

import static org.junit.Assert.*;

import javax.swing.ImageIcon;

import org.junit.Test;

import project.GUI;
import project.Game;
import project.Players;
import project.Tile;
import project.TileProperties;

public class testTileProperties {
@Test
public void testTileProperties(){
	Players play = new Players();
	GUI gui = new GUI();
	Game game = new Game(gui.getNumberPlayer(),play,new TileProperties(gui));
	Tile tile = new Tile(gui.getNumberPlayer(),"Tile",game);
	TileProperties prop = new TileProperties(gui);
	ImageIcon[] icon = gui.getIcons();
	tile.setImageIcon(icon[1]);
	Integer[] integers = prop.getMap().get(tile.getImageIcon());
	int actual = integers[1];
	int expected = 1;
	assertTrue("actual: "+actual+"expected: "+expected,actual==expected);
}
}
