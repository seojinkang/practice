package window2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pizza {

	JFrame f;
	JLabel top, count;
	JButton b1, b2, b3;
	JTextField total;
	int sum = 0; // ��ư�� ������ ��Ÿ���� �ʰ� ���⿡�� ���� ���� 
	int combo =0;
	int potato = 0;
	int bulgoki = 0;
	
	JTextArea list;
	private JLabel label;
	private JLabel label_1;
	private JButton btnNewButton;
	
	public Pizza() {
//		1. ��ǰ ����(��ü ����)
		f = new JFrame();
		f.setSize(350, 200);
		top = new JLabel("�ڹ����ڿ� ���� ���� ȯ���մϴ�. �ݰ����ϴ� ^^");
		count = new JLabel("����");
		b1 = new JButton("�޺�����");
		b2 = new JButton("������������");
		b3 = new JButton("�Ұ������");
		total = new JTextField(20);
		
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		list = new JTextArea(3, 30);
		
		f.getContentPane().add(top);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(count);
		f.getContentPane().add(total);
		
		btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC918");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "���� ���� �����̱���");
			}
		});
		f.getContentPane().add(btnNewButton);
		f.getContentPane().add(list);
		
		label_1 = new JLabel("\uCD1D\uACC4");
		f.getContentPane().add(label_1);
		
		label = new JLabel("");
		f.getContentPane().add(label);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;    //1�� ����
				total.setText(sum+"");
				combo++;
				list.setText("�޺� ����: " + combo + "��\n"  // \n = ����
						+ "�������� ����: " + potato + "��\n"
						+ "�Ұ�� ����: " + bulgoki + "��"
						); 
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum+"");
				potato++;
				list.setText("�޺� ����: " + combo + "��\n"  // \n = ����
						+ "�������� ����: " + potato + "��\n"
						+ "�Ұ�� ����: " + bulgoki + "��"
						); 

			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum+"");
				bulgoki++;
				list.setText("�޺� ����: " + combo + "��\n"  // \n = ����
						+ "�������� ����: " + potato + "��\n"
						+ "�Ұ�� ����: " + bulgoki + "��"
						); 

			}
		});
		
		
		f.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		Pizza p = new Pizza();
	}

}
