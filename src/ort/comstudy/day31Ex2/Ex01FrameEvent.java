package ort.comstudy.day31Ex2;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex01FrameEvent extends Frame implements WindowListener {
	
	
	
	public Ex01FrameEvent() {
		setTitle("WindowLisener �ǽ�");
		setSize(640, 480);
		setVisible(true);
		
		this.addWindowListener(this);
	}



	public void windowActivated(WindowEvent arg0) {}


	public void windowClosed(WindowEvent arg0) {}

	public void windowClosing(WindowEvent arg0) {
		// �ݱ� ��ư�� �������� â �ݰ� ���μ��� ������
		System.out.println("�ݱ� ��ư�� ������ ���μ����� ���� �߽��ϴ�.");
		dispose();
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent arg0) {}

	public void windowDeiconified(WindowEvent arg0) {}

	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}

	

	public static void main(String[] args) {
		new Ex01FrameEvent();

	}

}
