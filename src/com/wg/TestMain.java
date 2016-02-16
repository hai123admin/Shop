package com.wg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TestMain {

	public static void readTxtFile(String filePath,Cart cart,int f) {
		try {
			String encoding = "GBK";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // �ж��ļ��Ƿ����
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// ���ǵ������ʽ
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = "";
				
				while ((lineTxt = bufferedReader.readLine()) != null) {
			 
					System.out.println(lineTxt);
					
					Input.input(lineTxt,cart,f);
				}
				read.close();

			} else {
				System.out.println("�Ҳ���ָ�����ļ�");
			}
		} catch (Exception e) {
			System.out.println("��ȡ�ļ����ݳ���");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		String filePath_a = "C:\\Users\\maidou\\Desktop\\a.txt";
		Cart cart = new Cart();
		readTxtFile(filePath_a,cart,0);
		
		/*String xx="2013.01.01|0.7|����" ;
		int len =xx.split("[|]").length   ;
		for (int i = 0; i < len; i++) {
			System.out.println(xx.split("[|]")[i]);
		}
		System.out.println(len);*/

	}

}
