package cn.demon.util;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
*
* 窗口类
*
*/

public class MyFrame extends Frame{
	/*
	 * 加载界面
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
	
}
