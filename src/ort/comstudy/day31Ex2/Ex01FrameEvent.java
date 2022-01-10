package ort.comstudy.day31Ex2;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex01FrameEvent extends Frame implements WindowListener {
	
	
	
	public Ex01FrameEvent() {
		setTitle("WindowLisener 실습");
		setSize(640, 480);
		setVisible(true);
		
		this.addWindowListener(this);
	}



	public void windowActivated(WindowEvent arg0) {}


	public void windowClosed(WindowEvent arg0) {}

	public void windowClosing(WindowEvent arg0) {
		// 닫기 버튼을 눌렀을때 창 닫고 프로세스 끝내기
		System.out.println("닫기 버튼을 눌러서 프로세스를 종료 했습니다.");
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
