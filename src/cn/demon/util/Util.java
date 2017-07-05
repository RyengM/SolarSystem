package cn.demon.util;

import java.awt.Image;
import java.awt.Toolkit;


public class Util {
	
	private Util(){};
	
	public static Image getImage (String path){
		return Toolkit.getDefaultToolkit().getImage(MyFrame.class.getClassLoader().getResource(path));
	}
}
