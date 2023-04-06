package testleaf;

public class ChangeOddToUpperCase {
	
	static String approachOne(String s) {
		String output = "";
		for(int i = 0; i<s.length();i++) {
			if(i%2 != 0) {
			char c = s.charAt(i);
			output += Character.toUpperCase(c);
			}
			else {
				
				output += s.charAt(i);
			}
		}
		
		return output;
	}
	
	static String approachTwo(String s) {
		String output = "";
		for(int i = 0; i<s.length();i++) {
			if(i%2 != 0) {
			int c =  s.charAt(i) - 32;
			output += (char) c;
			}
			else {
				
				output += s.charAt(i);
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		String name = "changeMe";
		
		System.out.print(approachTwo(name));
	}

}
