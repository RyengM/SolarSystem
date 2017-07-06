package cn.demon.util;

import java.awt.Frame;
import java.awt.Graphics;
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
	
	public void changeImgSize (Image img,int a){//Õº∆¨Àı∑≈
		Image image = img;
		BufferedImage tag;
		int height = img.getHeight(null);
		int width = img.getWidth(null);
		tag = new BufferedImage(width/a, height/a, BufferedImage.TYPE_INT_BGR);
		tag.getGraphics().drawImage(image, 0, 0, width/a, height/a, null);
	}
	
	

}

