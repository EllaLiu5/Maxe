/**
 * README 
 *
 * You are given the following files:
 *
 * (F1) DDBTest.java   
 *      - The Java source file
 * (F2) firstname.txt  
 *      - TXT file containing some popular first names, one name a line, with duplicate entries.
 * (F3) lastname.txt
 *      - TXT file containing some popular last names, one name a line, with duplicate entries.
 * (F4) city.txt
 *      - CSV file containing city names around the world.
 * (F5) country.txt
 *      - TXT file containing the ISO 3166 country code
 *
 * Your goals in this assignment are:
 *
 * (G1) Fix any errors in the source code. Itemize the errors you have fixed below:
 *
 *      -
 *      -
 *      -
 *
 * (G2) Create a deduplicated list of first names and last names, based on the data in (F2) and (F3).
 *      Explain how you perform deduplication for both lists below:
 *
 *      -
 *   
 * (G3) Insert all possible first name + last name combinations into a DynamoDB table. Each unique 
 *      combination becomes an item in the table. The entry should contain the following attributes
 *      - A unique ID representing the item
 *      - first name
 *      - last name
 *      - city name (randomly selected from the list of cities)
 *      - latitude
 *      - longitude
 *      - country name (the long name, not the 2-letter representation)
 *
 *      How many items do you have in your DynamoDB table? 
 *
 *      Answer: 
 *
 * (G4) Your DynamoDB table should be able to perform the following operations:
 *      - Uniquely identify a first name + last name combination using its unique ID
 *      - Search for all items using the same first name
 *      - Search for all items using the same last name
 *
 *      Please describe your DynamoDB table below:
 *
 *      -
 *      -
 *      -
 *
 * (G5) Run your code on one EC2 instance, with the instance type being m3.xlarge. Describe what efforts
 *      you have made to improve the performance of your application, including code level improvements.
 *
 *      -
 *      -
 *      -
 *
 *      How much time is needed to insert all items into your DynamoDB table?
 *
 *      Answer:     seconds
 *
 * (G6) Send this code by email for grading.
 *
 *
 * (G7) Terminate your EC2 instance. Delete your DynamoDB table. Delete any other AWS resouce you use
 *      for this assignment to avoid future charges. 
 *
 */


public class DDBtest
{

public static void mian(string[] args)
{
}

}
