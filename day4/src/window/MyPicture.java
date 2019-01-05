package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyPicture implements ActionListener{                  //implements actionlistner -> method�� ���������� ����

	static JButton b1;
	static JButton b2;             // b1, b1�� ������ �ƴ� Ŭ���� �ؿ��� ������
	
	public static void main(String[] args) {
		JFrame f = new JFrame();   //Frame(Ʋ) ����� ���̺귯��
		// �������� ��� ����
		f.setTitle("���� �׷��� ���α׷�");  //set�� ������ ���ð��� ����� ��. title�� Ÿ��Ʋ �ޱ�. ��ȣ�ȿ� Ÿ��Ʋ ����
		f.setSize(700, 700);      // ������ ������ ���ϱ�(����, ����)
				
		
		JLabel l = new JLabel("���� ������");   // ����(label)�� �̹��� �����ϴ�  ���̺귯��
		JLabel b = new JLabel("�̻�����?");   
		JLabel img = new JLabel();   
		ImageIcon icon = new ImageIcon("dog.PNG");  // �̹��� ����
		FlowLayout flow = new FlowLayout();         // ����� �����ϸ鼭 ��¥/�̹��� ����
		f.setLayout(flow);
		img.setIcon(icon);                // �̹����� ������ ����
		
		b1 = new JButton("���� ��������.");       // ��ư�� �־��ִ� ���̺귯��
		b2 = new JButton("���� �Ƕ� ��������.");       // ��ư�� �־��ִ� ���̺귯��
																
		f.add(l);                         // �����ӿ� ����, �̹��� ����
		f.add(img); 
		f.add(b);                         // add ������� �Է°��� �� l -> img -> b
		f.add(b1);
		f.add(b2);
		
		
		MyPicture pic = new MyPicture();
		b1.addActionListener(pic);          // ��ư ������ �� ����ó�� implementation listener�� ���� 
		b2.addActionListener(pic);           
		
		
		f.setVisible(true);               //�������� ����(visible)�����ִ� ���. true��� ����־�� ����� -> �ȵ���̵� �⺻�� �Ⱥ���. ���̵��� �����������
	}

	@Override
	public void actionPerformed(ActionEvent e) {       //��ư �������� ���ȣ ���� �׼��� �ڵ����� ����
		if (e.getSource() == b1) {
			System.out.println("���� ��������...!!");
		}
		if (e.getSource() == b2) {
			System.out.println("���� �Ƕ� ��������...!!");
		}
			
		
		
	}

}
