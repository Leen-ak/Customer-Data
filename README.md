# Customer-Data-Storage

**Overview**
This Java program models a real-world customer data storage application. The project demonstrates object-oriented programming principles by creating a hierarchy of customer types, each with unique properties and methods. The application includes a main tester class to instantiate and manipulate objects from the customer hierarchy, showcasing inheritance, polymorphism, and encapsulation.

**Description**
The program features a Customer superclass and three subclasses: 
BusinessCustomer, RetailCustomer, and PreferredCustomer. 

1. **Customer:** The abstract base class includes attributes such as first name, last name, customer ID, customer level, and net purchases.
  It provides methods to get and set these attributes, along with an abstract incentives method to be implemented by subclasses.

2. **BusinessCustomer:** Inherits from Customer and adds attributes for company name, discount rate, and total purchases.
     It calculates incentives based on the discount rate and total purchases, overriding the toString method to provide detailed information about the business customer.

3. **RetailCustomer:** Inherits from Customer and includes an attribute for total purchases.
     It determines the discount rate based on the total purchase amount and calculates incentives accordingly.
     It also overrides the toString method to provide detailed information about the retail customer.

4. **PreferredCustomer:** Inherits from RetailCustomer and adds a cashback rate attribute.
   It calculates incentives by combining the retail discount and cashback incentives.
  This class also overrides the toString method in including cashback rate information.

**Example Output**
![image](https://github.com/user-attachments/assets/60ae9d36-12b9-42d0-9afd-c81ab6645507)
![image](https://github.com/user-attachments/assets/ce7f5a3b-2c74-4677-b4e1-379497edab7c)


**JavaDoc Pages**
![image](https://github.com/user-attachments/assets/41655464-61b8-469d-b2ed-b0131712897d)


**Features**
1. **Polymorphism:** Demonstrates polymorphism by storing different customer objects in an array of type Customer and invoking overridden methods.
2. **Encapsulation:** Uses private and protected access modifiers to encapsulate data and provide public getter and setter methods for accessing and modifying attributes.
3. **Inheritance:** Utilizes inheritance to create a hierarchy of customer types, reducing code duplication and enhancing code maintainability.
   
**Usage**
It prints detailed information about each customer and calculates their incentives. 
The tester class also demonstrates the use of polymorphism by invoking methods on the Customer array and showing the output of overridden methods.

**Technical Details**
Language: Java
Concepts: OOP (Object-Oriented Programming), inheritance, polymorphism, encapsulation
