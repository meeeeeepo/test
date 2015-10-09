import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Read two strings from user, first string is the full string, the second is the substring. 
 * 			Checks, if the second string is the substring/prefix/suffix of the first one.	\
 * @author PavelDunyashev
 */
public class stringParse {

	public static void main(String[] args) {
		/**
		 * Two string variables, where program reads full string and substring 		
		 */
		String fullstring = null;
		String substring = null;
		/**
		 * Shows a message to user to make him enter full string
		 */
		System.out.println("Enter full string:");
		/**
		 * Program reads the user input and assign it to the variable fullstring
		 */
		try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    fullstring = bufferRead.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		/**
		 * Shows a message to user to make him enter substring
		 */
		System.out.println("Enter substring:");
		/**
		 * Reads the user input and assign it to the variable substring
		 */
		try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    substring = bufferRead.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		/**
		 * Checks if the user input was empty.
		 */
		if((substring != null) && (fullstring != null))
		{
			/**
			 * Checks if the second string was the substring of the first one, if so,
			 * 			checks if the substring is the prefix or suffix.
			 * After all checks shows user the result message.
			 * @see stringParse#is_Substring
			 * @see stringParse#is_Prefix
			 * @see stringParse#is_Suffix
			 */
			if(is_Substring(fullstring, substring))
			{				
				if (is_Prefix(fullstring, substring))
				{
					System.out.println("The substring: '" + substring + "' is the preffix\r\nof the string: '" + fullstring + "'");
				}
				else if (is_Suffix(fullstring, substring))
				{
					System.out.println("The substring: '" + substring + "' is the suffix\r\nof the string: '" + fullstring + "'");
				}
				else
				{
					System.out.println("The substringg: '" + substring + "' is the substring\r\nof the string : '" + fullstring + "'");
				}
			}
			else
			{
				System.out.println("The substring: '" + substring + " 'is not is not contained\r\nin the string: '" + fullstring + "'");
			}
		}
	}
	/**
	 * Checks if the substring is the prefix of the string	
	 * @param full_string First parameter of the method, containing full string
	 * @param sub_string Second parameter of the method, containing substring
	 * @return Check result, true if substring is the prefix, false if not
	 * @see stringParse#is_Substring
	 * @see stringParse#is_Suffix
	 */
	public static boolean is_Prefix(String full_string, String sub_string)
	{
		return full_string.startsWith(sub_string);
	}
	/**
	 * Checks if the substring is the suffix of the string	
	 * @param full_string First parameter of the method, containing full string
	 * @param sub_string Second parameter of the method, containing substring
	 * @return Check result, true if substring is the suffix, false if not
	 * @see stringParse#is_Substring
	 * @see stringParse#is_Prefix
	 */
	public static boolean is_Suffix(String full_string, String sub_string)
	{
		return full_string.endsWith(sub_string);
	}
	/**
	 * Checks if the full string contains the sub string	
	 * @param full_string First parameter of the method, containing full string
	 * @param sub_string Second parameter of the method, containing sub string
	 * @return Check result, true if full string contains substring, false if not
	 * @see stringParse#is_Prefix
	 * @see stringParse#is_Suffix
	 */
	public static boolean is_Substring(String full_string, String sub_string)
	{
		return full_string.contains(sub_string.toLowerCase());
	}
}

	
