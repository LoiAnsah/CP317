package CP317;
public class Inventory {


    private int productId = 0;
    private String productName = null;
    private String quantity = null;
    private String price = null;
    private String status = null;
    private String supplierName = null;

    /**
     * Supplier constructor.
     *
     * @param productId   Product ID
     * @param description Product name
     * @param price       Product quantity
     * @param quantity    Product price
     * @param status      Product stat
     * @param supplierId  Supplier ID
     */

  public Inventory(int productId, String productName, String quantity, String price, String status,
	    String supplierName) {

	this.productId = productId;
	this.productName = productName;
	this.quantity = quantity;
	this.price = price;
	this.status = status;
	this.supplierName = supplierName;
    }

    /**
     **
     * Getter for product ID
     */
    public int getProductId() {
	return productId;
    }

    /**
     **
     * Getter for product Name
     *
     * public String getProductName() { return productName; }
     * 
     * 
     * /** Getter for product description
     */
    public String getProductName() {
	return productName;
    }

    /**
     * Getter for product quantity
     */

    public String getQuantity() {
	return quantity;
    }

    /**
     * Getter for product price
     */
    public String getPrice() {
	return price;
    }

    /**
     * Getter for product status
     */
    public String getStatus() {
	return status;
    }

    /**
     * Getter for product status
     */
    public String getSupplierName() {
	return supplierName;
    }

    /**
     * Creates formatted string version of Product.
     */
    @Override
    public String toString() {
	return (this.productId + ", " + this.productName + ", " + this.quantity + ", " + this.price + ", " + this.status
		+ ", " + this.supplierName);
    }

  
}
