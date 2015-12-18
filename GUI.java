package project;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

import javax.swing.JOptionPane;

public class GUI extends JFrame {
	private int _height;
	private int numberPlayers;
	private int numberPlayers2;
	private JPanel gui;
	private JLabel _tileLabel;
	private Game _game;
	private String _explorers;
	private int _t=0;
	private int _state=1;
	private TileProperties prop;
	private ArrayList<String> names = new ArrayList<String>();
	private JLabel _output = new JLabel();
	private JLabel Player;
	private JLabel Player2;
	private ArrayList<JLabel> players = new ArrayList<JLabel>();
	private ArrayList<JLabel> players2 = new ArrayList<JLabel>();
	JButton[][] Buttons;
	JLabel[][] Tiles;
	Players new_round = new Players();
	private JPanel gameboard;
	
	
	ImageIcon[] tileArray0 = new ImageIcon[1];{
		tileArray0[0] = new ImageIcon("TileImages/Blank_.png");
	}
	ImageIcon[] tileArray1 = new ImageIcon[4];{
		tileArray1[0] = new ImageIcon("TileImages/1path/1_a.png");
		tileArray1[1] = new ImageIcon("TileImages/1path/1_b.png");
		tileArray1[2] = new ImageIcon("TileImages/1path/1_c.png");
		tileArray1[3] = new ImageIcon("TileImages/1path/1_d.png");
	}
	ImageIcon[] tileArray2 = new ImageIcon[4];{
		tileArray2[0] = new ImageIcon("TileImages/1path/2_a.png");
		tileArray2[1] = new ImageIcon("TileImages/1path/2_b.png");
		tileArray2[2] = new ImageIcon("TileImages/1path/2_c.png");
		tileArray2[3] = new ImageIcon("TileImages/1path/2_d.png");
	}
	ImageIcon[] tileArray3 = new ImageIcon[4];{	
		tileArray3[0] = new ImageIcon("TileImages/2paths/3_a.png");
		tileArray3[1] = new ImageIcon("TileImages/2paths/3_b.png");
		tileArray3[2] = new ImageIcon("TileImages/2paths/3_c.png");
		tileArray3[3] = new ImageIcon("TileImages/2paths/3_d.png");
	}
	ImageIcon[] tileArray4 = new ImageIcon[4];{
		tileArray4[0] = new ImageIcon("TileImages/2paths/4_a.png");
		tileArray4[1] = new ImageIcon("TileImages/2paths/4_b.png");
		tileArray4[2] = new ImageIcon("TileImages/2paths/4_c.png");
		tileArray4[3] = new ImageIcon("TileImages/2paths/4_d.png");
	}
	ImageIcon[] tileArray5 = new ImageIcon[4];{
		tileArray5[0] = new ImageIcon("TileImages/2paths/5_a.png");
		tileArray5[1] = new ImageIcon("TileImages/2paths/5_b.png");
		tileArray5[2] = new ImageIcon("TileImages/2paths/5_c.png");
		tileArray5[3] = new ImageIcon("TileImages/2paths/5_d.png");
	}
	ImageIcon[] tileArray6 = new ImageIcon[4];{
		tileArray6[0] = new ImageIcon("TileImages/2paths/6_a.png");
		tileArray6[1] = new ImageIcon("TileImages/2paths/6_b.png");
		tileArray6[2] = new ImageIcon("TileImages/2paths/6_c.png");
		tileArray6[3] = new ImageIcon("TileImages/2paths/6_d.png");
	}
	ImageIcon[] tileArray7 = new ImageIcon[4];{
		tileArray7[0] = new ImageIcon("TileImages/2paths/7_a.png");
		tileArray7[1] = new ImageIcon("TileImages/2paths/7_b.png");
		tileArray7[2] = new ImageIcon("TileImages/2paths/7_c.png");
		tileArray7[3] = new ImageIcon("TileImages/2paths/7_d.png");
	}
	ImageIcon[] tileArray8 = new ImageIcon[4];{
		tileArray8[0] = new ImageIcon("TileImages/3paths/8_a.png");
		tileArray8[1] = new ImageIcon("TileImages/3paths/8_b.png");
		tileArray8[2] = new ImageIcon("TileImages/3paths/8_c.png");
		tileArray8[3] = new ImageIcon("TileImages/3paths/8_d.png");
	}
	ImageIcon[] tileArray9 = new ImageIcon[4];{
		tileArray9[0] = new ImageIcon("TileImages/3paths/9_a.png");
		tileArray9[1] = new ImageIcon("TileImages/3paths/9_b.png");
		tileArray9[2] = new ImageIcon("TileImages/3paths/9_c.png");
		tileArray9[3] = new ImageIcon("TileImages/3paths/9_d.png");
	}
	ImageIcon[] tileArray10 = new ImageIcon[4];{
		tileArray10[0] = new ImageIcon("TileImages/3paths/10_a.png");
		tileArray10[1] = new ImageIcon("TileImages/3paths/10_b.png");
		tileArray10[2] = new ImageIcon("TileImages/3paths/10_c.png");
		tileArray10[3] = new ImageIcon("TileImages/3paths/10_d.png");
	}
	ImageIcon[] tileArray11 = new ImageIcon[4];{
		tileArray11[0] = new ImageIcon("TileImages/3paths/11_a.png");
		tileArray11[1] = new ImageIcon("TileImages/3paths/11_b.png");
		tileArray11[2] = new ImageIcon("TileImages/3paths/11_c.png");
		tileArray11[3] = new ImageIcon("TileImages/3paths/11_d.png");
	}
	ImageIcon[] tileArray12 = new ImageIcon[4];{
		tileArray12[0] = new ImageIcon("TileImages/3paths/12_a.png");
		tileArray12[1] = new ImageIcon("TileImages/3paths/12_b.png");
		tileArray12[2] = new ImageIcon("TileImages/3paths/12_c.png");
		tileArray12[3] = new ImageIcon("TileImages/3paths/12_d.png");
	}
	ImageIcon[] tileArray13 = new ImageIcon[4];{
		tileArray13[0] = new ImageIcon("TileImages/3paths/13_a.png");
		tileArray13[1] = new ImageIcon("TileImages/3paths/13_b.png");
		tileArray13[2] = new ImageIcon("TileImages/3paths/13_c.png");
		tileArray13[3] = new ImageIcon("TileImages/3paths/13_d.png");
	}
	ImageIcon[] tileArray14 = new ImageIcon[4];{
		tileArray14[0] = new ImageIcon("TileImages/3paths/14_a.png");
		tileArray14[1] = new ImageIcon("TileImages/3paths/14_b.png");
		tileArray14[2] = new ImageIcon("TileImages/3paths/14_c.png");
		tileArray14[3] = new ImageIcon("TileImages/3paths/14_d.png");
	}
	ImageIcon[] tileArray15 = new ImageIcon[1];{
		tileArray15[0] = new ImageIcon("TileImages/Volcano");
	}

	ImageIcon[] allTiles = new ImageIcon[58];{
		allTiles[0] = new ImageIcon("TileImages/Blank_.png");
		
		allTiles[1] = new ImageIcon("TileImages/1path/1_a.png");
		allTiles[2] = new ImageIcon("TileImages/1path/1_b.png");
		allTiles[3] = new ImageIcon("TileImages/1path/1_c.png");
		allTiles[4] = new ImageIcon("TileImages/1path/1_d.png");
		
		allTiles[5] = new ImageIcon("TileImages/1path/2_a.png");
		allTiles[6] = new ImageIcon("TileImages/1path/2_b.png");
		allTiles[7] = new ImageIcon("TileImages/1path/2_c.png");
		allTiles[8] = new ImageIcon("TileImages/1path/2_d.png");
		
		allTiles[9] = new ImageIcon("TileImages/2paths/3_a.png");
		allTiles[10] = new ImageIcon("TileImages/2paths/3_b.png");
		allTiles[11] = new ImageIcon("TileImages/2paths/3_c.png");
		allTiles[12] = new ImageIcon("TileImages/2paths/3_d.png");
	
		allTiles[13] = new ImageIcon("TileImages/2paths/4_a.png");
		allTiles[14] = new ImageIcon("TileImages/2paths/4_b.png");
		allTiles[15] = new ImageIcon("TileImages/2paths/4_c.png");
		allTiles[16] = new ImageIcon("TileImages/2paths/4_d.png");

		allTiles[17] = new ImageIcon("TileImages/2paths/5_a.png");
		allTiles[18] = new ImageIcon("TileImages/2paths/5_b.png");
		allTiles[19] = new ImageIcon("TileImages/2paths/5_c.png");
		allTiles[20] = new ImageIcon("TileImages/2paths/5_d.png");

		allTiles[21] = new ImageIcon("TileImages/2paths/6_a.png");
		allTiles[22] = new ImageIcon("TileImages/2paths/6_b.png");
		allTiles[23] = new ImageIcon("TileImages/2paths/6_c.png");
		allTiles[24] = new ImageIcon("TileImages/2paths/6_d.png");

		allTiles[25] = new ImageIcon("TileImages/2paths/7_a.png");
		allTiles[26] = new ImageIcon("TileImages/2paths/7_b.png");
		allTiles[27] = new ImageIcon("TileImages/2paths/7_c.png");
		allTiles[28] = new ImageIcon("TileImages/2paths/7_d.png");

		allTiles[29] = new ImageIcon("TileImages/3paths/8_a.png");
		allTiles[30] = new ImageIcon("TileImages/3paths/8_b.png");
		allTiles[31] = new ImageIcon("TileImages/3paths/8_c.png");
		allTiles[32] = new ImageIcon("TileImages/3paths/8_d.png");

		allTiles[33] = new ImageIcon("TileImages/3paths/9_a.png");
		allTiles[34] = new ImageIcon("TileImages/3paths/9_b.png");
		allTiles[35] = new ImageIcon("TileImages/3paths/9_c.png");
		allTiles[36] = new ImageIcon("TileImages/3paths/9_d.png");
	
		allTiles[37] = new ImageIcon("TileImages/3paths/10_a.png");
		allTiles[38] = new ImageIcon("TileImages/3paths/10_b.png");
		allTiles[39] = new ImageIcon("TileImages/3paths/10_c.png");
		allTiles[40] = new ImageIcon("TileImages/3paths/10_d.png");
	
		allTiles[41] = new ImageIcon("TileImages/3paths/11_a.png");
		allTiles[42] = new ImageIcon("TileImages/3paths/11_b.png");
		allTiles[43] = new ImageIcon("TileImages/3paths/11_c.png");
		allTiles[44] = new ImageIcon("TileImages/3paths/11_d.png");
	
		allTiles[45] = new ImageIcon("TileImages/3paths/12_a.png");
		allTiles[46] = new ImageIcon("TileImages/3paths/12_b.png");
		allTiles[47] = new ImageIcon("TileImages/3paths/12_c.png");
		allTiles[48] = new ImageIcon("TileImages/3paths/12_d.png");
	
		allTiles[49] = new ImageIcon("TileImages/3paths/13_a.png");
		allTiles[50] = new ImageIcon("TileImages/3paths/13_b.png");
		allTiles[51] = new ImageIcon("TileImages/3paths/13_c.png");
		allTiles[52] = new ImageIcon("TileImages/3paths/13_d.png");

		allTiles[53] = new ImageIcon("TileImages/3paths/14_a.png");
		allTiles[54] = new ImageIcon("TileImages/3paths/14_b.png");
		allTiles[55] = new ImageIcon("TileImages/3paths/14_c.png");
		allTiles[56] = new ImageIcon("TileImages/3paths/14_d.png");
		allTiles[57] = new ImageIcon("TileImages/Volcano.png");
	
	}

	

	public GUI() {
	    gui = new JPanel(new FlowLayout());
	    prop = new TileProperties(this);
	    gui.add(_output);
	    String temp = JOptionPane.showInputDialog(null, "Enter number of players");
	    numberPlayers = Integer.parseInt(temp);
	    numberPlayers2 = numberPlayers;
	    _height = solveForT(numberPlayers);
	    _game = new Game(numberPlayers,new_round,prop);
	    do{
	    String _playerNames = JOptionPane.showInputDialog(null,"Player name");
	    names.add(_playerNames);
	        Player = new JLabel(_playerNames+": Moves left: " + new_round.moves("Player 1"));
	        Player2 = new JLabel(_playerNames+": Explorers left: " + new_round.getExplorersMap().get("Player 1"));
	        players2.add(Player2);
	        players.add(Player);
	        gui.add(Player);
	        gui.add(Player2);
	    numberPlayers = (numberPlayers - 1);
	    }while(numberPlayers>0);
	    _output.setText(names.get(0)+" starts!");
	    Buttons = new JButton[_height][];{
	        for(int i = 0; i<_height; i++){
	            if(i%2==0){
	                Buttons[i] = new JButton[_height-1];
	            }
	            if(i%2==1){
	                Buttons[i] = new JButton[_height];
	            }
	        }
	    }
	    Tiles = new JLabel[_height][];{
	        for(int i = 0; i<_height; i++){
	            if(i%2==0){
	                Tiles[i] = new JLabel[_height-1];
	            }
	            if(i%2==1){
	                Tiles[i] = new JLabel[_height];
	            }
	        }
	    }
	setTitle("Tikal");
	setSize(1500,700);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	GameBar();
	setLayout(new GridLayout(1,1));
	    for(int i = 0; i<_height; i++){
	        if(i%2==0){
	            JLabel Row=new JLabel();
	            set_rows(Row,i+1,_height-1);
	        }
	        if(i%2==1){
	            JLabel Rows=new JLabel();
	            set_rows(Rows,i+1,_height);
	        }
	    }
	//JButton bn = new JButton("Hiii");
	//goes columns by rows
	//Buttons[0][1].setText("Tikal");
	//ImageIcon tile1 = new ImageIcon("_images/1p1b.png");
	//Buttons[4][4].setIcon(tileArray[randomValue]);
	}

	public void GameBar(){
	/*Make the Menu Bar, Acts independently of the tiles!*/
	add(gui);
	gui.setBorder(new EmptyBorder(5, 5, 1, 1));
	JToolBar tools = new JToolBar();
	tools.setFloatable(false);
	gui.add(tools, BorderLayout.PAGE_START);
	//JLabel Player_1 = new JLabel("Player 1: Moves left: " + new_round.moves("Player1"));
	//JLabel Player_2 = new JLabel("Player 2: Moves left: " + new_round.moves("Player1"));
	//gui.add(Player_1);gui.add(Player_2);
	tools.add(new JButton("Restore"));
	tools.add(new JButton("Save"));
	tools.addSeparator();

	JToolBar tools2 = new JToolBar();
	tools2.setFloatable(false);
	gui.add(tools2, BorderLayout.PAGE_START);
	JButton b1 = new JButton("Place Explorer");
	b1.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			_state = 1;
		}
		
	});
	tools2.add(b1);
	JButton endTurn = new JButton("End Turn");
	endTurn.addActionListener(new EndTurn(_game,this));
	tools2.add(endTurn);
	
	JToolBar tools3 = new JToolBar();
	tools3.setFloatable(false);
	gui.add(tools3, BorderLayout.PAGE_START);
	tools3.add(new JButton("Place Pyramid Piece"));

	JToolBar tools4 = new JToolBar();
	tools4.setFloatable(false);
	gui.add(tools4, BorderLayout.PAGE_START);
	JButton b = new JButton("Get Score");
	b.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			_output.setText(_game.getScore());
		}
	});
	tools4.add(b);

	JToolBar tools7 = new JToolBar();
	tools7.setFloatable(false);
	gui.add(tools7);
	tools7.setLayout(new BoxLayout(tools7, BoxLayout.PAGE_AXIS));
	
final JButton b2 = new JButton("Random Tile");
		tools7.add(b2);
		
		final JLabel L1 = new JLabel();
		final JLabel L2 = new JLabel();
		final JLabel L3 = new JLabel();
		final JLabel L4 = new JLabel();
		tools7.add(L1);
		tools7.add(L2);
		tools7.add(L3);
		tools7.add(L4);
		b2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {

				int randomValue = randomTile();
				if (randomValue==15){
					b2.setText("Random Tile");
					L1.setIcon(tileArray0[0]);
					L2.setText("");
					L3.setText("");
					L4.setText("");
				}
				if (randomValue==1){
					b2.setText("Random Tile");
					L1.setIcon(tileArray1[0]);
					L2.setIcon(tileArray1[1]);
					L3.setIcon(tileArray1[2]);
					L4.setIcon(tileArray1[3]);
				}
				if (randomValue==2){
					b2.setText("Random Tile");
					L1.setIcon(tileArray2[0]);
					L2.setIcon(tileArray2[1]);
					L3.setIcon(tileArray2[2]);
					L4.setIcon(tileArray2[3]);
				}
				if(randomValue==3){
					b2.setText("Random Tile");
					L1.setIcon(tileArray3[0]);
					L2.setIcon(tileArray3[1]);
					L3.setIcon(tileArray3[2]);
					L4.setIcon(tileArray3[3]);
				}
				if(randomValue==4){
					b2.setText("Random Tile");
					L1.setIcon(tileArray4[0]);
					L2.setIcon(tileArray4[1]);
					L3.setIcon(tileArray4[2]);
					L4.setIcon(tileArray4[3]);
				}
				if(randomValue==5){
					b2.setText("Random Tile");
					L1.setIcon(tileArray5[0]);
					L2.setIcon(tileArray5[1]);
					L3.setIcon(tileArray5[2]);
					L4.setIcon(tileArray5[3]);
				}
				if(randomValue==6){
					b2.setText("Random Tile");
					L1.setIcon(tileArray6[0]);
					L2.setIcon(tileArray6[1]);
					L3.setIcon(tileArray6[2]);
					L4.setIcon(tileArray6[3]);
				}
				if(randomValue==7){
					b2.setText("Random Tile");
					L1.setIcon(tileArray7[0]);
					L2.setIcon(tileArray7[1]);
					L3.setIcon(tileArray7[2]);
					L4.setIcon(tileArray7[3]);
				}
				if(randomValue==8){
					b2.setText("Random Tile");
					L1.setIcon(tileArray8[0]);
					L2.setIcon(tileArray8[1]);
					L3.setIcon(tileArray8[2]);
					L4.setIcon(tileArray8[3]);
				}
				if(randomValue==9){
					b2.setText("Random Tile");
					L1.setIcon(tileArray9[0]);
					L2.setIcon(tileArray9[1]);
					L3.setIcon(tileArray9[2]);
					L4.setIcon(tileArray9[3]);
				}
				if(randomValue==10){
					b2.setText("Random Tile");
					L1.setIcon(tileArray10[0]);
					L2.setIcon(tileArray10[1]);
					L3.setIcon(tileArray10[2]);
					L4.setIcon(tileArray10[3]);
				}
				if(randomValue==11){
					b2.setText("Random Tile");
					L1.setIcon(tileArray11[0]);
					L2.setIcon(tileArray11[1]);
					L3.setIcon(tileArray11[2]);
					L4.setIcon(tileArray11[3]);
				}
				if(randomValue==12){
					b2.setText("Random Tile");
					L1.setIcon(tileArray12[0]);
					L2.setIcon(tileArray12[1]);
					L3.setIcon(tileArray12[2]);
					L4.setIcon(tileArray12[3]);
				}
				if(randomValue==13){
					b2.setText("Random Tile");
					L1.setIcon(tileArray13[0]);
					L2.setIcon(tileArray13[1]);
					L3.setIcon(tileArray13[2]);
					L4.setIcon(tileArray13[3]);
				}
				if(randomValue==14){
					b2.setText("Random Tile");
					L1.setIcon(tileArray14[0]);
					L2.setIcon(tileArray14[1]);
					L3.setIcon(tileArray14[2]);
					L4.setIcon(tileArray14[3]);
				}
				if(randomValue==16){
					b2.setText("RandomTile");
					L1.setIcon(tileArray15[0]);
					
				}
			}
		});
		
	}


	private void set_rows(JLabel Row, int columns,int rows){
		/*This Allowed for easy use of a method that made labels easy to create*/
		Row.setLayout(new GridLayout(rows,1));
		add(Row);
		Tiles(Row,columns,rows);
	}

	private void Tiles(JLabel label, int colmns, int rows){
		/*Best way to create 31 tiles*/
		final int fcolmns = colmns;
		
		for(int i = 0; i<rows; i++){
			final int fi = i;
			JLabel l = new JLabel("",JLabel.CENTER);
			JButton Bn = new JButton();
			JButton A = new JButton("add");
			JButton N = new JButton("N");
			JToolBar tools2 = new JToolBar();
			tools2.setFloatable(false);
			N.addActionListener(new MoveNorth(_game,fcolmns-1,fi,new_round,this,prop));
			JButton S = new JButton("S");
			S.addActionListener(new MoveSouth(_game,fcolmns-1,fi,new_round,this,prop));
			JButton northeast = new JButton("NE");
			northeast.addActionListener(new MoveNorthEast(_game,fcolmns-1,fi,new_round,this,prop));
			JButton SE = new JButton("SE");
			SE.addActionListener(new MoveSouthEast (_game,fcolmns-1,fi,new_round,this,prop));
			JButton SW = new JButton("SW");
			SW.addActionListener(new MoveSouthWest(_game,fcolmns-1,fi,new_round,this,prop));
			JButton NW = new JButton("NW");
			NW.addActionListener(new MoveNorthWest(_game,fcolmns-1,fi,new_round,this,prop));
			final JLabel C = new JLabel();
			final GUI x = this;
			A.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(new_round.moves(_game.turnTracker())<6){}else{
						String tempTile = JOptionPane.showInputDialog(null,"Number of tile would you like to place? - then click larger JButton to place tile");
						final int tilePlacement = Integer.parseInt(tempTile);
					if(_game.canPlace(fcolmns-1, fi,allTiles[tilePlacement])){
					Buttons[fcolmns-1][fi].setIcon(allTiles[tilePlacement]);
					_game.getTile(fcolmns-1,fi).setImageIcon(allTiles[tilePlacement]);
					_game.getTile(fcolmns-1, fi).setString("Terrain");
					new_round.removeActionPoint(_game.turnTracker());
					new_round.removeActionPoint(_game.turnTracker());
					new_round.removeActionPoint(_game.turnTracker());
					new_round.removeActionPoint(_game.turnTracker());
					new_round.removeActionPoint(_game.turnTracker());
					new_round.removeActionPoint(_game.turnTracker());
					updateLabel();
					if(new_round.getMap().get(_game.turnTracker())==0){
						_game.endTurn(x);
						setLabel();
						new_round.getMap().put(_game.turnTracker(),12);
					}
						}}}
					});	
			l.setBorder( BorderFactory.createLineBorder(Color.blue, 1));
			label.add(l);
			Bn.setLayout(new FlowLayout(FlowLayout.CENTER));
			tools2.setLayout(new GridLayout(4,2));
			tools2.add(A);
			tools2.add(N);
			tools2.add(S);
			tools2.add(northeast);
			tools2.add(SE);
			tools2.add(SW);
			tools2.add(NW);
			Bn.add(tools2,BorderLayout.CENTER);
			Bn.add(C);
			l.add(Bn);
			Tiles[colmns-1][i] = l;
			Buttons[colmns-1][i]=Bn;
			Bn.addActionListener(new addExplorers(_game,this,_state,new_round));
			l.setLayout(new GridLayout(1,1));
		}
	}
	
	public int solveForT(int i){
	    double X = (1+Math.sqrt(1-4*2*-30*i))/4;
	    int T = (int)Math.round(X);
	    return T;
	}

	public int randomTile(){	
		Random random = new Random();
		int min = 0;
		int max = 15;
		int randomInteger = random.nextInt(max - min)+min;
		return randomInteger;
	}
	public int getNumberPlayer(){
		return numberPlayers;
	}
	public ImageIcon[] getIcons(){
		return allTiles;
	}
	public void updateExplorers(String s, int y, int x){//sets the text of JLabel
		Component comp = Buttons[x][y].getComponent(1);
		if(comp instanceof JLabel){
			JLabel l = (JLabel)Buttons[x][y].getComponent(1);
			l.setText(s);
		}
		
	}
	public void updateExplorers(){//changes the label to the correct amount of explorers
		for(int i = 0; i<_height; i++){
	        if(i%2==0){
	            for(int j = 0; j<_height-1; ++j){
	            		String s = _game.getTile(i,j).stringOnLabel();
	            	updateExplorers(s,j,i);
	            }
	        }
	        if(i%2==1){
	  	            for(int j = 0; j<_height; ++j){
	  	            		String s = _game.getTile(i,j).stringOnLabel();
	  	            	updateExplorers(s,j,i);
	  	         }
	    }
	}
}
	public void setTurnOutput(int x){//makes the output the name of the person's turn it is.
		_output.setText(names.get(x)+"'s turn");
	}
	public void updateLabel(){//changes the amount of action points a user has.
		for(int i = 1; i<numberPlayers2+1; i++){
			players.get(i-1).setText(names.get(i-1)+": Moves left: "+new_round.getMap().get("Player "+i));
		}
	}
	public void setLabel(){//sets the action points back to 8
		for(int i = 1; i<numberPlayers2+1;i++){
			players.get(i-1).setText(names.get(i-1)+": Moves left: 12");
		}
	}
	public void updateLabel2(){//changes the amount of action points a user has.
		for(int i = 1; i<numberPlayers2+1; i++){
			players2.get(i-1).setText(names.get(i-1)+": Explorers left: "+new_round.getExplorersMap().get("Player "+i));
		}
	}
}
