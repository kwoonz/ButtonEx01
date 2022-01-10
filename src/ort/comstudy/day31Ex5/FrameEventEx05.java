package ort.comstudy.day31Ex5;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


// Adapter�� �̿��ϸ� �Ⱦ��� �޼ҵ带 �����ʰ� �ȴ�.
public class FrameEventEx05 extends Frame {
	
	
	
	public FrameEventEx05() {
		setTitle("WindowAdapter�� Ȱ���� eventó��");
		setSize(640, 480);
		setVisible(true);
		
		// �������̽��δ� ��ü�� ���� �� ����
		// �������̽��� ���� �ϸ鼭 �ν��Ͻ� ���� ���� (�͸� ���� Ŭ����)
		// 1ȸ������ ����� ������ Ŭ����.
		// new �ڸ��� (class AAA implements)�� �����Ǿ���.
		addWindowListener(new WindowAdapter() {
		
		
			public void windowClosing(WindowEvent arg0) {
				FrameEventEx05.this.dispose();
				System.exit(0);
				
			}

		});
	}
	

	public static void main(String[] args) {
		new FrameEventEx05();

	}

}
