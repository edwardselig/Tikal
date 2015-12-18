package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;

public class MoveNorthWest implements ActionListener {
	private Game _game;
	private int _x;
	private int _y;
	private Players _player;
	private GUI _gui;
	private TileProperties _prop;
	public MoveNorthWest(Game game, int x, int y,Players player,GUI gui,TileProperties prop){
		_game = game;
		_x=x;
		_y=y;
		_player=player;
		_gui=gui;
		_prop = prop;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Tile tile = _game.getTile(_x, _y);
		HashMap<String,Integer> map = _player.getMap();
		HashMap<ImageIcon,Integer[]> imagemap = _prop.getMap();
		Integer[] integer = imagemap.get(tile.getImageIcon());
		if(_x==0||tile.getImageIcon()==null){
		}else if(_x%2==0){
			Tile northwest = _game.getTile(_x-1, _y);
			Integer[] integer1 = imagemap.get(northwest.getImageIcon());
			int x = integer1[0]+integer[2];
			if(northwest.getImageIcon()==null){}
			else if(integer1[0]>0&&integer[2]>0&&map.get(_game.turnTracker())>=x&&tile.getAmount(_game.turnTracker())>0){
			northwest.addExplorer(_game.turnTracker(),_x-1,_y);
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
			Tile northwest2 = _game.getTile(_x-1, _y-1);
			Integer[] integer2 = imagemap.get(northwest2.getImageIcon());
			int y = integer[2]+integer2[0];
		if(northwest2.getImageIcon()==null){}
		else if(integer[2]>0&&integer2[0]>0&&map.get(_game.turnTracker())>=y&&tile.getAmount(_game.turnTracker())>0&&_y!=0){
			
			northwest2.addExplorer(_game.turnTracker(),_x-1,_y-1);
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
