package window2;

import java.util.Scanner;

public class MyShop3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1�� �Է��ϼ���: ");
		int n1 = sc.nextInt();
		System.out.print("���� 2�� �Է��ϼ���: ");
		int n2 = sc.nextInt();
		
		
		Cal2 cal2 = new Cal2();
		int sum = cal2.myCal(n1, n2);
		System.out.println("���� ����� " + (sum * 100));
		
	}

}
