# Online-Restaurant
Online Restaurant 


This is a Java Spring boot application i have developed, the application has the following feature sets,

* ability to draw menu item data from database and display it to user through GET request
* store and manage new items to be stored in database to show user updated items from database
* allow users to choose menu items in order to update a basket of items
* basket can calculate total basket items, total cost of all items in basket
* have a checkout screeen that shows all items in basket before user purchase items and created a digital receipt
* 5% service charge cost of total basket price is added ontop of payment when recepit is created
* create a receipt to be stored in database
* retrieves all receipts in database and use java streams to format data in table in html



0) Project code structure 

![image](https://user-images.githubusercontent.com/73298685/192267060-34c94486-0d99-4d22-8cb7-bfd11d9aee12.png)


0.2) Project html files 

![image](https://user-images.githubusercontent.com/73298685/192268539-ecdf795e-7b47-44a2-8085-e141575c7408.png)



0.3) Application properties 

![image](https://user-images.githubusercontent.com/73298685/192092805-86454ad9-70cf-4cf1-9e03-219244b8525d.png)


1) Database storing item details 

![image](https://user-images.githubusercontent.com/73298685/189692187-db1ddff4-baf8-4378-b482-82561c7ea978.png)


![image](https://user-images.githubusercontent.com/73298685/192147432-cdef21f7-8dfb-4101-9ba4-c7aa1616a17b.png)


2) DIsplay menu page 

![image](https://user-images.githubusercontent.com/73298685/189692699-5bc832d7-35f8-4755-9bde-ddd48e1e3033.png)


updated Display menu page

![image](https://user-images.githubusercontent.com/73298685/196763164-ff833751-15dd-4a79-949e-ed9961a82d51.png)



3) basket page (incomplete)

![image](https://user-images.githubusercontent.com/73298685/192092722-6ae56ead-e801-4e8a-8ae7-b3f11e4ba8d7.png)


updated basket page 


![image](https://user-images.githubusercontent.com/73298685/196763420-a5b74a22-91f4-4a86-93b2-7799f3a0fb09.png)


4) check out page (incomplete)

![image](https://user-images.githubusercontent.com/73298685/192103645-59fa0f9d-2afd-4651-ab16-51f729f0ca38.png)

updated check out page 

![image](https://user-images.githubusercontent.com/73298685/196763639-9553c051-4318-4427-a06c-b8e9e8d778e5.png)

5) view order history page 

![image](https://user-images.githubusercontent.com/73298685/196763813-71f2cd40-d067-4f3b-92b1-f7b96407f47a.png)

after order created and saved into database i retrieve all order history to display in this table here


