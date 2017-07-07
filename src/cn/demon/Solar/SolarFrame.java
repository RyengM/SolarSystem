package cn.demon.Solar;

import java.awt.Graphics;
import java.awt.Image;

import cn.demon.util.Constant;
import cn.demon.util.MyFrame;
import cn.demon.util.Util;

/*
 * Ì«ÑôÏµÖ÷´°¿Ú
 */
public class SolarFrame extends MyFrame{
	
	Image bg = Util.getImg("img/background.jpg");
	Star sun = new Star("img/sun.png",Constant.Width/2,Constant.Length/2);
	Planet mercury = new Planet(sun, "img/mercury.png", 65, 65, 0.1);
	Planet venus = new Planet(sun,"img/venus.png",72,72,0.04);
	Planet earth = new Planet(sun,"img/earth.png",80,80,0.02);
	Planet mars = new Planet(sun,"img/mars.png",100,100,0.01);
	Planet jupiter = new Planet(sun,"img/jupiter.png",130,130,0.008);
	Planet saturn = new Planet(sun,"img/saturn.png",150,150,0.005);
	Planet uranus = new Planet(sun,"img/uranus.png",210,210,0.003);
	Planet neptune = new Planet(sun,"img/neptune.png",260,260,0.001);
	
	public void paint(Graphics g){
		
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		mercury.draw(g);
		venus.draw(g);
		earth.draw(g);
		mars.draw(g);
		jupiter.draw(g);
		saturn.draw(g);
		uranus.draw(g);
		neptune.draw(g);
	}
	
	public static void main(String[] args){
		new SolarFrame().LunchFrame();
	}
}
