package ort.comstudy.day31Ex3;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEventEx03 extends Frame {
	private int width=640, height=480;
	
	public FrameEventEx03 () {
		setTitle("Inner class�� Ȱ���� �̺�Ʈ ó�� ����");
		setSize(width, height);
		setVisible(true);
		
		WindowListener l = new InnerWindowListener();
		addWindowListener(l);
	}
	
	// Ŭ���� ���ο� Ŭ������ �����Ѵ�. (�ſ��߿�!)
	class InnerWindowListener implements WindowListener{

		public void windowActivated(WindowEvent arg0) {}
		public void windowClosed(WindowEvent arg0) {}
		public void windowClosing(WindowEvent arg0) {
			if(width==100) {
				System.out.println("����");
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
