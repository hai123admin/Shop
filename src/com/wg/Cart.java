package com.wg;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 购物车
 * 
 * @author maidou
 *
 */

public class Cart {
	List<CuXiaoInfo> cuxiaoinfo = new ArrayList(); // /促销信息
	List<Good> cart = new ArrayList(); // 商品列表
	public String coutTime = ""; // /结算日期
	public String countInfo = ""; // /优惠信息

	public double totalcount = 0.00; // /总价

	/**
	 * 单条商品添加
	 * 
	 * @param str
	 */
	public boolean putCuXiao(String str) {

		if (str != null && !str.equals("") && str.indexOf("|") > 0  && str.split("[|]").length == 3) {

			String time = str.split("[|]")[0];
			double zhekou = Double.parseDouble(str.split("[|]")[1]);
			String name = str.split("[|]")[2];
			if (Product.getTypeExist(name)) {
				CuXiaoInfo _cuxiaoinfo = new CuXiaoInfo(time, zhekou, name);
				cuxiaoinfo.add(_cuxiaoinfo);
				return true;
			} else {
				// System.out.println(" produce not exist");
				return true;
			}

		} else {
			System.out.println("input Error");
			return false;
		}
	}

	/**
	 * 单条商品添加
	 * 
	 * @param str
	 */
	public boolean putGood(String str) {

		if (str != null && !str.equals("") && str.indexOf("*") > 0
				&& str.indexOf(":") > 0) {

			int num = Integer.parseInt(str.split("[*]")[0]);
			String name = str.split("[*]")[1].split("[:]")[0].toString();

			double price = Double.parseDouble(str.split("[*]")[1].split(":")[1]
					.toString());
			if (Product.getTypeExist(name)) {
				// / 不打折是 1.00
				Good _good = new Good(Product.getType(name), name, num, price,
						1.00);
				cart.add(_good);
				return true;
			} else {
				// System.out.println(" produce not exist");
				return true;
			}

		} else {
			System.out.println("input Error");
			return false;
		}
	}

	/**
	 * 输出合计
	 */
	public void cout() {
		//System.out.println("输出");
		for (int i = 0; i < cart.size(); i++) {
			Good t = cart.get(i);

			if (cuxiaoinfo.size() > 0) {
				for (int j = 0; j < cuxiaoinfo.size(); j++) {
					CuXiaoInfo cuxiao = cuxiaoinfo.get(i);
					if (t.getType().equals(cuxiao.getType())) {
						this.totalcount += (double) t.price * t.count
								* cuxiao.discount;
					}
				}

			} else if (!countInfo.equals("") && countInfo != null) {
				// /满 1000 减 200
				double to_1k = Double.parseDouble(countInfo.split(" ")[1]);
				double dic_200 = Double.parseDouble(countInfo.split("")[2]);

				if (this.totalcount >= to_1k) {
					this.totalcount -= dic_200;
				}

			} else {
				this.totalcount += t.price * t.count;
			}
			//System.out.println(i + "==" + this.totalcount);
		}

		System.out.println(format(this.totalcount));
		//System.out.println("========================");
	}

	public void cout1() {
		System.out.println(cart.size());
		for (int i = 0; i < cart.size(); i++) {
			Good t = cart.get(i);
			System.out.println(this.totalcount+"    "+t.price+"*"+t.count);
			this.totalcount += t.price * t.count;
		}

		System.out.println(format(this.totalcount));
		System.out.println("========================");
	}

	/*
	 * 格式化 保留2位小数
	 */

	public static String format(double d) {
		DecimalFormat df = new DecimalFormat("######0.00");
		return df.format(d);
	}

	/**
	 * @return the cuxiaoinfo
	 */
	public List<CuXiaoInfo> getCuxiaoinfo() {
		return cuxiaoinfo;
	}

	/**
	 * @param cuxiaoinfo
	 *            the cuxiaoinfo to set
	 */
	public void setCuxiaoinfo(List<CuXiaoInfo> cuxiaoinfo) {
		this.cuxiaoinfo = cuxiaoinfo;
	}

	/**
	 * @return the cart
	 */
	public List<Good> getCart() {
		return cart;
	}

	/**
	 * @param cart
	 *            the cart to set
	 */
	public void setCart(List<Good> cart) {
		this.cart = cart;
	}

	/**
	 * @return the coutTime
	 */
	public String getCoutTime() {
		return coutTime;
	}

	/**
	 * @param coutTime
	 *            the coutTime to set
	 */
	public void setCoutTime(String coutTime) {
		this.coutTime = coutTime;
	}

	/**
	 * @return the countInfo
	 */
	public String getCountInfo() {
		return countInfo;
	}

	/**
	 * @param countInfo
	 *            the countInfo to set
	 */
	public void setCountInfo(String countInfo) {
		this.countInfo = countInfo;
	}

	/**
	 * @return the totalcount
	 */
	public double getTotalcount() {
		return totalcount;
	}

	/**
	 * @param totalcount
	 *            the totalcount to set
	 */
	public void setTotalcount(double totalcount) {
		this.totalcount = totalcount;
	}

}
