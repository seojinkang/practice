package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyPicture2 implements ActionListener{                  //implements actionlistner -> method�� ���������� ����

	static JButton b1;
	static JButton b2;             // b1, b1�� ������ �ƴ� Ŭ���� �ؿ��� ������(global �ϰԾ�)
	static JLabel img;
	static ImageIcon icon;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();  
		f.setTitle("���� �׷��� ���α׷�");  
		f.setSize(700, 700);      
				
		
		JLabel l = new JLabel("���� ������");   
		JLabel b = new JLabel("�̻�����?");   
		
		img = new JLabel();   
		icon = new ImageIcon("dog.PNG");  
		FlowLayout flow = new FlowLayout();         
		f.setLayout(flow);
		img.setIcon(icon);               
		
		// ��ư�� ������ �� �׸� �ٲ�� �����.
		b1 = new JButton("�ٸ� ��������");      
		b2 = new JButton("���� ��������");      
																
		f.add(l);                    
		f.add(img); 
		f.add(b);                    
		f.add(b1);
		f.add(b2);
		
		
		MyPicture2 pic = new MyPicture2();
		b1.addActionListener(pic);           
		b2.addActionListener(pic);           
		
		
		f.setVisible(true);              
	}

	@Override
	public void actionPerformed(ActionEvent e) {       //��ư �������� ���ȣ ���� �׼��� �ڵ����� ����
		if (e.getSource() == b1) {
			ImageIcon icon2 = new ImageIcon("dog1.PNG");
			img.setIcon(icon2);
		}
		if (e.getSource() == b2) {
			img.setIcon(icon);
		}
			
		
		
	}

}
