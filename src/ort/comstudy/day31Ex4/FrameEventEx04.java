package ort.comstudy.day31Ex4;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEventEx04 extends Frame {
	
	
	
	public FrameEventEx04() {
		setTitle("익명 내부 클래스를 활용한 이벤트 핸들러 구현");
		setSize(640, 480);
		setVisible(true);
		
		// 인터페이스로는 객체를 만들 수 없다
		// 인터페이스를 구현 하면서 인스턴스 생성 가능 (익명 내부 클래스)
		// 1회용으로 사용이 끝나는 클래스.
		// new 자리에 (class AAA implements)가 생략되었다.
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
