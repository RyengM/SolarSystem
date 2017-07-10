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
	//Star sun = new Star("img/sun_.gif",Constant.Width/2,Constant.Length/2);
	Star sun = new Star("img/sun.png",Constant.Width/2,Constant.Length/2,70);
	Planet mercury = new Planet(sun, "img/mercury.png", 80, 40, 0.1,5);
	Planet venus = new Planet(sun,"img/venus.png",100,50,0.04,1);
	Planet earth = new Planet(sun,"img/earth.png",126,63,0.02,1);
	Planet moon = new Planet(earth, "img/mercury.png", 20, 12, 0.06,1, true);
	Planet mars = new Planet(sun,"img/mars.png",156,78,0.01,2);
	Planet jupiter = new Planet(sun,"img/jupiter.png",260,130,0.008,1);
	Planet saturn = new Planet(sun,"img/saturn.png",300,150,0.005,1);
	Planet uranus = new Planet(sun,"img/uranus.png",360,180,0.003,1);
	Planet neptune = new Planet(sun,"img/neptune.png",460,230,0.001,1);
	
	public void paint(Graphics g){
		
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		mercury.draw(g);
		venus.draw(g);
		earth.draw(g);
		moon.draw(g);
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
