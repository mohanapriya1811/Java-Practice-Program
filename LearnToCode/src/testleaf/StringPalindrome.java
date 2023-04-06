package testleaf;

public class StringPalindrome {
	
	static boolean approachOne(String name) {
		String s = name.replace(" ", "").toLowerCase().trim();
		String output = "";
		
		for(int i = s.length()-1; i>=0; i--) {
			output += s.charAt(i);
		}
		if(output.equals(s))
		return true;	
		else
		return false;
	}

	public static void main(String[] args) {
		//String name = "madam";
		String name = "race car";
		System.out.println(approachOne(name));
	}

}
