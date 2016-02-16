package com.wg;

import java.util.HashMap;
import java.util.Map;

/***
 * 目录 产品 大类 和产品小类 类似 数据库
 * 
 * @author maidou
 *
 */
public class Product {

	public static enum type {
		电子, 食品, 日用品, 酒类
	}

	public static enum 电子 {
		ipad, iphone, 显示器, 笔记本电脑, 键盘
	}

	public static enum 食品 {
		面包, 饼干, 蛋糕, 牛肉鱼, 蔬菜
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public static enum 日用品 {
		餐巾纸, 收纳箱, 咖啡杯, 雨伞
	}

	public static enum 酒类 {
		啤酒, 白酒, 伏特加
	}

	public static Class[] cc = { Product.电子.class, Product.食品.class,
			Product.日用品.class, Product.酒类.class };
 

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

		System.out.println(Product.getType("咖啡杯"));

	}
}
