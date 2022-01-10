package ort.comstudy.day31.layoutEx;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ort.comstudy.day31.guiex.myframe.MyFrame;

public class LayoutEx02 extends MyFrame implements ActionListener {
	
	// Panel�� �̿��� ���� ���̾ƿ� ����
	// �غ�
	Panel centerPan = new Panel(new GridBagLayout());
	Label centerLbl = new Label("Hello Java world!"); // Label������ ����
	Panel southPan = new Panel(new GridLayout(1, 3));
	Panel innerPan = new Panel(new GridLayout(2, 1));
	
	Button btn1 = new Button("BTN1");
	Button btn2 = new Button("BTN2");
	Button btn3 = new Button("BTN3");
	Button btn4 = new Button("BTN4");
	
	public LayoutEx02() {
		layoutEx01();
		
		}
	
	// �г��� ���̴� �۾�
	public void layoutEx01() {
		// ���Ϳ� ���δ�.
		this.add(BorderLayout.CENTER, centerPan);
		centerPan.add(centerLbl);
		
		// �ϴܿ� ���δ�.
		southPan.add(btn1);
		southPan.add(btn2);
		southPan.add(innerPan);
		innerPan.add(btn3);
		innerPan.add(btn4);
		this.add(BorderLayout.SOUTH, southPan);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// ����� �̿��ؼ� ��ư�� �����Ѵ�.
		if (e.getSource() instanceof Button) {
			Button btn = (Button)(e.getSource()); // e.getSource()�� Button���� ����ȯ.
			
			if(btn1.equals(btn)) {
				System.out.println("btn1 ������.");
				//centerLbl.setText("press btn1");
			}else if(btn2.equals(btn)) {
				System.out.println("btn2 ������.");
			}else if(btn3.equals(btn)) {
				System.out.println("btn3 ������.");
			}else if(btn4.equals(btn)) {
				System.out.println("btn4 ������.");
			}
		}
		
	}

	public static void main(String[] args) {
		new LayoutEx02().setVisible(true);

	}



}
