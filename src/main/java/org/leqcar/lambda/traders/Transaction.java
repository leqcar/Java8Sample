package org.leqcar.lambda.traders;

public class Transaction {

	private final Trader trader;
	private final int year;
	private final int value;
	
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	/**
	 * @return the trader
	 */
	public Trader getTrader() {
		return trader;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value="
				+ value + "]";
	}
		 
}
