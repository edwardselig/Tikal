package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;

public class MoveSouth implements ActionListener {
	private Game _game;
	private int _x;
	private int _y;
	private Players _player;
	private GUI _gui;
	private TileProperties _prop;
	public MoveSouth(Game game, int x, int y,Players player,GUI gui,TileProperties prop){
		_game = game;
		_x=x;
		_y=y;
		_player=player;
		_gui=gui;
		_prop=prop;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Tile tile = _game.getTile(_x, _y);
		Tile tile2 = _game.getTile(_x, _y+1);
		HashMap<String,Integer> map = _player.getMap();
		HashMap<ImageIcon,Integer[]> imageMap = _prop.getMap();
		Integer[] integers = imageMap.get(tile.getImageIcon());
		Integer[] integers1 = imageMap.get(tile2.getImageIcon());
		int x = integers[1]+integers1[3];
		if(tile.getImageIcon()==null||tile2.getImageIcon()==null){}
		else if(integers[1]>0&&integers1[3]>0&&map.get(_game.turnTracker())>=x){
		if(tile.getAmount(_game.turnTracker())>0&& _y!= _game.solveForT()-1){
			tile2.addExplorer(_game.turnTracker(),_x,_y+1);
			tile.removeExplorer(_game.turnTracker(), _x, _y);
			for(int i =0; i<x;i++){
				_player.removeActionPoint(_game.turnTracker());
			}
			if(map.get(_game.turnTracker())==0){
				_game.endTurn(_gui);
				_player.resetAction();
			}
			_gui.updateLabel();
			_gui.updateExplorers();
		}
		}
	}

}
