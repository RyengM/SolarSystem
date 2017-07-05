package cn.demon.Solar;

import java.awt.Graphics;
import java.awt.Image;

import cn.demon.util.Util;

public class Planet extends Star{

	double longAxis;
	double shortAxis;
	double speed;
	double degree;
	Star center;
	
	//—ÿ◊≈Õ÷‘≤πÏº£∑…––
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
		x = center.x + speed* Math.cos(degree);
		y = center.y + speed* Math.sin(degree);
		degree += speed;
	}
	
	public Planet(Star center,String imgPath, double longAxis,
			double shortAxis, double speed) {
		this.center = center;
		this.x = center.x + longAxis;
		this.y = center.y;
		this.img = Util.getImage(imgPath);
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;
	}

	

}
