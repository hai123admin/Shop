package com.wg;


public class Input {
	 
	
	public static void input(String tmp,Cart cart,int f) {
		//System.out.println("input = "+tmp);
		//Scanner scanner = new Scanner(System.in);// ����������ɨ����
		 
		if (f!=0) {
			// System.out.println("=========caseB=========");
			Input.caseB(cart,tmp);
		} else {
			//System.out.println("=========caseA=========");
			Input.caseA(cart,tmp);
			 }
 
		//System.exit(0);
	}

	/***
	 * case A
	 * 
	 * @param args
	 */
	public static void caseA(Cart cart,String tmp) {
		//System.out.println("=========caseA=========");

		//do {
			
			 
			/// ����
			if (tmp == null || tmp.equals("") ) {
			//	continue;
			}
			// //������Ϣ
			if (tmp != null && !tmp.equals("") && tmp.split("[|]").length == 3) {
				cart.putCuXiao(tmp);

			}  
			 
			// / ��� ��Ʒ
			if (tmp.indexOf("*") > 0 && tmp.split("[:]").length == 2) {
				cart.putGood(tmp);
			}

			// //��������
			if (tmp != null && !tmp.equals("") && tmp.length() ==10 ) {
				cart.setCoutTime(tmp);
				 
			} 

			// //�Ż� ��Ϣ
			if (tmp != null && !tmp.equals("") && tmp.indexOf(" ") > 0
					&& tmp.split(" ").length == 3) {
				cart.setCountInfo(tmp);
	
				
			} 
			// //���
			if (tmp.equals("���")) {
				cart.cout();
				//break;
			}

		//} while (true);

	}

	/***
	 * case B
	 * 
	 * @param args
	 */
	public static void caseB(Cart cart ,String tmp) {

		//System.out.println("========caseB=============");
	 
		//do { 
			// if (tmp.indexOf(" ")>0 && tmp.split(" ")[1].equals("���")) {
			if (tmp.indexOf(" ") > 0 && tmp.split(" ").length == 2) {
				cart.cout();
				//break;
			} 
			
			if (tmp.indexOf("*") > 0 && tmp.indexOf(":") >0) {
				cart.putGood(tmp);

			}

		//} while (true);

	}
}
