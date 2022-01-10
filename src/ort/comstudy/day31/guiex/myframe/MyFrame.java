package ort.comstudy.day31.guiex.myframe;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import ort.comstudy.day31Ex5.FrameEventEx05;

public class MyFrame extends Frame {



		public MyFrame() {
			this("my-frame", 200,200);
		}
		
		public MyFrame(String title, int w, int h) {
			setTitle(title);
			setSize(w, h);
		
		
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
				
			}

		});
		
		
		// 툴킷을 이용해서 가운데 정렬을 한다.
		Toolkit tk = this.getToolkit().getDefaultToolkit();
		int scrWidth = (int)tk.getScreenSize().getWidth();
		int scrHeight = (int)tk.getScreenSize().getHeight();
		
		
		int x = scrWidth / 2 - w/2;
		int y = scrHeight / 2 - h/2;
		
		this.setLocation(x, y);
	}

	
}
