package starterFiles; 

/**
 * Created by Raymond Cheung on 9/29/17.
 */

public class RCheungNameCase implements NameCase {
    public static void main (String [] args)
    {
    	NameCase test = new RCheungNameCase();
    	System.out.println("This is where you should test your code.");
    	System.out.println(test.titlecase("RAYMOND"));
    	System.out.println(test.swapcase("RAYMOND"));
    	System.out.println(test.alternatingcase("RAYMOND"));
    }

	/**
	 * This method returns a string where only the first letter is uppercase and the rest are lowercase.
	 * @param  name the string to be changed
	 * @return 		returns the formatted string
	 */
    
    public String titlecase(String name)
    {
    	return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
    
	/**
	 * This method returns a string where only the first letter is lowercase and the rest are uppercase.
	 * @param  name the string to be changed
	 * @return 		returns the formatted string
	 */
    
    public String swapcase(String name)
    {
    	return name.substring(0,1).toLowerCase() + name.substring(1).toUpperCase();
    }
    
	/**
	 * This method returns a string with alternating lowercase and uppercase letters.
	 * @param  name		the string to be changed
	 * @return result	returns the formatted string
	 */
    
    public String alternatingcase(String name)
    {
    	String result = "";
    	for (int i = 0; i < name.length(); i++) {
    		if (i %  2 == 1) {
    			result = result + name.substring(i,i+1).toUpperCase();
    		}
    		else {
    			result = result + name.substring(i,i+1).toLowerCase();
    		}	
       }
  		return result;
    }
}
