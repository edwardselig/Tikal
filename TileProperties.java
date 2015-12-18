package project;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;

public class TileProperties {
	GUI _gui;
	HashMap<ImageIcon,Integer[]> imageMap = new HashMap<ImageIcon,Integer[]>();
	public TileProperties(GUI gui){
		_gui=gui;
		ImageIcon[] icons = _gui.getIcons();//the first value in array represents the amount of paths going east
		Integer[] tile1 = {0,1,0,0};//the second value in array represents the amount of paths going south
		Integer[] tile2 = {1,0,0,0};//the third value in array represents the amount of paths going west
		Integer[] tile3 = {0,0,0,1};//the fourth value in array represents the amount of paths going north
		Integer[] tile4 = {0,0,1,0};
		Integer[] tile5 = {0,2,0,0};
		Integer[] tile6 = {2,0,0,0};
		Integer[] tile7 = {0,0,0,2};
		Integer[] tile8 = {0,0,2,0};
		Integer[] tile9 = {2,1,0,0};
		Integer[] tile10 = {1,0,0,2};
		Integer[] tile11 = {0,0,2,1};
		Integer[] tile12 = {0,2,1,0};
		Integer[] tile13 = {1,0,0,1};
		Integer[] tile14 = {0,0,1,1};
		Integer[] tile15 = {0,1,1,0};
		Integer[] tile16 = {1,1,0,0};
		Integer[] tile17 = {1,0,0,2};
		Integer[] tile18 = {2,0,0,1};
		Integer[] tile19 = {0,0,1,2};
		Integer[] tile20 = {0,1,2,0};
		Integer[] tile21 = {2,2,0,0};
		Integer[] tile22 = {2,0,0,2};
		Integer[] tile23 = {0,0,2,2};
		Integer[] tile24 = {0,2,2,0};
		Integer[] tile25 = {1,1,0,1};
		Integer[] tile26 = {1,0,1,1};
		Integer[] tile27 = {0,1,1,1};
		Integer[] tile28 = {1,1,1,0};
		Integer[] tile29 = {1,2,0,1};
		Integer[] tile30 = {2,0,1,1};
		Integer[] tile31 = {0,1,1,2};
		Integer[] tile32 = {1,1,2,0};
		Integer[] tile33 = {2,1,0,1};
		Integer[] tile34 = {1,0,1,2};
		Integer[] tile35 = {0,1,2,1};
		Integer[] tile36 = {1,2,1,0};
		Integer[] tile37 = {1,1,0,2};
		Integer[] tile38 = {1,0,2,1};
		Integer[] tile39 = {0,2,1,1};
		Integer[] tile40 = {2,1,1,0};
		Integer[] tile41 = {2,1,0,2};
		Integer[] tile42 = {1,0,2,2};
		Integer[] tile43 = {0,2,2,1};
		Integer[] tile44 = {2,2,1,0};
		Integer[] tile45 = {1,2,0,2};
		Integer[] tile46 = {2,0,2,1};
		Integer[] tile47 = {0,2,1,2};
		Integer[] tile48 = {2,1,2,0};
		Integer[] tile49 = {2,2,0,1};
		Integer[] tile50 = {2,0,1,2};
		Integer[] tile51 = {0,1,2,2};
		Integer[] tile52 = {1,2,2,0};
		Integer[] tile53 = {2,2,0,2};
		Integer[] tile54 = {2,0,2,2};
		Integer[] tile55 = {0,2,2,2};
		Integer[] tile56 = {2,2,2,0};
		imageMap.put(icons[2], tile2);//hashmap of all images to there path array
		imageMap.put(icons[1], tile1);
		imageMap.put(icons[3], tile3);
		imageMap.put(icons[4], tile4);
		imageMap.put(icons[5], tile5);
		imageMap.put(icons[6], tile6);
		imageMap.put(icons[7], tile7);
		imageMap.put(icons[8], tile8);
		imageMap.put(icons[9], tile9);
		imageMap.put(icons[10], tile10);
		imageMap.put(icons[11], tile11);
		imageMap.put(icons[12], tile12);
		imageMap.put(icons[13], tile13);
		imageMap.put(icons[14], tile14);
		imageMap.put(icons[15], tile15);
		imageMap.put(icons[16], tile16);
		imageMap.put(icons[17], tile17);
		imageMap.put(icons[18], tile18);
		imageMap.put(icons[19], tile19);
		imageMap.put(icons[20], tile20);
		imageMap.put(icons[21], tile21);
		imageMap.put(icons[22], tile22);
		imageMap.put(icons[23], tile23);
		imageMap.put(icons[24], tile24);
		imageMap.put(icons[25], tile25);
		imageMap.put(icons[26], tile26);
		imageMap.put(icons[27], tile27);
		imageMap.put(icons[28], tile28);
		imageMap.put(icons[29], tile29);
		imageMap.put(icons[30], tile30);
		imageMap.put(icons[31], tile31);
		imageMap.put(icons[32], tile32);
		imageMap.put(icons[33], tile33);
		imageMap.put(icons[34], tile34);
		imageMap.put(icons[35], tile35);
		imageMap.put(icons[36], tile36);
		imageMap.put(icons[37], tile37);
		imageMap.put(icons[38], tile38);
		imageMap.put(icons[39], tile39);
		imageMap.put(icons[40], tile40);
		imageMap.put(icons[41], tile41);
		imageMap.put(icons[42], tile42);
		imageMap.put(icons[43], tile43);
		imageMap.put(icons[44], tile44);
		imageMap.put(icons[45], tile45);
		imageMap.put(icons[46], tile46);
		imageMap.put(icons[47], tile47);
		imageMap.put(icons[48], tile48);
		imageMap.put(icons[49], tile49);
		imageMap.put(icons[50], tile50);
		imageMap.put(icons[51], tile51);
		imageMap.put(icons[52], tile52);
		imageMap.put(icons[53], tile53);
		imageMap.put(icons[54], tile54);
		imageMap.put(icons[55], tile55);
		imageMap.put(icons[56], tile56);
		Integer[] empty = {0,0,0,0};
		imageMap.put(null, empty);
	}
	public HashMap<ImageIcon,Integer[]> getMap(){
		return imageMap;
	}
}
