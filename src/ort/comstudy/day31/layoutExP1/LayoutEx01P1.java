package ort.comstudy.day31.layoutExP1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import ort.comstudy.day31.guiex.myframeP1.MyFrame1;

public class LayoutEx01P1 extends MyFrame1 {
	public Button btn1 = new Button("Button1");
	public Button btn2 = new Button("Button2");
	public Button btn3 = new Button("Button3");
	public Button btn4 = new Button("Button4");
	public Button btn5 = new Button("Button5");

	public LayoutEx01P1() {
		super("Layout Manager", 640, 480);

		// BorderLayout();
		// FlowLayout();
		// GridLayout();
		GridBacLayout();
	}

	private void GridBacLayout() {
		this.setLayout(new GridBagLayout());
		this.add(btn1);

	}

	private void GridLayout() {
		setLayout(new GridLayout(2, 3, 5, 5));
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btns.get((10)));

	}

	public ArrayList<Button> btns = new ArrayList<Button>();
	{
		for (int i = 0; i < 100; i++) {
			btns.add(new Button("BTN" + i));
		}
	}

	private void FlowLayout() {
		setLayout(new FlowLayout());
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);

	}

	private void BorderLayout() {
		add(BorderLayout.NORTH, btn1);
		add(BorderLayout.SOUTH, btn2);
		add(BorderLayout.EAST, btn3);
		add(BorderLayout.WEST, btn4);
		add(BorderLayout.CENTER, btn5);

	}

	public static void main(String[] args) {
		// 화면에 보이는 설정 맨 마지막에 해 준다.
		new LayoutEx01P1().setVisible(true);

	}

}
