 /**
  * Program Name: PreferredCustomer.java
  * Purpose:      It is a subclass from RetailCustomer and represents a customer with CashBack privileges 
  * @author 	  Leen Aboukahil
  * Date: March 1, 2024
 */

public class PreferredCustomer extends RetailCustomer
{

	//Data members 
	private int cashbackRate;
	
	//5-ARG constructor 
	public PreferredCustomer(String firstName, String lastName, String customerLevel, double totalPurchases, int cashbackRate)
	{
		super(firstName, lastName, "Preferred Customer", totalPurchases);
		this.cashbackRate = cashbackRate;
       
		
	}

	/**
	 * Gets the cashbackRate of this object
	 * @param cashbackRate
	 */
	public int getCashbackRate() {
		return cashbackRate;
	}

	/**
	 * Sets the cashbackRate of this object
	 * @param cashbackRate
	 */
	public void setCashbackRate(int cashbackRate) {
		this.cashbackRate = cashbackRate;
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
		double retail = super.incentives(); 
		double cashbackIncentive = (this.getCashbackRate()/100.0) * retail;
		double totalIncentive = retail + cashbackIncentive; 
		return totalIncentive; 
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
		return "\n\n" + super.toString() + "\nCashback Rate:       " + this.cashbackRate + "%"  ;
	}
}
