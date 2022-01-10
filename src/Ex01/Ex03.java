package Ex01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ort.comstudy.day31.guiex.myframe.MyFrame;

public class Ex03 extends MyFrame implements ActionListener {
	Panel westPan = new Panel(new GridLayout(4, 2,0,20));
	Panel eastPan = new Panel(new GridLayout());
	Panel southPan = new Panel(new FlowLayout());
	Label lblno = new Label("��ȣ");
	Label lblname = new Label("�̸�");
	Label lblemail = new Label("�̸���");
	Label lblphoneNumber = new Label("��ȭ��ȣ");
	TextField txtno = new TextField(10);
	TextField txtname = new TextField();
	TextField txtemail = new TextField();
	TextField txtphoneNumber = new TextField();
	TextField txtEmpty = new TextField(50);
	
	
	Button btn1 = new Button("��ü����");
	Button btn2 = new Button("�߰�");
	Button btn3 = new Button("����");
	Button btn4 = new Button("�˻�");
	Button btn5 = new Button("���");
	
	
	
	
	public Ex03() {
		//GridLayout gu = new GridLayout(2, 2);
		//setLayout(gu);
		
		// westPan Label,text
		this.add(BorderLayout.WEST, westPan);
		westPan.add(lblno);
		westPan.add(txtno);
		westPan.add(lblname);
		westPan.add(txtname);
		westPan.add(lblemail);
		westPan.add(txtemail);
		westPan.add(lblphoneNumber);
		westPan.add(txtphoneNumber);
		
		// eastPan
		this.add(BorderLayout.EAST, eastPan);
		eastPan.add(txtEmpty);
		
		
		// southPan Button
		this.add(BorderLayout.SOUTH, southPan);
		southPan.add(btn1);
		southPan.add(btn2);
		southPan.add(btn3);
		southPan.add(btn4);
		southPan.add(btn5);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		
		
		
		setTitle("���� 1");
		setSize(600, 240);
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof Button) {
			Button btn = (Button) (e.getSource());
			
			if(btn1.equals(btn)) {
				System.out.println("��ü�����ư�� Ŭ���ϼ̽��ϴ�.");
			} else if(btn2.equals(btn)) {
				System.out.println("�߰���ư�� Ŭ���ϼ̽��ϴ�.");
			} else if(btn3.equals(btn)) {
				System.out.println("������ư�� Ŭ���ϼ̽��ϴ�.");
			} else if(btn4.equals(btn)) {
				System.out.println("�˻���ư�� Ŭ���ϼ̽��ϴ�.");
			} else if(btn5.equals(btn)) {
				System.out.println("��ҹ�ư�� Ŭ���ϼ̽��ϴ�.");
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new Ex03().setVisible(true);
		
	}


	
	
}
