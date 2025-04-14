/********************************************
*	DEVELOPER:	Conal Hamilton
* COLLABORATORS: None
*	LAST MODIFIED:	13 April 2025
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient test1 = new DACArecipient();
    DACArecipient test2 = new DACArecipient();
    test1.setSurname("John");
    test1.setGivenName("Smith");
    test1.setUscisNumber("11-2-333");
    test1.setCountryOfOrigin("New Zealand");
    test1.setBirthday(1111111);
    test1.setValidFromDate(2222222);
    test1.setExpirationDate(3333333);
    test1.setSex('M');
    test2.setAll("Mendez", "Javier", "56-3-445", "Venezuela", 2451564, 3956753, 3956840, 'M');
    System.out.println("ID 1:");
    System.out.println("Surname: " + test1.getSurname());
    System.out.println("Given Name: " + test1.getGivenName());
    System.out.println("USCIS Number: " + test1.getUscisNumber());
    System.out.println("Country of Origin: " + test1.getCountryOfOrigin());
    System.out.println("Birthday in JDN: " + test1.getBirthday());
    System.out.println("Valid from Date in JDN: " + test1.getValidFromDate());
    System.out.println("Expiration Date in JDN: " + test1.getExpirationDate());
    System.out.println("Sex: " + test1.getSex());
    System.out.println("----------------------------");
    System.out.println("ID 2:");
    System.out.println("Surname: " + test2.getSurname());
    System.out.println("Given Name: " + test2.getGivenName());
    System.out.println("USCIS Number: " + test2.getUscisNumber());
    System.out.println("Country of Origin: " + test2.getCountryOfOrigin());
    System.out.println("Birthday in JDN: " + test2.getBirthday());
    System.out.println("Valid from Date in JDN: " + test2.getValidFromDate());
    System.out.println("Expiration Date in JDN: " + test2.getExpirationDate());
    System.out.println("Sex: " + test2.getSex());
  }
}
