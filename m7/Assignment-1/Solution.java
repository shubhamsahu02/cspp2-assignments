import java.util.Scanner;
class InputValidator {
	/**.
	 * @brief [brief description]
	 * @details [long description]
	 * @param strCheck1 [description]
	 * @return [description]
	 */
	/*Write the atrributes and methods for InputValidator*/
	private String strCheck;
	private int len;
	/**.
	 * @brief [brief description]
	 * @details [long description]
	 * @param strCheck1 [description]
	 */
	InputValidator(String strCheck1) {
		strCheck = strCheck1;
		len = strCheck1.length();
	}
/**.
 * @brief [brief description]
 * @details [long description]
 * @return [description]
 */
	public boolean validateData() {
		final int b = 6;
		if(len >= b) {
			return true;
		}
		return false;
	}

}
public class Solution {
	/**
	 * @brief [brief description]
	 * @details [long description]
	 * @param String [description]
	 */
	public static void main(final String[] args) {
		/**
		 * @brief [brief description]
		 * @details [long description]
		 * @param  [description]
		 */
    	Scanner s = new Scanner(System.in);
    	String input = s.next();
    	InputValidator i = new InputValidator(input);
    	System.out.println(i.validateData());

    }

}
