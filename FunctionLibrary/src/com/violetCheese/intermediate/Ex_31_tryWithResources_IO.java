package com.violetCheese.intermediate;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Ex_31_tryWithResources_IO {
	public static void main(String[] args) {

		try (
				// try�� �ڿ������� ��ȣ()���̿��� ���� stream�� ������ close���� �ʾƵ� �˴ϴ�.
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));) {
			// �� �Ʒ��� out�� �̿��ؼ� data.txt�� int�� 100, double�� 3.14�� �����ϼ���.
			out.writeInt(100);
			out.writeDouble(3.14);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}