package com.wg;

public class Good {

	public String type = ""; // / 商品类别
	public String name=""; // / 商品名称
	public int count = 0; // /物品数量
	public double price = 0.00; // / 单价

	public double discount = 1.00; // / 折扣

	public Good(String type, String name, int count, double price,
			double discount) {

		this.type = type;
		this.name = name;
		this.count = count;
		this.price = price;
		this.discount = discount;
	}

	public Good(String name, int count, double price) {
		this.name = name;
		this.count = count;
		this.price = price;

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

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
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

}
