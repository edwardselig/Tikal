package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndTurn implements ActionListener {
	private int _turnCounter = 0;
	private Game _game;
	private GUI _gui;
	public EndTurn(Game game,GUI gui){
		_game = game;
		_gui=gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		_game.endTurn(_gui);
	}

}
