package ort.comstudy.day31.layoutEx;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import ort.comstudy.day31.guiex.myframe.MyFrame;

public class LayoutEx01 extends MyFrame{
	public Button btn1 = new Button("BTN1");
	public Button btn2 = new Button("BTN2");
	public Button btn3 = new Button("BTN3");
	public Button btn4 = new Button("BTN4");
	public Button btn5 = new Button("BTN5");
	
	public LayoutEx01() {
		super("Layout Manager ����", 640, 480);
		
		//borderLayoutEx();
		FlowLayoutEx();
		//GridLayoutEx();
		//GridBagLayout();
		
	}
	
	// �ڿ� ���̴� ����
	private void GridBagLayout() {
		this.setLayout(new GridBagLayout());
		this.add(btn1);
	}

	
	private void GridLayoutEx() {
		// 
		this.setLayout(new GridLayout(2, 3, 5, 5)); // 2�� 3���� 5�Ƚ�
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btns.get(10));
		
		
	}
	
	public ArrayList<Button> btns = new ArrayList<Button>();
	{
		for(int i =0; i<100; i++) {
			btns.add(new Button("BTN"+ i));
		}
	}
	
	// FlowLayout - ���ʿ��� ���������� ������� ���δ�.
	public void FlowLayoutEx() {
		this.setLayout(new FlowLayout());
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		
		for(Button btn : btns) {
			this.add(btn);
		}
	}
	
	
	




	
	public void borderLayoutEx() {
		
		// Window�� ��ӹ��� Frame�� ����Ʈ ���̾ƿ��� BoderLayout(�׵θ��� ���� ���δ�)
		add(BorderLayout.NORTH, btn1);
		add(BorderLayout.SOUTH, btn2);
		//add(BorderLayout.EAST, btn3);
		add(BorderLayout.WEST, btn4);
		add(BorderLayout.CENTER, btn5);
	}

	public static void main(String[] args) {
		new LayoutEx01().setVisible(true);
		
	}

}
