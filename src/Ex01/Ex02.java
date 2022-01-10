package Ex01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Ex02 extends JFrame{
	private JTextField tf1, tf2, tf3;
	public int WIDTH=400, HEIGHT=200;
	
	public Ex02() {
		setTitle("광운이 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(WIDTH, HEIGHT);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		tf1 = new JTextField(5); // 숫자 1
		tf2 = new JTextField(5); // 숫자 2
		tf3 = new JTextField(15); // 결과
		
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		
		p1.add(new JLabel("숫자1"));
		p1.add(tf1);
		p1.add(new JLabel("숫자2"));
		p1.add(tf2);
		p2.add(b1); p2.add(b2); p2.add(b3); p2.add(b4);
		p3.add(new JLabel("결과"));
		p3.add(tf3);
		
		add(BorderLayout.NORTH, p1);
		add(BorderLayout.CENTER, p2);
		add(BorderLayout.SOUTH, p3);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		new Ex02().setVisible(true);

	}
	
	
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		try {
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			
			switch(str) {
			case "+" : tf3.setText(String.valueOf(a+b)); break;
			case "-" : tf3.setText(a-b+""); break;
			case "*" : tf3.setText(a*b+""); break;
			case "/" : tf3.setText(a/b+""); break;
			}
		} catch (NumberFormatException n) {
			tf3.setText("숫자를 입력하세요");
		} catch (ArithmeticException a) {
			tf3.setText("0으로 나눌 수 없습니다.");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
