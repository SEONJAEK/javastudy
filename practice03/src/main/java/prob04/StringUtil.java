package prob04;

public class StringUtil {
	public static String concatenate(String[] array) {
		String result ="";
		int num = array.length;
		for(int i=0; i<num; i++) {
			result += array[i];
		}
		return result;
	}
}
