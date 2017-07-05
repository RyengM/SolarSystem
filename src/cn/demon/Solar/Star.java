package cn.demon.Solar;

import java.awt.Graphics;
import java.awt.Image;

import cn.demon.util.Util;

public class Star {
	Image img;
	double x,y;
	
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}
	
	public Star(){};
	
	public Star(Image img,double x,double y){
		this.img = img;
		this.x = x;
		this.y = y;
	}

	
	public Star(String ImgPath, double x,double y){
		this.img = Util.getImage(ImgPath);
		this.x = x;
		this.y = y;
	}
}
