package project;

import java.util.HashMap;

import javax.swing.ImageIcon;

public class Tile {
	private int explorerNumber;
	HashMap<String, Integer> explorerAmount;
	String _s;
	Game _game;
	ImageIcon _icon = null;
	private int numberOfPlayers;
	public Tile(int j, String s,Game game){
		_s = s;
		_game = game;
		numberOfPlayers = j;
		explorerAmount = new HashMap<String,Integer>();
		for(int i=0; i<numberOfPlayers; i++){
			explorerAmount.put("Player "+(i+1), 0);
		}
	}
	public void setImageIcon(ImageIcon icon){
		_icon=icon;
	}
	public ImageIcon getImageIcon(){
		if(_icon==null){
			return null;
		}
	return _icon;}
	public String getString(){
		return _s;
	}
	public void setString(String t){
		_s = t;
	}
	public int getAmount(String s){
		return explorerAmount.get(s);
	}
	public void addExplorer(String s,int x, int y){//adds an explorers
		Tile t = _game.getTile(x, y);
		HashMap<String,Integer> map = t.getMap();
		map.put(s, map.get(s)+1);
	}
	public void removeExplorer(String s,int x, int y){//removes an explorer
		Tile t = _game.getTile(x, y);
		HashMap<String,Integer> map = t.getMap();
		map.put(s, map.get(s)-1);
	}
	public HashMap<String,Integer> getMap(){
		return explorerAmount;
	}
	public boolean contains(String s){
		return explorerAmount.containsKey(s);
	}
	public String stringOnLabel(){//changes the string on the correct number of explorers
		String s="";
		for(int i=0;i<numberOfPlayers;i++){
			int j = getAmount("Player "+(i+1));
			if(i==0){
			s = ""+j;
			}
			if(i>0){
				s = s+" "+j;
			}
		}
		return s;
	}
	}
