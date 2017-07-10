package cn.demon.Solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import cn.demon.util.Util;

public class Planet extends Star{

	double longAxis;
	double shortAxis;
	double speed;
	double degree;
	int scaleWidth;
	Star center;
	Image img;
	

	boolean satellite;
	
	public void draw(Graphics g){
		super.draw(g);
		move();
		if (!satellite){
			drawTrace(g);
		}
		
	}
	
	public void drawTrace(Graphics g){
		double ovalx,ovaly,ovalwidth,ovalheight;
		ovalwidth = longAxis *2;
		ovalheight = shortAxis *2;
		ovalx = center.x + center.width/2 - longAxis;
		ovaly = center.y + center.height/2.5 - shortAxis;
		
		Color c = g.getColor();
		g.setColor(Color.white);
		g.drawOval((int)ovalx, (int)ovaly, (int)ovalwidth, (int)ovalheight);
		g.setColor(c);
	}
	
	public void move(){
		//—ÿ◊≈Õ÷‘≤πÏº£∑…––
		x = center.x + center.width/2 + longAxis* Math.cos(degree)-width/2;
		y = center.y + center.height/3 + shortAxis* Math.sin(degree)-height/2;
		degree += speed;
	}
	
	public Planet(Star center,String imgPath, double longAxis,
			double shortAxis, double speed,int scaleWidth) {
		super(Util.getImage(imgPath), scaleWidth);
		this.center = center;
		this.x = center.x + longAxis;
		this.y = center.y;
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.img = Util.getImage(imgPath);
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	
	public Planet(Star center,String imgPath, double longAxis,
			double shortAxis, double speed,int scaleWidth,boolean satellite) {
		this(center, imgPath, longAxis, shortAxis, speed,scaleWidth);
		this.satellite = satellite;
	}


	

}
