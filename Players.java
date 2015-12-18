package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.ImageIcon;



public class Players {
//nested HashMap
//i.e. HashSet put in a HashMap
HashMap<String, HashSet<Integer>> moves = new HashMap<String, HashSet<Integer>>();
HashMap<String, Integer> Action_points = new HashMap<String, Integer>();
HashMap<String, Integer> Explorers = new HashMap<String, Integer>();
HashMap<Integer, Integer> PyramidTypes = new HashMap<Integer, Integer>();

public Players(){
	Action_points.put("Player 1", 12);
	Action_points.put("Player 2", 12);
	Action_points.put("Player 3", 12);
	Action_points.put("Player 4", 12);
	Action_points.put("Player 5", 12);
	
	Explorers.put("Player 1", 10);
	Explorers.put("Player 2", 10);
	Explorers.put("Player 3", 10);
	Explorers.put("Player 4", 10);
	Explorers.put("Player 5", 10);
	
	
}
public int moves(String s){
return Action_points.get(s);
}

public void resetAction(){
	Action_points.put("Player 1", 12);
	Action_points.put("Player 2", 12);
	Action_points.put("Player 3", 12);
	Action_points.put("Player 4", 12);
	Action_points.put("Player 5", 12);
}

public HashMap<Integer, Integer> Pyramid_Types(){
PyramidTypes.put(1, 8);
PyramidTypes.put(2, 6);
PyramidTypes.put(3, 4);
PyramidTypes.put(4, 2);
int[] PyramidType= new int[4];
return PyramidTypes;
}
public void removeActionPoint(String s){
	int x = Action_points.get(s);
	int y = x-1;
	Action_points.put(s, y);
}

public void removeExplorer(String s){
	int x = Explorers.get(s);
	int y = x-1;
	Explorers.put(s, y);
}
public HashMap<String, Integer> getMap(){
	return Action_points;
}
public HashMap<String, Integer> getExplorersMap(){
	return Explorers;
}

}
