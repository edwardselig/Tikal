package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import project.GUI;
import project.Players;
import project.TileProperties;
public class TestSolveForT {
	@Test
	public void testSolveForT(){
		Players player = new Players();
		GUI gui = new GUI();
		project.Game game = new project.Game(2,player,new TileProperties(gui));//
		int actual = game.solveForT();
		int expected = 6;
		assertTrue("The actual answer was "+actual, actual==expected);
	}
	@Test
	public void testSolveForT2(){
		Players player = new Players();
		GUI gui = new GUI();
		project.Game game = new project.Game(5,player,new TileProperties(gui));//
		int actual = game.solveForT();
		int expected = 9;
		assertTrue("The actual answer was "+actual, actual==expected);
		}	
	
}
