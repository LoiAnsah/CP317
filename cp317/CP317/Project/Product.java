package CP317;
public class Product extends Inventory implements Comparable<Product> {

    private String description = null;
    private String productName = null;
    private int supplierId = 0;

    /**
     * Supplier constructor.
     *
     * @param productId   Product ID
     * @param description Product description
     * @param price       Product price
     * @param quantity    Product quantity
     * @param status      Product status
     * @param supplierId  Supplier ID
     */

    public Product(int productId, String productName, String description, String price, String quantity, String status,
	    int supplierId) {

	    super(productId, productName, quantity, price, status, null); // Assuming Supplier class has a constructor
								      // taking supplierId

	    this.description = description;
	    this.productName = productName;
	    this.supplierId = supplierId;
    }

    /**
     **
     * Getter for description
     */

     @Override
     public int compareTo(Product otherProduct) {
        // Compare based on some criteria, such as product IDs
        return Integer.compare(this.getProductId(), otherProduct.getProductId());
    }
    public String getDescription() {
	return description;
    }

    /**
     * Getter for product name
     */

    @Override
    public String getProductName() {
	return productName;
    }

    /**
     * Getter for product status
     */

    public int getSupplierId() {
	return supplierId;
    }

    /**
     * Creates formatted string version of Product.
     */
    @Override
    public String toString() {
	return (getProductId() + ", " + getProductName() + ", " + this.description + ", " + getPrice() + ", "
		+ getQuantity() + ", " + getStatus() + ", " + this.supplierId);
    }
}
