package in.vignesh.model;

public class UnitPrice {

	private double minUnit;
	private double maxUnit;
	private double price;

	public double getMinUnit() {
		return minUnit;
	}

	public double getMaxUnit() {
		return maxUnit;
	}

	public double getPrice() {
		return price;
	}

	/**
	 * Used for initializing values
	 * 
	 * @param minUnit
	 * @param maxUnit
	 * @param price
	 */
	public UnitPrice(double minUnit, double maxUnit, double price) {
		this.minUnit = minUnit;
		this.maxUnit = maxUnit;
		this.price = price;
	}

	@Override
	public String toString() {
		return "UnitPrice [ minUnit=" + minUnit + ", maxUnit=" + maxUnit + ", price=" + price + "]";
	}
}