package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;

public class MoveSouthWest implements ActionListener {
	private Game _game;
	private int _x;
	private int _y;
	private Players _player;
	private GUI _gui;
	private TileProperties _prop;
	public MoveSouthWest(Game game, int x, int y,Players player,GUI gui,TileProperties prop){
		_game = game;
		_x=x;
		_y=y;
		_player=player;
		_gui=gui;
		_prop=prop;
	}
	/*@Override
	public void actionPerformed(ActionEvent e) {
		Tile tile = _game.getTile(_x, _y);
		HashMap<String,Integer> map = _player.getMap();
		if(_x==0){
			
		}else if(map.get(_game.turnTracker())>0&&tile.getAmount(_game.turnTracker())>0&&_x%2==0){
			Tile north = _game.getTile(_x-1, _y+1);
			north.addExplorer(_game.turnTracker(),_x-1,_y+1);
			tile.removeExplorer(_game.turnTracker(), _x, _y);
			_gui.updateExplorers();
		}else if(map.get(_game.turnTracker())>0&&tile.getAmount(_game.turnTracker())>0&&_x%2==1&&_y!=_game.solveForT()-1){
			Tile north = _game.getTile(_x-1, _y);
			north.addExplorer(_game.turnTracker(),_x-1,_y);
			tile.removeExplorer(_game.turnTracker(), _x, _y);
			_gui.updateExplorers();
		}

	}*/
	@Override
	public void actionPerformed(ActionEvent e) {
		Tile tile = _game.getTile(_x, _y);
		HashMap<String,Integer> map = _player.getMap();
		HashMap<ImageIcon,Integer[]> imagemap = _prop.getMap();
		Integer[] integer = imagemap.get(tile.getImageIcon());
		if(_x==0||tile.getImageIcon()==null){
		}else if(_x%2==0){
			Tile southwest = _game.getTile(_x-1, _y+1);
			Integer[] integer1 = imagemap.get(southwest.getImageIcon());
			int x = integer1[0]+integer[2];
			if(southwest.getImageIcon()==null){}
			else if(integer1[0]>0&&integer[2]>0&&map.get(_game.turnTracker())>=x&&tile.getAmount(_game.turnTracker())>0){
			southwest.addExplorer(_game.turnTracker(),_x-1,_y+1);
			tile.removeExplorer(_game.turnTracker(), _x, _y);
			for(int i =0; i<x;i++){
				_player.removeActionPoint(_game.turnTracker());
			}
			if(_player.getMap().get(_game.turnTracker())==0){
				_game.endTurn(_gui);
				_player.resetAction();
			}
			_gui.updateLabel();
			_gui.updateExplorers();}}
		else if(_x%2==1){
			Tile northwest2 = _game.getTile(_x-1, _y);
			Integer[] integer2 = imagemap.get(northwest2.getImageIcon());
			int y = integer[2]+integer2[0];
		if(northwest2.getImageIcon()==null){}
		else if(integer[2]>0&&integer2[0]>0&&map.get(_game.turnTracker())>=y&&tile.getAmount(_game.turnTracker())>0&&_y!=_game.solveForT()-1){
			
			northwest2.addExplorer(_game.turnTracker(),_x-1,_y);
			tile.removeExplorer(_game.turnTracker(), _x, _y);
			for(int i =0; i<y;i++){
				_player.removeActionPoint(_game.turnTracker());
			}
			if(_player.getMap().get(_game.turnTracker())==0){
				_game.endTurn(_gui);
				_player.resetAction();
			}
			_gui.updateLabel();
			_gui.updateExplorers();
		}
	}
	}
}
