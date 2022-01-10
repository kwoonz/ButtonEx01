package ort.comstudy.day31Ex3;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEventEx03 extends Frame {
	private int width=640, height=480;
	
	public FrameEventEx03 () {
		setTitle("Inner class를 활용한 이벤트 처리 연습");
		setSize(width, height);
		setVisible(true);
		
		WindowListener l = new InnerWindowListener();
		addWindowListener(l);
	}
	
	// 클래스 내부에 클래스를 선언한다. (매우중요!)
	class InnerWindowListener implements WindowListener{

		public void windowActivated(WindowEvent arg0) {}
		public void windowClosed(WindowEvent arg0) {}
		public void windowClosing(WindowEvent arg0) {
			if(width==100) {
				System.out.println("종료");
				dispose();
				System.exit(0);
				
			}
			
			FrameEventEx03.this.width=100;
			FrameEventEx03.this.height=100;
			setSize(width, height);
			
		}
		public void windowDeactivated(WindowEvent arg0) {}
		public void windowDeiconified(WindowEvent arg0) {}
		public void windowIconified(WindowEvent arg0) {}
		public void windowOpened(WindowEvent arg0) {}

	}
	
	
	public static void main(String[] args) {
		new FrameEventEx03();
	}
}
