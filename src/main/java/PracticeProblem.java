/**
 * File: Else if
 * Author: Visaagan Gunabalachandran
 * Date Created: March 25, 2026
 * Date Last Modified: March 25, 2026
 */






public class PracticeProblem {

	public static String evenOrOdd(int num) {
		String result;
		result = "1";
		if (num % 2 == 0) {
			result = "Even";
		} if (num % 2 != 0){
			result = "Odd";
		} else if (num == 0){
			result = "Zero";
	}	
	return result;
}

	public static String positiveOrNegative(int num) {
		String result;
		result = "1";
		if (num > 0) {
			result = "Positive";
		} if (num < 0){
			result = "Negative";
		} else if (num == 0){
			result = "Zero";
	}	
	return result;
}
	public static String pluralize(String word) {
	word = word.toLowerCase();
	if (word.endsWith("ife")) {
        return "ives";
    } else if (word.endsWith("ey")) {
        return "eys";
    } else if (word.endsWith("y")) {
        return "ies";
    } else {
        return "s";
    }
}
		}




