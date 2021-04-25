package ademoglu;

import java.util.Scanner;

public class IvirZivir {
	
	/** Bu method Scanner class ile okunan veriyi boolean a cevirir
	 * 
	 */
	public static boolean stringtenBooleanCevirici(String bool) {
		
		if(bool.equalsIgnoreCase("evet")) {
			return true;
		}else if(bool.equalsIgnoreCase("hayir")) {
			return false;
		}else {
			throw new IllegalArgumentException("Yalniz \"Evet\" yada \"Hayir\" cevabini kabul edilir");	
		}
	}
}
