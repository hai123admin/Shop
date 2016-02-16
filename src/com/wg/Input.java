package com.wg;


public class Input {
	 
	
	public static void input(String tmp,Cart cart,int f) {
		//System.out.println("input = "+tmp);
		//Scanner scanner = new Scanner(System.in);// 创建输入流扫描器
		 
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
			
			 
			/// 空行
			if (tmp == null || tmp.equals("") ) {
			//	continue;
			}
			// //促销信息
			if (tmp != null && !tmp.equals("") && tmp.split("[|]").length == 3) {
				cart.putCuXiao(tmp);

			}  
			 
			// / 添加 商品
			if (tmp.indexOf("*") > 0 && tmp.split("[:]").length == 2) {
				cart.putGood(tmp);
			}

			// //结算日期
			if (tmp != null && !tmp.equals("") && tmp.length() ==10 ) {
				cart.setCoutTime(tmp);
				 
			} 

			// //优惠 信息
			if (tmp != null && !tmp.equals("") && tmp.indexOf(" ") > 0
					&& tmp.split(" ").length == 3) {
				cart.setCountInfo(tmp);
	
				
			} 
			// //输出
			if (tmp.equals("输出")) {
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
			// if (tmp.indexOf(" ")>0 && tmp.split(" ")[1].equals("输出")) {
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
