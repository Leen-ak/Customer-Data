 /**
  * Program Name: BusinessCustomer.java
  * Purpose:      A subclass of the Customer class and represents a customer who has an associated company name
  * @author 	  Leen Aboukahil
  * Date:         March 1, 2024
 */

public class BusinessCustomer extends Customer {
	
	//Data members
	private String companyName;
	private int discountRate;
	private double totalPurchases;

	public BusinessCustomer(String firstName, String lastName, String customerLevel, String companyName, int discountRate, double totalPurchases)
	{
		//calling the super class 
		super(firstName, lastName, "Business Customer");
		this.companyName = companyName;
		this.discountRate = discountRate;
		this.totalPurchases = totalPurchases;
	    this.netPurchases = this.totalPurchases - this.incentives();
	}

	//Generate  setters and getters 
	/**
	 * Gets the companyName of this object  
	 * @return companyName
	 */
	
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Sets the companyName of this object
	 * @param companyName
	 */
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * Gets the discountRate of this object  
	 * @return discountRate
	 */
	
	public int getDiscountRate() {
		return discountRate;
	}

	/**
	 * Sets the discountRate of this object
	 * @param discountRate
	 */
	
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	/**
	 * Gets the totalPurchases of this object  
	 * @return totalPurchases
	 */
	
	public double getTotalPurchases() {
		return totalPurchases;
	}

	/**
	 * Sets the totalPurchases of this object
	 * @param totalPurchases
	 */
	
	public void setTotalPurchases(double totalPurchases) {
		this.totalPurchases = totalPurchases;
	}
	
	/**
	  
	Method Name:	incentives
	Purpose:        to calculate tax of the total purchases
	Accepts:        Nothing
	Returns:        double
	Coder:          LEEN
	Date:           March 1, 2024
	*/
	public double incentives()
	{
		
		return ((double)this.discountRate / 100) * this.totalPurchases; 
	}
	
	

	/**
	  
	Method Name:	toString
	Purpose:        to override toString method
	Accepts:        Nothing
	Returns:        String
	Coder:          LEEN
	Date:           March 1, 2024
	*/
	public String toString()
	{
		return super.toString() + "\n" + this.getCustomerLevel() + " " + this.companyName + String.format("\nTotal Purchases:     $%,.2f", this.totalPurchases) 
		+ "\nDiscount Rate:       " + this.discountRate + "%" + String.format("\nDiscount Incentive:  $%,.2f", this.incentives()) + 
		String.format("\nNet Purchases:       $%,.2f", (this.totalPurchases - this.incentives()))+"\n\n";
				
				
	}

}
