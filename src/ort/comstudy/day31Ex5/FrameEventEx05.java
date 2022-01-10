package ort.comstudy.day31Ex5;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


// Adapter를 이용하면 안쓰는 메소드를 쓰지않게 된다.
public class FrameEventEx05 extends Frame {
	
	
	
	public FrameEventEx05() {
		setTitle("WindowAdapter를 활용한 event처리");
		setSize(640, 480);
		setVisible(true);
		
		// 인터페이스로는 객체를 만들 수 없다
		// 인터페이스를 구현 하면서 인스턴스 생성 가능 (익명 내부 클래스)
		// 1회용으로 사용이 끝나는 클래스.
		// new 자리에 (class AAA implements)가 생략되었다.
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
