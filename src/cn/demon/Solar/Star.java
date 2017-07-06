package cn.demon.Solar;

import java.awt.Graphics;
import java.awt.Image;

import cn.demon.util.Util;

public class Star {
	Image img;
	double x,y;
	int width;
	int height;
	
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}
	
	public Star(){};
	
	public Star(Image img){
		this.img = img;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	
	public Star(Image img,double x,double y){
		this(img);
		this.x = x;
		this.y = y;
		
		
	}

	
	public Star(String ImgPath, double x,double y){
		this(Util.getImg(ImgPath),x,y);
	}
}
