package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(Double d1, Double d2) throws Exception {
		if (d2 == 0.0) {
			throw new IllegalArgumentException();
		}
		Double ans = 0.0;
		ans = d1 / d2;

		return ans;

	}
	public static String reverseString (String s) throws Exception{
	if(s.equals("")) {
		throw new IllegalArgumentException();
	}
		String ans = "";
		for(int i = s.length()-1;i>=0;i--) {
		char ch = s.charAt(i);
		ans += ch;
		}		System.out.println(ans);

		return ans;
		
	}
}
