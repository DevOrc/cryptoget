package com.noahcharlton.cryptoget;

public class Currency {

	private String id;
	private String name;
	private String symbol;
	private String rank;
	private String priceUSD;

	public Currency() {

	}

	public Currency(String id, String name, String symbol, String rank, String price_usd) {
		super();
		this.id = id;
		this.name = name;
		this.symbol = symbol;
		this.rank = rank;
		this.priceUSD = price_usd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPriceUSD(String priceUSD) {
		this.priceUSD = priceUSD;
	}

	public String getName() {
		return name;
	}
	
	public String getPriceUSD() {
		return priceUSD;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((priceUSD == null) ? 0 : priceUSD.hashCode());
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (priceUSD == null) {
			if (other.priceUSD != null)
				return false;
		} else if (!priceUSD.equals(other.priceUSD))
			return false;
		if (rank == null) {
			if (other.rank != null)
				return false;
		} else if (!rank.equals(other.rank))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Currency [id=" + id + ", name=" + name + ", symbol=" + symbol + ", rank=" + rank + ", priceUSD="
				+ priceUSD + "]";
	}
	
	

}
