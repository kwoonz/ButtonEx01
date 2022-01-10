package Ex01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import ort.comstudy.day31.guiex.myframe.MyFrame;



public class Ex01 extends MyFrame {
	
	// Panel을 이용한 세부 레이아웃 설정
	// 준비
	Panel centerPan = new Panel(new GridBagLayout());
	Label centerLbl = new Label("Hello world");
	Panel southPan = new Panel(new GridLayout(1, 3));
	Panel innerPan = new Panel(new GridLayout(2, 1));
	
	Button btn1 = new Button("BTN1");
	Button btn2 = new Button("BTN2");
	Button btn3 = new Button("BTN3");
	Button btn4 = new Button("BTN4");
	
	
	public Ex01() {
		layoutEx01();
	}

	
	public void layoutEx01() {
		// 센터에 붙인다.
		this.add(BorderLayout.CENTER, centerPan);
		centerPan.add(centerLbl);
		
		// 하단에 붙인다.
		southPan.add(btn1);
		southPan.add(btn2);
		southPan.add(innerPan);		
		innerPan.add(btn3);
		innerPan.add(btn4);
		this.add(BorderLayout.SOUTH, southPan);
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		new Ex01().setVisible(true);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
