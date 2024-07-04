Project Name
Sace lab demo project
Introduction
This project provides a Java test automation framework utilizing Maven for build management, TestNG for test execution, and Extent Reports for comprehensive and visually appealing test results.
Prerequisites
•	Java Development Kit (JDK): Ensure you have the latest JDK installed. Download and install it from the official Oracle website: https://www.oracle.com/java/technologies/downloads/
•	Maven: Download and install Maven from the official Apache Maven website: https://maven.apache.org/download.cgi
•	TestNG: Download the TestNG JAR file from the official website: http://testng.org/testng-eclipse/download.html
Installation
1.	Clone or Download the Project: Obtain the project files from your preferred version control system (e.g., Git) or download the project as a ZIP archive.
2.	Set Up Maven: Configure your environment variables (PATH) to include the Maven installation directory.


Test Strategy for sauce demo App

1.	Scope:
a.	Products module
b.	Cart module
c.	Product details module
2.	Test Approach:
a.	Test planning: the SRS will be reviewed and try to find any gaps in the requirement to be addressed in the early stage
b.	Test design: the tests will be developed based on the requirements of the sauce app
c.	 Test execution: Tests will be executed manually and tests with high priority will be automated 
3.	Testing types:
a.	Only functional testing will be covered
4.	Testing tools:
a.	Selenium- Java will be used for automation
b.	Jira will be used as testing management tool
5.	Configuration:
a.	Operating system: Windows 11
b.	Browser: Chrome













Test cases for sauce lab demo App

Test id: 001 (automated)
Test title: Verify user can add product to the cart
Preconditions:
1.	User is logged in with valid account 
2.	There are products created by the admin
Steps:
1.	Open the products page
2.	Find any product and click on add to cart
Expected results:
1.	Product is added successfully and remove button is displayed



Test id: 002 (automated)
Test title: Verify user can remove product to the cart
Preconditions:
1.	User is logged in with valid account 
2.	There are products created by the admin
3.	A product is added before to the cart
Steps:
1.	Open the products page
2.	Find the product already added in the precondition
3.	Click on remove button
Expected results:
1.	Product is removed successfully and add to cart button is displayed

Test id: 003 
Test title: Verify product details are displayed correctly in the products page
Preconditions:
1.	User is logged in with valid account 
2.	There are products created by the admin
Steps:
1.	Open the products page
2.	Find any product and check the details listed in the products page
Expected results:
1.	product title is displayed successfully
2.	product description is displayed successfully
3.	product picture is displayed successfully
4.	product price is displayed successfully


Test id: 004 
Test title: Verify product details are displayed correctly in product details page
Preconditions:
1.	User is logged in with valid account 
2.	There are products created by the admin
Steps:
1.	Open the products page
2.	Click on a product
3.	Check the details listed 
Expected results:
1.	product title is displayed successfully
2.	product description is displayed successfully
3.	product picture is displayed successfully
4.	product price is displayed successfully




Test id: 005 (Automated)
Test title: Verify the products added to the cart are listed successfully in the cart page
Preconditions:
1.	User is logged in with valid account 
2.	There are products created by the admin
Steps:
1.	Open the products page
2.	Add more than 1 product to the cart
3.	Open the cart page and check the products in the cart
Expected results:
1.	The products added to the cart are listed successfully

Test id: 006 
Test title: Verify the products added to the cart can be removed from the cart page
Preconditions:
1.	User is logged in with valid account 
2.	There are products created by the admin
Steps:
1.	Open the products page
2.	Add more than 1 product to the cart
3.	Open the cart page
4.	Click on remove button for a product
Expected results:
1.	The product is removed successfully from the cart



Test id: 007 
Test title: Verify the number on cart badge is increased when products are added
Preconditions:
1.	User is logged in with valid account 
2.	There are products created by the admin
Steps:
1.	Open the products page
2.	Add 2 products to the cart
3.	Check the number displayed on the cart badge
Expected results:
1.	The number displayed on the cart badge should be 2 as the products added are 2


Test id: 008 
Test title: Verify the products added to the cart can be removed from the cart page
Preconditions:
1.	User is logged in with valid account 
2.	There are products created by the admin
Steps:
1.	Open the products page
2.	Add 2 products to the cart
3.	Remove one of the added products
4.	Check the number displayed on the cart badge
Expected results:
1.	The number displayed on the cart badge should be 1 as only 1 product is in the cart

