 /**
  * Program Name: Customer.java
  * Purpose: A superclass to holds fields and methods that will implement to all subclasses
  * @author 	  Leen Aboukahil
  * Date:    March 1, 2024
 */

public abstract class Customer {

	//Data members 
	private String firstName;
	private String lastName;
	private String customerID;
	private String customerLevel; 
	protected double netPurchases;
	
	//3- ARG constructor 
	public Customer(String firstName, String lastName, String customerLevel)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerLevel = customerLevel;
		setCustomerID();	
	}

	/**
	 * Gets the firstName of this object  
	 * @return firstName
	 */
	
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the firstName of this object
	 * @param firstName
	 */
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//Generate getter and setter
	/**
	 * Gets the lastName of this object  
	 * @return lastName
	 */
	
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the lastName of this object
	 * @param lastName
	 */
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Sets the customerID of this object
	 * @param customerID
	 */
	private void setCustomerID() {	
		
		//Declare the variable 
		 final int MIN = 0;
		 final int MAX = 9; 
		 int numberID=0; 
		 String storeID= "" ;
		
		 //the length of the customer id should be less than 4
		 String lastNameID; 
		if(lastName.length() >= 4) 
		{
		   //Get the first 4 letter from the customer last name and convert it to upper case
		    lastNameID = lastName.substring(0,4).toUpperCase(); 
		
		   //Get 5 random integer for the customer ID 
		   for(int i = 0 ; i < 5 ; i++)
		   {
		   numberID = (int)(Math.random() *(MAX - MIN + 1)) + MIN;
		   storeID += numberID ; 
		   }  
		   this.customerID = (lastNameID + "-" + storeID); 
		}
		else if(lastName.length() == 3)
			{
			   lastNameID = lastName.substring(0,3).toUpperCase(); 
			   for(int i = 0 ; i < 5 ; i++)
			   {
			   numberID = (int)(Math.random() *(MAX - MIN + 1)) + MIN;
			   storeID += numberID; 
			   }
			   
			   this.customerID = (lastNameID + "X-" + storeID); 
			}
		else if(lastName.length() == 2)
			{
			   lastNameID = lastName.substring(0,2).toUpperCase(); 
			   for(int i = 0 ; i < 5 ; i++)
			   {
			   numberID = (int)(Math.random() *(MAX - MIN + 1)) + MIN;
			   storeID += numberID; 
			   }
			   
			   this.customerID = (lastNameID + "XX-" + storeID); 
			}
		else if(lastName.length() == 1) 
			{
			lastNameID = lastName.substring(0,1).toUpperCase(); 
			   for(int i = 0 ; i < 5 ; i++)
			   {
			   numberID = (int)(Math.random() *(MAX - MIN + 1)) + MIN;
			   storeID += numberID; 
			   }
			   
			   this.customerID = (lastNameID + "XXX-" + storeID); 
			}		
	}

	/**
	 * Gets the customerID of this object  
	 * @return customerID
	 */
	
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * Gets the customerLevel of this object  
	 * @return customerLevel
	 */
	
	public String getCustomerLevel() {
		return customerLevel;
	}

	/**
	 * Sets the customerLevel of this object
	 * @param customerLevel
	 */
	
	/**
	  
	Method Name:	incentives
	Purpose:        customer level present the name of the subclasses 
	Accepts:        String
	Returns:        void
	Coder:          LEEN
	Date:           March 1, 2024
	*/
	public void setCustomerLevel(String customerLevel)
	{
		this.customerLevel = customerLevel; 
	}
	
	/**
	  
	Method Name:	incentives
	Purpose:        abstract method in the super class
	Accepts:        Nothing
	Returns:        double
	Coder:          LEEN
	Date:           March 1, 2024
	*/
	public abstract double incentives();
	
	/**
	  
	Method Name:    toString
	Purpose:        Override the string method to print the information
	Accepts:        Nothing
	Returns:        String 
	Coder:          LEEN
	Date:           March 1, 2024
	*/
	public String toString()
    {
		return this.getCustomerID()+ ", " + this.firstName + " " + this.lastName;
	}
	
	
	
}
