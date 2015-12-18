package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import project.GUI;
import project.Players;

public class testPlayers {
@Test
public void testPoints(){//tests if each intitial value is 8
	
	Players player = new Players();
	//player.removeActionPoint("Player 1");
	int actual = player.getMap().get("Player 1");
	int expected = 12;
	assertTrue("actual: "+actual+"expected: "+expected, actual==expected);
}
@Test
public void testRemovePoints(){
	Players player = new Players();
	player.removeActionPoint("Player 1");
	int actual = player.getMap().get("Player 1");
	int expected = 11;
	assertTrue("actual: "+actual+"expected: "+expected, actual==expected);
}
@Test
public void testRemovePoints2(){
	Players player = new Players();
	player.removeActionPoint("Player 1");
	player.removeActionPoint("Player 1");
	player.removeActionPoint("Player 1");
	player.removeActionPoint("Player 1");
	int actual = player.getMap().get("Player 1");
	int expected = 8;
	assertTrue("actual: "+actual+"expected: "+expected, actual==expected);
}
@Test
public void testRemovePoints3(){
	Players player = new Players();
	player.removeExplorer("Player 1");
	player.removeExplorer("Player 1");
	player.removeExplorer("Player 1");
	player.removeExplorer("Player 1");
	int actual = player.getMap().get("Player 1");
	int expected = 12;
	assertTrue("actual: "+actual+" expected: "+expected, actual==expected);
}
}
