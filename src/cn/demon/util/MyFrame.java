package cn.demon.util;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
*
* ������
*
*/

public class MyFrame extends Frame{
	/*
	 * ���ؽ���
	 */
    public void LunchFrame(){
        setSize(Constant.Width,Constant.Length);
        setLocation(100,100);
        setVisible(true);
        
        new PaintThread().start();
        
        addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
            
        });
    }

	class PaintThread extends Thread {
		
		public void run(){
			while (true){
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private Image iBuffer;
	private Graphics gBuffer;
	
	@Override
	public void update(Graphics g){  //����update������˫�����Է�ֹ��˸
		if(iBuffer==null){  
	        iBuffer=createImage(this.getSize().width,this.getSize().height);  
	        gBuffer=iBuffer.getGraphics();  
	    }  
	    gBuffer.setColor(getBackground());  
	    gBuffer.fillRect(0,0,this.getSize().width,this.getSize().height);  
	    
	    paint(gBuffer);
	    
	    g.drawImage(iBuffer, 0, 0, null);
	}  
	
}
