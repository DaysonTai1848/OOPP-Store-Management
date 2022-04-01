
public abstract class Product {
	
	private String productNo;
	private String productName;
	private String productManufacturer;
	private int productQuantity; 
	private double price;
	private boolean status;
	
	// Default constructor
	public Product() {
		productNo = "";
		productName = "";
		productManufacturer = ""; 
		productQuantity = 0;
		price = 0.0;
		status = true; 
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public double getInventoryValue() {
		return price * productQuantity;
	}
	
	public void addStock(int addAmount) {
		this.productQuantity = this.productQuantity + addAmount;
	}
	
	public void deductStock(int deductAmount) {
		this.productQuantity = this.productQuantity - deductAmount;
	}

	@Override
	public String toString(){
		// String information = "Item number :" + this.getInventoryValue();
		return 
			  "Item number         :" + this.getInventoryValue()
			+ "Product number      :" + this.getProductNo()
			+ "Product manufacturer:" + this.getProductManufacturer()
			+ "Quantity available  :" + this.getProductQuantity()
			+ "Price (RM)          :" + this.getPrice()
			+ "Inventory value (RM):" + this.getInventoryValue()
			+ "Product status      :" + this.isStatus();
	}  

}
