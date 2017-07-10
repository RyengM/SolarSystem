package cn.demon.util;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;


public class Util {
	
	private Util(){};
	
	public static Image getImg (String path){//º”‘ÿÕº∆¨
		URL u = Util.class.getClassLoader().getResource(path);
		BufferedImage img = null;
		try {
			img = ImageIO.read(u);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}
	
	public static Image getImage (String path){//º”‘ÿgif
		return Toolkit.getDefaultToolkit().getImage(MyFrame.class.getClassLoader().getResource(path));
	}
	
	public static Image changeImgSize (Image img,int width){//Õº∆¨Àı∑≈
		Image scrImg = img;
		int ImgWidth = width;
		int height = scrImg.getHeight(null)*ImgWidth/scrImg.getWidth(null);
		img = scrImg.getScaledInstance(ImgWidth, height, Image.SCALE_SMOOTH);
		return img;
	}
	
	

}

