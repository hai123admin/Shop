package com.wg;

/***
 * 促销信息
 * 
 * @author maidou
 *
 */
public class CuXiaoInfo {

	public String time; // /促销日期

	public double discount = 1.00; // / 折扣

	public String type = ""; // / 商品类别

	public CuXiaoInfo(String time, double discount, String type) {
		super();
		this.time = time;
		this.discount = discount;
		this.type = type;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * @param discount
	 *            the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
