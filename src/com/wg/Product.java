package com.wg;

import java.util.HashMap;
import java.util.Map;

/***
 * Ŀ¼ ��Ʒ ���� �Ͳ�ƷС�� ���� ���ݿ�
 * 
 * @author maidou
 *
 */
public class Product {

	public static enum type {
		����, ʳƷ, ����Ʒ, ����
	}

	public static enum ���� {
		ipad, iphone, ��ʾ��, �ʼǱ�����, ����
	}

	public static enum ʳƷ {
		���, ����, ����, ţ����, �߲�
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public static enum ����Ʒ {
		�ͽ�ֽ, ������, ���ȱ�, ��ɡ
	}

	public static enum ���� {
		ơ��, �׾�, ���ؼ�
	}

	public static Class[] cc = { Product.����.class, Product.ʳƷ.class,
			Product.����Ʒ.class, Product.����.class };
 

	public static String getType(String name) {
		String type = "";
		for (int i = 0; i < cc.length; i++) {
			for (Object obj : cc[i].getEnumConstants()) {
				// System.out.println(obj);
				if (name.equals(obj.toString())) {
					type = cc[i].getSimpleName();

				}
			}
		}

		return type;
	}
	
	
	public static boolean getTypeExist(String name) {
		 
		for (int i = 0; i < cc.length; i++) {
			for (Object obj : cc[i].getEnumConstants()) {
				// System.out.println(obj);
				if (name.equals(obj.toString())) {
					return true;

				}
			}
		}

		return false;
	}
	

	public static void main(String[] args) {

		System.out.println(Product.getType("���ȱ�"));

	}
}
