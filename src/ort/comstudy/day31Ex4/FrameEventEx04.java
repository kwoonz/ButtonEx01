package ort.comstudy.day31Ex4;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEventEx04 extends Frame {
	
	
	
	public FrameEventEx04() {
		setTitle("�͸� ���� Ŭ������ Ȱ���� �̺�Ʈ �ڵ鷯 ����");
		setSize(640, 480);
		setVisible(true);
		
		// �������̽��δ� ��ü�� ���� �� ����
		// �������̽��� ���� �ϸ鼭 �ν��Ͻ� ���� ���� (�͸� ���� Ŭ����)
		// 1ȸ������ ����� ������ Ŭ����.
		// new �ڸ��� (class AAA implements)�� �����Ǿ���.
		addWindowListener(new WindowListener() {
		
			public void windowOpened(WindowEvent arg0) {}
			public void windowIconified(WindowEvent arg0) {}
			public void windowDeiconified(WindowEvent arg0) {}
			public void windowDeactivated(WindowEvent arg0) {}
			public void windowClosing(WindowEvent arg0) {
				FrameEventEx04.this.dispose();
				System.exit(0);
				
			}
			public void windowClosed(WindowEvent arg0) {}
			public void windowActivated(WindowEvent arg0) {}
		});
	}
	

	public static void main(String[] args) {
		new FrameEventEx04();

	}

}
