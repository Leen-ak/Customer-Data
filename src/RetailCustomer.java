 /**
  * Program Name: RetailCustomer.java
  * Purpose:      A subclass of Customer and represents a customer who frequents this company regularly
  * @author 	  Leen Aboukahil
  * Date: March 1, 2024
*/

public class RetailCustomer extends Customer {

	//Data members 
	private double totalPurchases;

	
	public RetailCustomer(String firstName, String lastName, String customerLevel, double totalPurchases)
	{
		super(firstName, lastName, customerLevel); 
		this.totalPurchases = totalPurchases; 

	}


	/**
	 * gets the totalPurchases of this object
	 * @param totalPurchases
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
	  
	Method Name:	findDiscountRate()
	Purpose:        to determine the discountRate based on the totalPurchases 
	Accepts:        Nothing
	Returns:        Integer
	Coder:          LEEN
	Date:           FMarch 1, 2024
	*/
	
	public int findDiscountRate() 
	{
		int discountRate = 0;
		if(this.totalPurchases > 10000)
		{
		  discountRate = 15; 	
		}
		else if(this.totalPurchases > 5000)
		{
			discountRate = 10;
		}
		else if(this.totalPurchases > 1000)
		{
			discountRate = 5;
		}
		
		return discountRate; 
	}
	
	
	/**
	  
	Method Name:	incentives()
	Purpose:        To get the result of the incentives 
	Accepts:        Nothing
	Returns:        Integer
	Coder:          LEEN
	Date:           March 1, 2024
	*/
	public double incentives()
	{   
		return this.totalPurchases * (double)this.findDiscountRate() / 100 ; 
		
	}
      
	
	 
	/**
	  
	Method Name:	toString()
	Purpose:        to override toString method
	Accepts:        Nothing
	Returns:        String
	Coder:          LEEN
	Date:           March 1, 2024
	*/
	public String toString()
	{
		return  super.toString()+ "\n" + this.getCustomerLevel() + String.format("\nTotal Purchases:     $%,.2f", this.totalPurchases) + 
                  "\nDiscount Rate:       " + this.findDiscountRate() + "%" + String.format("\nDiscount Incentive:  $%,.2f", this.incentives())
                		  + String.format("\nNet Purchases:       $%,.2f", (this.totalPurchases - this.incentives())); 		
 	}
}


