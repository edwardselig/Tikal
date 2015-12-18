package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addExplorers implements ActionListener {
	private Game _game;
	private GUI _gui;
	private int _x;
	private int _y;
	private int _explorerAmount = 0;
	private int _state;
	private Players _player;
	public addExplorers(Game game,GUI gui, int state, Players player){
		_gui=gui;
		_game = game;
		//_x=x;
		//_y=y;
		_state = state;
		_player = player;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {//adds explorer to a tile
		if(_player.getExplorersMap().get(_game.turnTracker())==0||_player.moves(_game.turnTracker())<2){}else{
		Tile tile = _game.getTile(_game.getFirstx(),_game.getFirsty());
		if(tile.getString()=="Terrain"){
			_explorerAmount++;
		tile.addExplorer(_game.turnTracker(),_game.getFirstx(),_game.getFirsty());
		_gui.updateExplorers();
		_player.removeActionPoint(_game.turnTracker());
		_player.removeActionPoint(_game.turnTracker());
		_player.removeExplorer(_game.turnTracker());
		_gui.updateLabel();
		_gui.updateLabel2();
		if(_player.moves(_game.turnTracker())==0){
			_game.endTurn(_gui);
			_player.getMap().put(_game.turnTracker(), 12);
			//_gui.setLabel();
		}
		}
		}
	}
}
