package CP317;

public class Supplier extends Inventory{

    private int supplierId = 0;
    private String address = null;
    private String phone = null;
    private String email = null;

    

    public Supplier(int supplierId, String supplierName, String address, String phone,String email) {

	    
      super(0, null, null, null, null, supplierName);

	    this.supplierId = supplierId;
	    this.address = address;
	    this.phone = phone;
      this.email = email;
    }

    /**
     * getter for supplier ID
     */

     public int getSupplierId() {
      return supplierId;
  }

  /**
   * getter for supplier address
   */

  public String getaddress() {
      return address;
  }

  /**
   * getter for supplier phone number
   */

  public String getPhone() {
      return phone;
  }

  /**
   * getter for supplier email
   */

  public String getEmail() {
      return email;
  }

  /**
   * Creates formatted string version of Person.
   */
  @Override
  public String toString() {
      return (this.supplierId + ", " + getSupplierName() + ", " + this.address + ", " + this.phone + ", "
              + this.email);
  }

}