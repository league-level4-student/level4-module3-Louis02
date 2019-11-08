package _02_gotta_catchem_all;

public class Test {
public static void main(String[] args) {
	Test("Hello");
}
public static String Test(String s ) {
	String ans = "";
	for(int i = s.length()-1;i>=0;i--) {
	char ch = s.charAt(i);
	ans += ch;
	}		System.out.println(ans);

	return ans;
	
}
}
