package ort.comstudy.day31.guiex.myframeP1;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame1 extends Frame{
	
	// ����Ʈ ������
	public MyFrame1() {
		this("my-frame", 200, 200);
	}
	

	// ������ �����ε�
	public MyFrame1(String title, int w, int h) {
		setTitle(title);
		setSize(w, h);
		
	// �̺�Ʈ �ڵ鷯
	addWindowListener(new WindowAdapter() {
			
		public void windowClosing(WindowEvent e) {
			dispose();
			System.exit(0);
				
		}
			
			
	});
	
	// ��ũ�� ȭ���� �� ��� ��ġ
	Toolkit tk = this.getToolkit().getDefaultToolkit();
	int scrWidth = (int)tk.getScreenSize().getWidth();
	int scrHeight = (int)tk.getScreenSize().getHeight();
	
	int x = scrWidth / 2 - w/2;
	int y = scrHeight / 2 - h/2;
	
	this.setLocation(x, y);
	
	}
	

}
