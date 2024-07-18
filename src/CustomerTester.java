/**
  * Program Name: Leen Aboukhalil
  * Purpose:      it is a tester class to test all the hierarchy classes to model a real world customer data storage application
  * @author 	  Leen Aboukahil
  * Date: March 1 , 2024
 */

public class CustomerTester {

	public static void main(String[] args) {		
		 
    //create an array of type Customer 
		Customer [] customerArray = new Customer[3];
	
		//create the customer objects 
		Customer busCust = new BusinessCustomer("Mike", "Holmes", "Business Customer" ,"Home Depot" , 10, 3105.50);
		Customer retCust = new RetailCustomer("Dev", "Gelda", "Retail Customer", 11200.00 );
		Customer preCust = new PreferredCustomer("Wei", "Ping", "Preferred Customer", 6456.85, 5);

        //assign the customer object to the array element 
		customerArray[0] = busCust;
		customerArray[1] = retCust;
		customerArray[2] = preCust; 
		
		//printing the file introduction
		System.out.println("Welcome to the Customer tester!");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("This program will instantiate objects of the Customer hierarchy and test their methods");
		System.out.println("---------------------------------------------------------------------------------------");
		
		//using for loop to print all the object inside the array to show POLYMORPHISM action
		for (int i = 0; i < customerArray.length; i++)
		{
			System.out.print(customerArray[i].toString());
		}
		
		//using for loop to print the first, last name and the incentives of each object 
		System.out.println("\n");
		for (int i = 0 ; i < customerArray.length ; i++)
		{
			System.out.println (customerArray[i].getFirstName() + " " + customerArray[i].getLastName() 
					+ String.format(" earns a discount incentive of $%,.2f" , customerArray[i].incentives()));
		}
		
		//more new customer objects by using early binding 
		BusinessCustomer busCust2 = new BusinessCustomer("Tristan", "Lee", "Business Customer", "for Starbucks",15, 9875.25);
		RetailCustomer retCust2 = new RetailCustomer("Carlos", "Beltran" ,"Retail Customer" , 3100.50);
		PreferredCustomer preCust2 = new PreferredCustomer("Arti" , "Patel", "Preferred Customer", 10450.00, 10);

	    //printing toString() method for every object 
		System.out.println();
		System.out.print(busCust2);
		System.out.print(retCust2);
		System.out.print(preCust2);
		
		//Using setter method to set new values to the busCust2 object 
        busCust2.setTotalPurchases(8895.00);
        busCust2.setDiscountRate(12);
		
        //Using setter method to set new values to the retCust2
        retCust2.setTotalPurchases(100500);
	
        //Using setter method to set new values to the preCust2
        preCust2.setTotalPurchases(14987.24);
		preCust2.setLastName("Patel-Ruhil");
		preCust2.setCashbackRate(13);
		
		System.out.println("\n");
		System.out.print(busCust2.toString());
		System.out.print(retCust2.toString());
		System.out.print(preCust2.toString());
	}

}
