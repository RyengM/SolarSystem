package cn.demon.Solar;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import cn.demon.util.Util;

public class Star {
	Image img;
	double x,y;
	int width;
	int height;
	
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}
	
	//public Star(){};
	
	public Star(Image img,int scaleWidth){
		this.img = img;
		img = Util.changeImgSize(img, scaleWidth);
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	
	public Star(Image img,double x,double y,int scaleWidth){
		this(img,scaleWidth);
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
		this.x = x;
		this.y = y;	
	}

	public Star(String ImgPath, double x,double y,int scaleWidth){//width为缩放后的宽度
		this(Util.getImg(ImgPath),x,y,scaleWidth);
		img = Util.changeImgSize(img, scaleWidth);
	}
}
