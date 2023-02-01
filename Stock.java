package Com.BridgeLabs.Stock;
public class Stock {
	private int numberOfStock ;
	private String ShareName ;
	private int numberOfShares ;
	private double sharePrice;
	private double total ;
	private double totalStock ;
	public Stock(String ShareName,int numberOfShares,double sharePrice,double total){
		this.numberOfStock=numberOfStock;
		this.ShareName=ShareName;
		this.numberOfShares=numberOfShares;
		//this.numberOfStock=numberOfStock;
		this.sharePrice=sharePrice;
		this.numberOfStock=numberOfStock;
		this.total=total;
		
		
		
	}
	public Stock(double totalStock) {
		
		this.totalStock=totalStock;
	}
	public int getNumberOfStock() {
		return numberOfStock;
	}
	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}
	public String getShareName() {
		return ShareName;
	}
	public void setShareName(String shareName) {
		ShareName = shareName;
	}
	public double getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getTotalStock() {
		return totalStock;
	}
	public void setTotalStock(double totalStock) {
		this.totalStock = totalStock;
	}
}
