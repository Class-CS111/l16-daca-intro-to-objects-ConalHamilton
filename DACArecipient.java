/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * Author: Conal Hamilton
 *
 *	@version 1.0
 **/

/* UML CLASS DIAGRAM:
-----------------------------------------
DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountryOfOrigin() : String
+ getBirthday() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char

+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void

+ setAll(surname : String, givenName : String, uscisNumber : String, countryOfOrigin : String, birthday : int, validFromDate : int, expirationDate : int, sex : char) : void
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	private String surname;
	private String givenName;
	private String uscisNumber;
	private String countryOfOrigin;
	private int birthday;
	private int validFromDate;
	private int expirationDate;
	private char sex;

	/***** ACCESSORS *****/
	//TODO: Write the getter for each instance variable. Remember to include documentation for each method.
	/**
	 * Returns surname of DACArecipient object
	 * 
	 * @return String with surname
	 */
	public String getSurname()
	{
		return this.surname;
	}
	/**
	 * Returns the given name of DACArecipient object
	 * 
	 * @return String with given name
	 */
	public String getGivenName()
	{
		return this.givenName;
	}
	/**
	 * Returns the USCIS number of the DACArecipient object
	 * 
	 * @return String with USCIS number
	 */
	public String getUscisNumber()
	{
		return this.uscisNumber;
	}
	/**
	 * Retuns the country of origin of the DACArecipient object
	 * 
	 * @return String with country of origin
	 */
	public String getCountryOfOrigin()
	{
		return this.countryOfOrigin;
	}
	/**
	 * Returns the birthday of the DACArecipient object
	 * 
	 * @return int with birthday as a Julian Day Number
	 */
	public int getBirthday()
	{
		return this.birthday;
	}
	/**
	 * Returns the valid from date of the DACArecipient object
	 * 
	 * @return int with valid from date as a Julian Day Number
	 */
	public int getValidFromDate()
	{
		return this.validFromDate;
	}
	/**
	 * Returns the expiration date of the DACArecipient object
	 * 
	 * @return int with expiration date as a Julian Day Number
	 */
	public int getExpirationDate()
	{
		return this.expirationDate;
	}
	/**
	 * Returns the sex of the DACArecipient object
	 * 
	 * @return char representing sex
	 */
	public char getSex()
	{
		return this.sex;
	}

	/***** MUTATORS *****/
	//TODO: Write the setter for each instance variable. Remember to include documentation for each method.
	/**
	 * Sets surname to given parameter value
	 * 
	 * @param surname String containing last name
	 */
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	/**
	 * Sets givenName to given parameter value
	 * 
	 * @param givenName String containing given name
	 */
	public void setGivenName(String givenName)
	{
		this.givenName = givenName;
	}
	/**
	 * Sets uscisNumber to given parameter value
	 * 
	 * @param uscisNumber String containing USCIS number
	 */
	public void setUscisNumber(String uscisNumber)
	{
		this.uscisNumber = uscisNumber;
	}
	/**
	 * Sets countryOfOrigin to given parameter value
	 * 
	 * @param countryOfOrigin String containing country of origin
	 */
	public void setCountryOfOrigin(String countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}
	/**
	 * Sets birthday to given parameter value
	 * 
	 * @param birthday int of birthdate as Julian Day Number
	 */
	public void setBirthday(int birthday)
	{
		this.birthday = birthday;
	}
	/**
	 * Sets validFromDate to given parameter value
	 * 
	 * @param validFromDate int of valid from date as Julian Day Number
	 */
	public void setValidFromDate(int validFromDate)
	{
		this.validFromDate = validFromDate;
	}
	/**
	 * Sets expirationDate to given parameter value
	 * 
	 * @param expirationDate int of expiration date as Julian Day Number
	 */
	public void setExpirationDate(int expirationDate)
	{
		this.expirationDate = expirationDate;
	}
	/**
	 * Sets sex to given parameter value
	 * 
	 * @param sex char representing sex
	 */
	public void setSex(char sex)
	{
		this.sex = sex;
	}
	//TODO: Write the setAll method. Remember to include documentation.
	/**
	 * Sets all DACArecipient variables to given parameter values
	 * 
	 * @param surname String containing surname
	 * @param givenName String containing first name
	 * @param uscisNumber String containing USCIS number
	 * @param countryOfOrigin String containing country of origin
	 * @param birthday int representing birthday as a Julian Day Number
	 * @param validFromDate int representing valid from date as a Julian Day Number
	 * @param expirationDate int representing expiration date as a Julian Day Number
	 * @param sex char representing sex
	 */
	public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
	{
		this.setSurname(surname);
		this.setGivenName(givenName);
		this.setUscisNumber(uscisNumber);
		this.setCountryOfOrigin(countryOfOrigin);
		this.setBirthday(birthday);
		this.setValidFromDate(validFromDate);
		this.setExpirationDate(expirationDate);
		this.setSex(sex);
	}
}
