package project;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;
public class Game {
	ArrayList<ArrayList<Tile>> Board;
	private int _numberPlayers;
	private int _turnCounter = 0;
	private int Height;
	private String _s;
	private Players _player;
	private TileProperties _prop;
	int _firstx;
	int _firsty;
	private String score2;
	private String w;
	int t=0;
	private HashMap<String, Integer> score = new HashMap<String, Integer>();
	public Game(int numberPlayers,Players player,TileProperties prop){
		_prop=prop;
		_numberPlayers= numberPlayers;
		Height = solveForT();
		Board = new ArrayList<ArrayList<Tile>>();
		for(int i = 0; i<Height; i++){
		ArrayList<Tile> column = new ArrayList<Tile>();
		if(i%2==0){
		for(int j=0; j<Height-1; j++){
			Tile tile = new Tile(_numberPlayers, "Empty",this);
			column.add(tile);
		}
		Board.add(column);
		}
		if(i%2==1){
			for(int j = 0; j<Height; j++){
				Tile tile = new Tile(_numberPlayers, "Empty",this);
				column.add(tile);
			}
			Board.add(column);
		}
		}
		for(int k = 1; k<_numberPlayers+1; k++){
			score.put("Player "+k, 0);
		}
	}
	public Tile getTile(int x, int y){//gets the tile
		Tile tile = Board.get(x).get(y);
		return tile;
	}
	public String turnTracker(){//keeps track of whose turn it is
		for(int i = 0; i<_numberPlayers; i++){
			if(_turnCounter%_numberPlayers==i){
				int y = i+1;
				_s = "Player "+y;
				return _s;
			}
		}
		return _s;
	}
	public void increaseTurnCounter(){
		++_turnCounter;
	}
	public int solveForT(){//finds the height
	    double X = (1+Math.sqrt(1-4*2*-30*_numberPlayers))/4;
	    int T = (int)Math.round(X);
	    return T;
	}
	public void endTurn(GUI gui){
		increaseTurnCounter();
		gui.setTurnOutput(_turnCounter%_numberPlayers);
	}
	public boolean canPlace(int x,int y,ImageIcon i){
		HashMap<ImageIcon,Integer[]> map = _prop.getMap();
		Integer[] numbers = map.get(i);
		if(firstTurn()&&t==0){
			t++;
			_firstx=x;
			_firsty=y;
		if(x==0||y==0||x==solveForT()-1){
			return true;
		}
		if(x%2==0){
			if(y==solveForT()-2){
				return true;
			}
		}
		if(x%2==1){
			if(y==solveForT()-1){
				return true;
			}else{
				return false;
			}
		}
		}if(x==0){
			Integer[] northInteger = map.get(this.getTile(x,y-1).getImageIcon());
			Integer[] southInteger = map.get(this.getTile(x,y+1).getImageIcon());
			Integer[] northeastInteger = map.get(this.getTile(x+1,y).getImageIcon());
			Integer[] northeastInteger2 = map.get(this.getTile(x+1,y-1).getImageIcon());
			Integer[] southeastInteger2 = map.get(this.getTile(x+1,y).getImageIcon());
			Integer[] southeastInteger = map.get(this.getTile(x+1,y+1).getImageIcon());
			if(x%2==0){
				if((northInteger[1]>0&&numbers[3]>0)||(southInteger[3]>0&&numbers[1]>0)||(northeastInteger[2]>0&&numbers[0]>0)
						||(southeastInteger[2]>0&&numbers[0]>0)){
				return true;}}
				if(x%2==1){
					if((northInteger[1]>0&&numbers[3]>0)||(southInteger[3]>0&&numbers[1]>0)||(northeastInteger2[2]>2&&numbers[0]>0)
					||(southeastInteger2[2]>0&&numbers[0]>0)){
					return true;}}}
		if(solveForT()-1==x){
			Integer[] northInteger = map.get(this.getTile(x,y-1).getImageIcon());
			Integer[] southInteger = map.get(this.getTile(x,y+1).getImageIcon());
			Integer[] northwestInteger = map.get(this.getTile(x-1,y).getImageIcon());
			Integer[] southwestInteger = map.get(this.getTile(x-1,y+1).getImageIcon());
			Integer[] northwestInteger2 = map.get(this.getTile(x-1,y-1).getImageIcon());
			Integer[] southwestInteger2 = map.get(this.getTile(x-1,y).getImageIcon());
			if(x%2==0){
			if((northInteger[1]>0&&numbers[3]>0)||(southInteger[3]>0&&numbers[1]>0)
					||(northwestInteger[0]>0&&numbers[2]>0)
					||(southwestInteger[0]>0&&numbers[2]>0)){
			return true;}}
			if(x%2==1){
				if((northInteger[1]>0&&numbers[3]>0)||(southInteger[3]>0&&numbers[1]>0)
				||(northwestInteger2[0]>0&&numbers[2]>0)
				||(southwestInteger2[0]>0&&numbers[2]>0)){
				return true;}}
		}
		if(y==0){
			Integer[] southInteger = map.get(this.getTile(x,y+1).getImageIcon());
			Integer[] northeastInteger = map.get(this.getTile(x+1,y).getImageIcon());
			Integer[] northwestInteger = map.get(this.getTile(x-1,y).getImageIcon());
			Integer[] southeastInteger = map.get(this.getTile(x+1,y+1).getImageIcon());
			Integer[] southwestInteger = map.get(this.getTile(x-1,y+1).getImageIcon());
			Integer[] southeastInteger2 = map.get(this.getTile(x+1,y).getImageIcon());
			Integer[] southwestInteger2 = map.get(this.getTile(x-1,y).getImageIcon());
			if(x%2==0){
				if((southInteger[3]>0&&numbers[1]>0)||(northeastInteger[2]>0&&numbers[0]>0)
						||(northwestInteger[0]>0&&numbers[2]>0)||(southeastInteger[2]>0&&numbers[0]>0)
						||(southwestInteger[0]>0&&numbers[2]>0)||x==0){
				return true;}}
				if(x%2==1){
					if((southInteger[3]>0&&numbers[1]>0)
					||(southeastInteger2[2]>0&&numbers[0]>0)
					||(southwestInteger2[0]>0&&numbers[2]>0)||x==0){
					return true;}}
		}
		if(x%2==0&&y==solveForT()-2){
			Integer[] northInteger = map.get(this.getTile(x,y-1).getImageIcon());
			Integer[] northeastInteger = map.get(this.getTile(x+1,y).getImageIcon());
			Integer[] northwestInteger = map.get(this.getTile(x-1,y).getImageIcon());
				if((northInteger[1]>0&&numbers[3]>0)||(northeastInteger[2]>0&&numbers[0]>0)
						||(northwestInteger[0]>0&&numbers[2]>0)){
				return true;}}
			if(x%2==1&&solveForT()-1==y){
				Integer[] northInteger = map.get(this.getTile(x,y-1).getImageIcon());
				Integer[] northeastInteger2 = map.get(this.getTile(x+1,y-1).getImageIcon());
				Integer[] northwestInteger2 = map.get(this.getTile(x-1,y-1).getImageIcon());
				Integer[] southeastInteger2 = map.get(this.getTile(x+1,y).getImageIcon());
				Integer[] southwestInteger2 = map.get(this.getTile(x-1,y).getImageIcon());
				if((northInteger[1]>0&&numbers[3]>0)||(northeastInteger2[2]>2&&numbers[0]>0)
						||(northwestInteger2[0]>0&&numbers[2]>0)||(southeastInteger2[2]>0&&numbers[0]>0)
						||(southwestInteger2[0]>0&&numbers[2]>0)||x==0){
						return true;}
		}
				if(x!=0&&y!=0&&x!=solveForT()-1){
		Integer[] northInteger = map.get(this.getTile(x,y-1).getImageIcon());
		Integer[] southInteger = map.get(this.getTile(x,y+1).getImageIcon());
		Integer[] northeastInteger = map.get(this.getTile(x+1,y).getImageIcon());
		Integer[] northwestInteger = map.get(this.getTile(x-1,y).getImageIcon());
		Integer[] southeastInteger = map.get(this.getTile(x+1,y+1).getImageIcon());
		Integer[] southwestInteger = map.get(this.getTile(x-1,y+1).getImageIcon());
		Integer[] northeastInteger2 = map.get(this.getTile(x+1,y-1).getImageIcon());
		Integer[] northwestInteger2 = map.get(this.getTile(x-1,y-1).getImageIcon());
		Integer[] southeastInteger2 = map.get(this.getTile(x+1,y).getImageIcon());
		Integer[] southwestInteger2 = map.get(this.getTile(x-1,y).getImageIcon());
			if(x%2==0){
			if((northInteger[1]>0&&numbers[3]>0)||(southInteger[3]>0&&numbers[1]>0)||(northeastInteger[2]>0&&numbers[0]>0)
					||(northwestInteger[0]>0&&numbers[2]>0)||(southeastInteger[2]>0&&numbers[0]>0)
					||(southwestInteger[0]>0&&numbers[2]>0)||x==0){
			return true;}}
			if(x%2==1){
				if((northInteger[1]>0&&numbers[3]>0)||(southInteger[3]>0&&numbers[1]>0)||(northeastInteger2[2]>2&&numbers[0]>0)
				||(northwestInteger2[0]>0&&numbers[2]>0)||(southeastInteger2[2]>0&&numbers[0]>0)
				||(southwestInteger2[0]>0&&numbers[2]>0)||x==0){
				return true;}}}
				return false;
	}
	public boolean firstTurn(){
		if(_turnCounter==0){
			return true;
		}
		return false;
	}
	public int getFirstx(){
		return _firstx;
	}
	public int getFirsty(){
		return _firsty;
	}
	public String getScore(){
		int _y=0;
		int _x=0;
		int z=0;
		String w = "";
		for(int i = 0; i<Height; i++){
			if(i%2==0){
			for(int j=0; j<Height-1; j++){
				for(int k = 1; k<_numberPlayers+1; k++){
					if(getTile(i,j).getAmount("Player "+k)>z){
				z = getTile(i,j).getAmount("Player "+k);
				score2 = "Player "+k;
				}
					if(k==_numberPlayers){
						score.put(score2, score.get(score2)+1);
						z=0;
						}
			}
			}}
			if(i%2==1){
				for(int j = 0; j<Height; j++){
					for(int k = 1; k<_numberPlayers+1; k++){
						if(getTile(i,j).getAmount("Player "+k)>z){
					z = getTile(i,j).getAmount("Player "+k);
					score2 = "Player "+k;
					}
						if(k==_numberPlayers){
							score.put(score2, score.get(score2)+1);
							z=0;
							}
				}
				}
			}
	}for(int i = 1; i<_numberPlayers+1;i++){
		w="";
		w = w + "Player "+i+": "+score.get("Player "+i);
		if(i==_numberPlayers+1){
			return w;
		}
	}
	return w;
	}}
