package cn.demon.Solar;

import java.awt.Graphics;
import java.awt.Image;

import cn.demon.util.MyFrame;
import cn.demon.util.Util;

/*
 * Ì«ÑôÏµÖ÷´°¿Ú
 */
public class SolarFrame extends MyFrame{
	
	Image bg = Util.getImage("");
	Star sun = new Star("img/light.png",0,0);
	Planet earth = new Planet(sun, "", 100, 100, 0.1);
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		earth.draw(g);
	}
	
	public static void main(String[] args){
		new SolarFrame().LunchFrame();
	}
}
