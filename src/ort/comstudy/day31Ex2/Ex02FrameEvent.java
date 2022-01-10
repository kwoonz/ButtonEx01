package ort.comstudy.day31Ex2;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyWindowListener implements WindowListener {
	Ex02FrameEvent target;
	
	public MyWindowListener(Ex02FrameEvent target) {
		this.target = target;
	}
	
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		// �ݱ� ��ư�� �������� â �ݰ� ���μ��� ������
		System.out.println("�ݱ� ��ư�� ������ ���μ����� ���� �߽��ϴ�.");
		target.dispose();
		System.exit(0);
		
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	
}


public class Ex02FrameEvent extends Frame {
	public static final int WIDTH = 600, HEIGHT = 400;
		
	public Ex02FrameEvent() {
		setTitle("�̺�Ʈ ����Ʈ ����");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		
		WindowListener l = new MyWindowListener(this);
		this.addWindowListener(l);
		
	}

	public static void main(String[] args) {
		new Ex02FrameEvent();

	}		

}


